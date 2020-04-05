package com.example.lesson.mvp.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lesson.R;
import com.example.lesson.app.base.MySupportFragment;
import com.example.lesson.app.eventbus.ChangeTag;
import com.example.lesson.di.component.DaggerVideoComponent;
import com.example.lesson.mvp.contract.VideoContract;
import com.example.lesson.mvp.presenter.VideoPresenter;
import com.example.lesson.mvp.ui.adapter.Videodapter;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;

import org.simple.eventbus.Subscriber;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import timber.log.Timber;

import static com.jess.arms.utils.Preconditions.checkNotNull;

public class VideoFragment extends MySupportFragment<VideoPresenter> implements VideoContract.View {

    @BindView(R.id.rv_video)
    RecyclerView rvVideo;
    @BindView(R.id.refresh_layout)
    SwipeRefreshLayout refreshLayout;

    public static VideoFragment newInstance() {
        VideoFragment fragment = new VideoFragment();
        return fragment;
    }

    @Override
    public void setupFragmentComponent(@NonNull AppComponent appComponent) {
        DaggerVideoComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .view(this)
                .build()
                .inject(this);
    }

    @Override
    public View initView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_video, container, false);
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        initRefreshLayout();
    }

    @Override
    public void setData(@Nullable Object data) {

    }

    @Override
    public void showLoading() {
        refreshLayout.setRefreshing(true);
    }

    @Override
    public void hideLoading() {
        refreshLayout.setRefreshing(false);
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

    }

    @Override
    public void onSupportVisible() {
        super.onSupportVisible();
        mPresenter.getVideo();
    }

    @Override
    public void setAdapter(Videodapter adapter) {
        rvVideo.setLayoutManager(new LinearLayoutManager(mContext));
        rvVideo.setAdapter(adapter);
    }

    private void initRefreshLayout() {
        refreshLayout.setColorSchemeColors(ArmsUtils.getColor(_mActivity, R.color.unSelectColor));
        refreshLayout.setOnRefreshListener(() -> mPresenter.getVideo());
    }

}
