package com.example.lesson.mvp.presenter;

import android.app.Application;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.lesson.R;
import com.example.lesson.app.data.entity.CategoryBean;
import com.example.lesson.app.data.entity.SubTagsBean;
import com.example.lesson.mvp.ui.adapter.CategoryLeftAdapter;
import com.jess.arms.integration.AppManager;
import com.jess.arms.di.scope.ActivityScope;
import com.jess.arms.mvp.BasePresenter;
import com.jess.arms.http.imageloader.ImageLoader;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;
import me.jessyan.rxerrorhandler.handler.ErrorHandleSubscriber;

import javax.inject.Inject;

import com.example.lesson.mvp.contract.CategoryContract;
import com.jess.arms.utils.RxLifecycleUtils;
import com.zhy.view.flowlayout.TagAdapter;

import java.util.List;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 12/18/2019 11:12
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
@ActivityScope
public class CategoryPresenter extends BasePresenter<CategoryContract.Model, CategoryContract.View> {
    @Inject
    RxErrorHandler mErrorHandler;
    @Inject
    Application mApplication;
    @Inject
    ImageLoader mImageLoader;
    @Inject
    AppManager mAppManager;

    CategoryBean.DataBean.StagesBean bean = null;
    CategoryLeftAdapter categoryLeftAdapter;
    TagAdapter tagAdapter;

    @Inject
    public CategoryPresenter(CategoryContract.Model model, CategoryContract.View rootView) {
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

    public void getCategory(int leftId, int tagId) {
        mModel.getCategory()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .compose(RxLifecycleUtils.bindToLifecycle(mRootView))
                .subscribe(new ErrorHandleSubscriber<CategoryBean>(mErrorHandler) {
                    @Override
                    public void onNext(CategoryBean categoryBean) {
                        bean = categoryBean.getData().getStages();
                        // 左边列表
                        setLeftAdapter(bean.get_$154271985().getSubTags(), tagId);
                        // 初始左边列表选中位置以及右边tag数据
                        setLeftIdx(leftId, tagId);
                    }
                });
    }

    private void setLeftIdx(int leftId, int tagId) {
        for (int i = 0; i < categoryLeftAdapter.getItemCount(); i++) {
            if (leftId == categoryLeftAdapter.getData().get(i).getTagId()) {
                // 左边列表的位置以及对应的数据
                categoryLeftAdapter.idx = i;
                setTagDate(i, leftId, tagId);
            }
        }
    }

    // 右边tag数据
    private void setTagDate(int position, int leftId, int tagId) {
        switch (position) {
            case 0:
                mRootView.setTagAdapter(bean.get_$382633109().getSubTags(), leftId, tagId);
                break;
            case 1:
                mRootView.setTagAdapter(bean.get_$1773877388().getSubTags(), leftId, tagId);
                break;
            case 2:
                mRootView.setTagAdapter(bean.get_$1003657994().getSubTags(), leftId, tagId);
                break;
            case 3:
                mRootView.setTagAdapter(bean.get_$842753927().getSubTags(), leftId, tagId);
                break;
            case 4:
                mRootView.setTagAdapter(bean.get_$340228195().getSubTags(), leftId, tagId);
                break;
            case 5:
                mRootView.setTagAdapter(bean.get_$1832454640().getSubTags(), leftId, tagId);
                break;
        }
    }

    // 分类左边列表
    private void setLeftAdapter(List<SubTagsBean> subTags, int tagId) {
        if (categoryLeftAdapter == null) {
            categoryLeftAdapter = new CategoryLeftAdapter(R.layout.item_category_left, subTags);
        }
        mRootView.setLeftAdapter(categoryLeftAdapter);
        categoryLeftAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                categoryLeftAdapter.idx = position;
                categoryLeftAdapter.notifyDataSetChanged();
                int leftId = subTags.get(position).getTagId();
                setTagDate(position, leftId, tagId);
            }
        });
    }
}
