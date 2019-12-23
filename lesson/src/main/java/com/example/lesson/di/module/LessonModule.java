package com.example.lesson.di.module;

import dagger.Binds;
import dagger.Module;

import com.example.lesson.mvp.contract.LessonContract;
import com.example.lesson.mvp.model.LessonModel;


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
@Module
public abstract class LessonModule {

    @Binds
    abstract LessonContract.Model bindTabChildModel(LessonModel model);
}