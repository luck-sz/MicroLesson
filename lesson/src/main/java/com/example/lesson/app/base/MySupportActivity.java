package com.example.lesson.app.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.View;

import com.gyf.immersionbar.ImmersionBar;
import com.jess.arms.base.BaseFragment;
import com.jess.arms.base.delegate.IActivity;
import com.jess.arms.integration.cache.Cache;
import com.jess.arms.integration.cache.CacheType;
import com.jess.arms.integration.lifecycle.ActivityLifecycleable;
import com.jess.arms.mvp.IPresenter;
import com.jess.arms.utils.ArmsUtils;
//import com.noober.background.BackgroundLibrary;
import com.trello.rxlifecycle2.android.ActivityEvent;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.Subject;
import me.yokeyword.fragmentation.SupportActivity;

import static com.jess.arms.utils.ThirdViewUtil.convertAutoView;

public abstract class MySupportActivity<P extends IPresenter> extends SupportActivity implements IActivity, ActivityLifecycleable {
    protected final String TAG = this.getClass().getSimpleName();
    private final BehaviorSubject<ActivityEvent> mLifecycleSubject = BehaviorSubject.create();
    private Cache<String, Object> mCache;
    private Unbinder mUnbinder;
    @Inject
    @Nullable
    protected P mPresenter;//如果当前页面逻辑简单, Presenter 可以为 null

    @NonNull
    @Override
    public synchronized Cache<String, Object> provideCache() {
        if (mCache == null) {
            mCache = ArmsUtils.obtainAppComponentFromContext(this).cacheFactory().build(CacheType.ACTIVITY_CACHE);
        }
        return mCache;
    }

    @NonNull
    @Override
    public final Subject<ActivityEvent> provideLifecycleSubject() {
        return mLifecycleSubject;
    }

    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        View view = convertAutoView(name, context, attrs);
        return view == null ? super.onCreateView(name, context, attrs) : view;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        BackgroundLibrary.inject(this);
        super.onCreate(savedInstanceState);
        try {
            int layoutResID = initView(savedInstanceState);
            //如果initView返回0,框架则不会调用setContentView(),当然也不会 Bind ButterKnife
            if (layoutResID != 0) {
                setContentView(layoutResID);
                //绑定到butterknife
                mUnbinder = ButterKnife.bind(this);
            }
        } catch (Exception e) {
            if (e instanceof InflateException) throw e;
            e.printStackTrace();
        }
        initImmersionBar();
        initData(savedInstanceState);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mUnbinder != null && mUnbinder != Unbinder.EMPTY)
            mUnbinder.unbind();
        this.mUnbinder = null;
        if (mPresenter != null)
            mPresenter.onDestroy();//释放资源
        this.mPresenter = null;
    }

    /**
     * 初始化沉浸式
     * Init immersion bar.
     */
    protected void initImmersionBar() {
        //设置共同沉浸式样式
        ImmersionBar.with(this).statusBarDarkFont(true).init();
    }

    @Override
    public boolean useEventBus() {
        return true;
    }

    /**
     * 这个 {@link Activity} 是否会使用 {@link Fragment}, 框架会根据这个属性判断是否注册 {@link android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks}
     * 如果返回 {@code false}, 那意味着这个 {@link Activity} 不需要绑定 {@link Fragment}, 那你再在这个 {@link Activity} 中绑定继承于 {@link BaseFragment} 的 {@link Fragment} 将不起任何作用
     *
     * @return 返回 {@code true} (默认为 {@code true}), 则需要使用 {@link Fragment}
     */
    @Override
    public boolean useFragment() {
        return true;
    }
}