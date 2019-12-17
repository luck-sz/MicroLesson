package com.example.lesson.di.component;

import dagger.BindsInstance;
import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.example.lesson.di.module.TabChildModule;
import com.example.lesson.mvp.contract.TabChildContract;

import com.jess.arms.di.scope.FragmentScope;
import com.example.lesson.mvp.ui.fragment.TabChildFragment;


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
@Component(modules = TabChildModule.class, dependencies = AppComponent.class)
public interface TabChildComponent {
    void inject(TabChildFragment fragment);

    @Component.Builder
    interface Builder {
        @BindsInstance
        TabChildComponent.Builder view(TabChildContract.View view);

        TabChildComponent.Builder appComponent(AppComponent appComponent);

        TabChildComponent build();
    }
}