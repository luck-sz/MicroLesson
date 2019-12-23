package com.example.lesson.mvp.model;

import android.app.Application;

import com.example.lesson.app.data.api.service.ApiService;
import com.example.lesson.app.data.entity.RecommendBean;
import com.example.lesson.app.data.entity.RecommendMultipleItem;
import com.example.lesson.app.data.entity.TagSuccessBean;
import com.google.gson.Gson;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import com.jess.arms.di.scope.FragmentScope;

import javax.inject.Inject;

import com.example.lesson.mvp.contract.RecommendContract;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 12/19/2019 10:20
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
@FragmentScope
public class RecommendModel extends BaseModel implements RecommendContract.Model {
    @Inject
    Gson mGson;
    @Inject
    Application mApplication;

    List<RecommendMultipleItem> list;

    @Inject
    public RecommendModel(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mGson = null;
        this.mApplication = null;
        this.list = null;
    }

    @Override
    public Observable<RecommendBean> getRecommend() {
        return mRepositoryManager.obtainRetrofitService(ApiService.class)
                .getRecommend();
    }

    @Override
    public List<RecommendMultipleItem> setData(RecommendBean bean) {
        list = new ArrayList<>();
        list.add(new RecommendMultipleItem(RecommendMultipleItem.HEAD_ITEM, true, "名师推荐"));
        for (int i = 0; i < bean.getData().getZhuanlan().size(); i++) {
            list.add(new RecommendMultipleItem(RecommendMultipleItem.FAMOUS_ITEM, bean.getData().getZhuanlan().get(i)));
        }
        list.add(new RecommendMultipleItem(RecommendMultipleItem.HEAD_ITEM, true, "系列好课"));
        for (int i = 0; i < bean.getData().getSerial().size(); i++) {
            list.add(new RecommendMultipleItem(RecommendMultipleItem.SERIES_ITEM, bean.getData().getSerial().get(i)));
        }
        list.add(new RecommendMultipleItem(RecommendMultipleItem.HEAD_ITEM, true, "精选好课"));
        for (int i = 0; i < bean.getData().getCourse().size(); i++) {
            list.add(new RecommendMultipleItem(RecommendMultipleItem.CHOSEN_ITEM, bean.getData().getCourse().get(i)));
        }
        return list;
    }
}