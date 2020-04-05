package com.example.lesson.mvp.presenter;

import android.app.Application;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import android.widget.Toolbar;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.lesson.R;
import com.example.lesson.app.data.entity.RecommendBean;
import com.example.lesson.app.data.entity.VideoBean;
import com.example.lesson.mvp.ui.activity.DetailActivity;
import com.example.lesson.mvp.ui.activity.PlayerActivity;
import com.example.lesson.mvp.ui.adapter.Videodapter;
import com.jess.arms.integration.AppManager;
import com.jess.arms.di.scope.FragmentScope;
import com.jess.arms.mvp.BasePresenter;
import com.jess.arms.http.imageloader.ImageLoader;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;
import me.jessyan.rxerrorhandler.handler.ErrorHandleSubscriber;
import timber.log.Timber;

import javax.inject.Inject;

import com.example.lesson.mvp.contract.VideoContract;
import com.jess.arms.utils.RxLifecycleUtils;

import java.util.List;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 12/24/2019 12:00
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
@FragmentScope
public class VideoPresenter extends BasePresenter<VideoContract.Model, VideoContract.View> {
    @Inject
    RxErrorHandler mErrorHandler;
    @Inject
    Application mApplication;
    @Inject
    ImageLoader mImageLoader;
    @Inject
    AppManager mAppManager;
    Videodapter videodapter;

    @Inject
    public VideoPresenter(VideoContract.Model model, VideoContract.View rootView) {
        super(model, rootView);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mErrorHandler = null;
        this.mAppManager = null;
        this.mImageLoader = null;
        this.mApplication = null;
    }

    public void getVideo() {
        mModel.getVideo()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe(disposable -> {
                    mRootView.showLoading();
                })
                .doFinally(() -> {
                    mRootView.hideLoading();
                })
                .compose(RxLifecycleUtils.bindToLifecycle(mRootView))
                .subscribe(new ErrorHandleSubscriber<VideoBean>(mErrorHandler) {
                    @Override
                    public void onNext(VideoBean videoBean) {
                        setAdapter(videoBean.getData().getVideo());
                    }
                });
    }

    private void setAdapter(List<VideoBean.DataBean.PlayerBean> list) {
        if (videodapter == null) {
            videodapter = new Videodapter(R.layout.item_video, list);
        }
        mRootView.setAdapter(videodapter);
        videodapter.setNewData(list);
        videodapter.setOnItemClickListener((adapter, view, position) -> {
            Intent intent = new Intent(mApplication, DetailActivity.class);
            intent.putExtra(DetailActivity.PARAM_TITLE, list.get(position).getTitle());
            intent.putExtra(DetailActivity.PARAM_URL, list.get(position).getUrl());
            mRootView.launchActivity(intent);
        });
        videodapter.setOnItemChildClickListener((adapter, view, position) -> {
            Intent intent = new Intent(mApplication, PlayerActivity.class);
            intent.putExtra("PlayBean", list.get(position));
            mRootView.launchActivity(intent);
        });
    }
}
