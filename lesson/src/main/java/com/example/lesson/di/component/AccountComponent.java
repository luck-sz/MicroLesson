package com.example.lesson.di.component;

import dagger.BindsInstance;
import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.example.lesson.di.module.AccountModule;
import com.example.lesson.mvp.contract.AccountContract;

import com.jess.arms.di.scope.FragmentScope;
import com.example.lesson.mvp.ui.fragment.AccountFragment;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 12/17/2019 11:05
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
@FragmentScope
@Component(modules = AccountModule.class, dependencies = AppComponent.class)
public interface AccountComponent {
    void inject(AccountFragment fragment);

    @Component.Builder
    interface Builder {
        @BindsInstance
        AccountComponent.Builder view(AccountContract.View view);

        AccountComponent.Builder appComponent(AppComponent appComponent);

        AccountComponent build();
    }
}