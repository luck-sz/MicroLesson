package com.example.lesson.mvp.model;

import android.app.Application;

import com.example.lesson.app.data.api.service.ApiService;
import com.example.lesson.app.data.entity.LessonBean;
import com.example.lesson.app.data.entity.LessonMultipleItem;
import com.example.lesson.mvp.contract.LessonContract;
import com.google.gson.Gson;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import com.jess.arms.di.scope.FragmentScope;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;
import timber.log.Timber;


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
public class LessonModel extends BaseModel implements LessonContract.Model {
    @Inject
    Gson mGson;
    @Inject
    Application mApplication;
    List<LessonMultipleItem> list;

    @Inject
    public LessonModel(IRepositoryManager repositoryManager) {
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
    public Observable<LessonBean> getLesson(String tagId) {
        return mRepositoryManager.obtainRetrofitService(ApiService.class)
                .getLesson(tagId);
    }

    @Override
    public List<LessonMultipleItem> setData(LessonBean bean) {
        list = new ArrayList<>();
        for (int i = 0; i < bean.getData().getColumn().size(); i++) {
            list.add(new LessonMultipleItem(LessonMultipleItem.HEAD_ITEM, true, bean.getData().getColumn().get(i).getTitle()));
            for (int j = 0; j < bean.getData().getColumn().get(i).getCourseCards().size(); j++) {
                list.add(new LessonMultipleItem(LessonMultipleItem.CONTENT_ITEM, bean.getData().getColumn().get(i).getCourseCards().get(j)));
            }
        }
        return list;
    }
}