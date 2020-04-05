package com.example.lesson.mvp.ui.activity;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.lesson.app.data.entity.VideoBean;
import com.example.lesson.mvp.ui.view.SmartPickVideo;
import com.gyf.immersionbar.ImmersionBar;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;

import com.example.lesson.di.component.DaggerPlayerComponent;
import com.example.lesson.mvp.contract.PlayerContract;
import com.example.lesson.mvp.presenter.PlayerPresenter;

import com.example.lesson.R;
import com.shuyu.gsyvideoplayer.GSYVideoManager;
import com.shuyu.gsyvideoplayer.utils.OrientationUtils;


import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import timber.log.Timber;

import static com.jess.arms.utils.Preconditions.checkNotNull;

public class PlayerActivity extends BaseActivity<PlayerPresenter> implements PlayerContract.View {

    @BindView(R.id.video_player)
    SmartPickVideo videoPlayer;

    OrientationUtils orientationUtils;

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerPlayerComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .view(this)
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.activity_player; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        initImmersionBar();
        if (getIntent() != null) {
            VideoBean.DataBean.PlayerBean playerBean = (VideoBean.DataBean.PlayerBean) getIntent().getSerializableExtra("PlayBean");
            assert mPresenter != null;
            mPresenter.playerVideo(playerBean);
        }
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
    public void initPlayer(VideoBean.DataBean.PlayerBean playerBean) {
        List<VideoBean.DataBean.PlayerBean> list = new ArrayList<>();
        list.add(playerBean);
        videoPlayer.setUp(list, true, playerBean.getTitle());
        //增加title
        videoPlayer.getTitleTextView().setVisibility(View.VISIBLE);
        //设置返回键
        videoPlayer.getBackButton().setVisibility(View.VISIBLE);
        //设置旋转
        orientationUtils = new OrientationUtils(this, videoPlayer);
        //设置全屏
        orientationUtils.resolveByClick();
        //是否可以滑动调整
        videoPlayer.setIsTouchWiget(true);
        videoPlayer.getFullscreenButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orientationUtils.resolveByClick();
                }
        });
        //设置返回按键功能
        videoPlayer.getBackButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        videoPlayer.startPlayLogic();
    }

    @Override
    protected void onPause() {
        super.onPause();
        videoPlayer.onVideoPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        videoPlayer.onVideoResume();
    }

    @TargetApi(Build.VERSION_CODES.KITKAT)
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (orientationUtils != null)
            orientationUtils.releaseListener();
    }

    @Override
    public void onBackPressed() {
        //先返回正常状态
//        if (orientationUtils.getScreenType() == ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE) {
//            videoPlayer.getFullscreenButton().performClick();
//            return;
//        }
        //释放所有
        videoPlayer.setVideoAllCallBack(null);
        GSYVideoManager.releaseAllVideos();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
                overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_out);
            }
        }, 500);
    }

    private void initImmersionBar() {
        ImmersionBar.with(this).statusBarDarkFont(false).init();
    }
}
