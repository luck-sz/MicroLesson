package com.example.lesson.mvp.presenter;

import android.app.Application;

import com.example.lesson.app.data.entity.LessonBean;
import com.example.lesson.app.data.entity.LessonMultipleItem;
import com.example.lesson.app.data.entity.RecommendMultipleItem;
import com.example.lesson.mvp.contract.LessonContract;
import com.example.lesson.mvp.ui.adapter.LessonMultipleItemAdapter;
import com.example.lesson.mvp.ui.adapter.RecommendMultipleItemAdapter;
import com.jess.arms.integration.AppManager;
import com.jess.arms.di.scope.FragmentScope;
import com.jess.arms.mvp.BasePresenter;
import com.jess.arms.http.imageloader.ImageLoader;
import com.jess.arms.utils.RxLifecycleUtils;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;
import me.jessyan.rxerrorhandler.handler.ErrorHandleSubscriber;
import timber.log.Timber;

import javax.inject.Inject;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 12/17/2019 11:41
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
@FragmentScope
public class LessonPresenter extends BasePresenter<LessonContract.Model, LessonContract.View> {
    @Inject
    RxErrorHandler mErrorHandler;
    @Inject
    Application mApplication;
    @Inject
    ImageLoader mImageLoader;
    @Inject
    AppManager mAppManager;

    LessonMultipleItemAdapter adapter;
    List<LessonMultipleItem> list;

    @Inject
    public LessonPresenter(LessonContract.Model model, LessonContract.View rootView) {
        super(model, rootView);
        list = new ArrayList<>();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mErrorHandler = null;
        this.mAppManager = null;
        this.mImageLoader = null;
        this.mApplication = null;
        this.adapter = null;
        this.list = null;
    }

    public void getLesson(String tagId) {
        mModel.getLesson(tagId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe(disposable -> {
                    mRootView.showLoading();
                })
                .doFinally(() -> {
                    mRootView.hideLoading();
                })
                .compose(RxLifecycleUtils.bindToLifecycle(mRootView))
                .subscribe(new ErrorHandleSubscriber<LessonBean>(mErrorHandler) {
                    @Override
                    public void onNext(LessonBean lessonBean) {
                        mRootView.setBanner(lessonBean.getData().getBanner());
                        list = mModel.setData(lessonBean);
                        setAdapter(list);
                    }
                });
    }

    private void setAdapter(List<LessonMultipleItem> list) {
        if (adapter == null) {
            adapter = new LessonMultipleItemAdapter(list);
            mRootView.addBanner(adapter);
        }
        adapter.setNewData(list);
        mRootView.setContent(adapter);
    }
}
