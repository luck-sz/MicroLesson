package com.example.lesson.mvp.ui.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.lesson.R;
import com.example.lesson.app.base.MySupportActivity;
import com.example.lesson.di.component.DaggerDetailComponent;
import com.example.lesson.mvp.contract.DetailContract;
import com.example.lesson.mvp.presenter.DetailPresenter;
import com.gyf.immersionbar.ImmersionBar;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.just.agentweb.AgentWeb;
import com.just.agentweb.LollipopFixedWebView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.jess.arms.utils.Preconditions.checkNotNull;

public class DetailActivity extends MySupportActivity<DetailPresenter> implements DetailContract.View {

    public static final String PARAM_TITLE = "param_title";
    public static final String PARAM_URL = "param_url";

    @BindView(R.id.detail_title)
    TextView mTitle;
    @BindView(R.id.web_view_content)
    LinearLayout mWebView;
    private AgentWeb mAgentWeb;

    private String url;
    private String title;

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerDetailComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .view(this)
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.activity_detail; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        initStatusBar();
        if (getIntent() != null) {
            url = getIntent().getStringExtra(PARAM_URL);
            title = getIntent().getStringExtra(PARAM_TITLE);
            mTitle.setText(title);
        }
        initWebView();
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

    @Override
    protected void onPause() {
        mAgentWeb.getWebLifeCycle().onPause();
        super.onPause();

    }

    @Override
    protected void onResume() {
        mAgentWeb.getWebLifeCycle().onResume();
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        mAgentWeb.getWebLifeCycle().onDestroy();
        super.onDestroy();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (mAgentWeb.handleKeyEvent(keyCode, event)) {
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    private void initStatusBar() {
        ImmersionBar.with(this)
                .keyboardEnable(true)
                .fitsSystemWindows(true)
                .statusBarDarkFont(true)
                .statusBarColor("#FFFFFF")
                .init();
    }

    // 初始化WebView
    private void initWebView() {
        mAgentWeb = AgentWeb.with(this)
                .setAgentWebParent(mWebView, new LinearLayout.LayoutParams(-1, -1))
                .useDefaultIndicator()
                .setWebView(new LollipopFixedWebView(this))
                .createAgentWeb()
                .ready()
                .go(url);
    }

    @OnClick(R.id.iv_back)
    public void onViewClicked() {
        finish();
    }
}
