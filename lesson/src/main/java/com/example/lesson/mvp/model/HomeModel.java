package com.example.lesson.mvp.model;

import android.app.Application;

import com.example.lesson.app.data.api.service.ApiService;
import com.example.lesson.app.data.entity.CategoryBean;
import com.example.lesson.app.data.entity.RecommendBean;
import com.example.lesson.app.data.entity.TagSuccessBean;
import com.google.gson.Gson;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import com.jess.arms.di.scope.FragmentScope;

import javax.inject.Inject;

import com.example.lesson.mvp.contract.HomeContract;
import com.vondear.rxtool.RxSPTool;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import timber.log.Timber;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 12/17/2019 10:22
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
@FragmentScope
public class HomeModel extends BaseModel implements HomeContract.Model {
    @Inject
    Gson mGson;
    @Inject
    Application mApplication;

    @Inject
    public HomeModel(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mGson = null;
        this.mApplication = null;
    }

    @Override
    public Observable<RecommendBean> getRecommend(List<Integer> list, boolean isRefresh) {
        // 每次获取最新数据
        Observable<RecommendBean> mNet = mRepositoryManager.obtainRetrofitService(ApiService.class)
                .changeState(list)
                .flatMap(new Function<TagSuccessBean, ObservableSource<RecommendBean>>() {
                    @Override
                    public ObservableSource<RecommendBean> apply(TagSuccessBean tagSuccessBean) throws Exception {
                        if (tagSuccessBean.getCode().equals("0")) {
                            return mRepositoryManager.obtainRetrofitService(ApiService.class)
                                    .getRecommend()
                                    .doAfterNext(new Consumer<RecommendBean>() {
                                        @Override
                                        public void accept(RecommendBean recommendBean) throws Exception {
                                            // 在这里保存数据
                                            RxSPTool.putJSONCache(mApplication, "recommend", mGson.toJson(recommendBean));
                                        }
                                    });
                        } else {
                            return null;
                        }
                    }
                });
        // 加载本地数据
        Observable<RecommendBean> mCache = Observable.create(new ObservableOnSubscribe<RecommendBean>() {
            @Override
            public void subscribe(ObservableEmitter<RecommendBean> emitter) throws Exception {
                String data = RxSPTool.readJSONCache(mApplication, "recommend");
                RecommendBean bean = mGson.fromJson(data, RecommendBean.class);
                if (bean != null) {  // 判断本地数据是否为空
                    emitter.onNext(bean);
                } else {
                    emitter.onComplete();
                }
            }
        });

        if (isRefresh) {
            return mNet;
        } else {
            return Observable.concat(mCache, mNet);
        }
    }

}