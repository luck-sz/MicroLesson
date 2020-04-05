package com.example.lesson.mvp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;

import com.example.lesson.R;
import com.example.lesson.app.base.MySupportActivity;
import com.example.lesson.di.component.DaggerMainComponent;
import com.example.lesson.mvp.contract.MainContract;
import com.example.lesson.mvp.presenter.MainPresenter;
import com.example.lesson.mvp.ui.fragment.AccountFragment;
import com.example.lesson.mvp.ui.fragment.HomeFragment;
import com.example.lesson.mvp.ui.fragment.MineFragment;
import com.gyf.immersionbar.ImmersionBar;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.yokeyword.fragmentation.SupportFragment;
import timber.log.Timber;

import static com.jess.arms.utils.Preconditions.checkNotNull;

public class MainActivity extends MySupportActivity<MainPresenter> implements MainContract.View {

    @BindView(R.id.bottomNav)
    BottomNavigationViewEx bottomNav;
    private SupportFragment[] mFragments = new SupportFragment[3];

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerMainComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .view(this)
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.activity_main; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        // 初始化状态栏
        initStatusBar();
        // 初始化fragment
        initFragment();
        // 底部切换
        initBottomNav();
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showMessage(@NonNull String message) {
        checkNotNull(message);
        ArmsUtils.snackbarText(message);
    }

    @Override
    public void launchActivity(@NonNull Intent intent) {
        checkNotNull(intent);
        ArmsUtils.startActivity(intent);
    }

    @Override
    public void killMyself() {
        finish();
    }

    private void initStatusBar() {
        ImmersionBar.with(this)
                .keyboardEnable(true)
                .statusBarDarkFont(true, 0.2f)
                .init();
    }

    private void initFragment() {
        SupportFragment firstFragment = findFragment(HomeFragment.class);
        if (firstFragment == null) {
            mFragments[0] = HomeFragment.newInstance();
            mFragments[1] = MineFragment.newInstance();
            mFragments[2] = AccountFragment.newInstance();
            loadMultipleRootFragment(R.id.frame_content, 0,
                    mFragments[0],
                    mFragments[1],
                    mFragments[2]
            );
        } else {
            mFragments[0] = firstFragment;
            mFragments[1] = findFragment(MineFragment.class);
            mFragments[2] = findFragment(AccountFragment.class);
        }
    }

    private void initBottomNav() {
        bottomNav.enableAnimation(false);
        bottomNav.setCurrentItem(0);
        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.nav_find:
                        showHideFragment(mFragments[0]);
                        break;
                    case R.id.nav_mine:
                        showHideFragment(mFragments[1]);
                        break;
                    case R.id.nav_account:
                        showHideFragment(mFragments[2]);
                        break;
                    default:
                        break;
                }
                return true;
            }
        });
    }
}
