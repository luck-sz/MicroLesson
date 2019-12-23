package com.example.lesson.di.component;

import dagger.BindsInstance;
import dagger.Component;

import com.example.lesson.mvp.contract.LessonContract;
import com.jess.arms.di.component.AppComponent;

import com.example.lesson.di.module.LessonModule;

import com.jess.arms.di.scope.FragmentScope;
import com.example.lesson.mvp.ui.fragment.LessonFragment;


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
@Component(modules = LessonModule.class, dependencies = AppComponent.class)
public interface LessonComponent {
    void inject(LessonFragment fragment);

    @Component.Builder
    interface Builder {
        @BindsInstance
        LessonComponent.Builder view(LessonContract.View view);

        LessonComponent.Builder appComponent(AppComponent appComponent);

        LessonComponent build();
    }
}