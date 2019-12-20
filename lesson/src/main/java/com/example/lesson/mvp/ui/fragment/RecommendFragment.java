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
import com.example.lesson.app.data.entity.RecommendBean;
import com.example.lesson.di.component.DaggerRecommendComponent;
import com.example.lesson.mvp.contract.RecommendContract;
import com.example.lesson.mvp.presenter.RecommendPresenter;
import com.example.lesson.mvp.ui.adapter.RecommendMultipleItemAdapter;
import com.example.lesson.mvp.ui.view.BannerViewHolder;
import com.example.lesson.mvp.ui.view.RecycleViewDivider;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.zhouwei.mzbanner.MZBannerView;
import com.zhouwei.mzbanner.holder.MZHolderCreator;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import timber.log.Timber;

import static com.jess.arms.utils.Preconditions.checkNotNull;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 12/19/2019 10:20
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
public class RecommendFragment extends MySupportFragment<RecommendPresenter> implements RecommendContract.View {

    @BindView(R.id.rv_recommend)
    RecyclerView rvRecommend;
    @BindView(R.id.refresh_layout)
    SwipeRefreshLayout mRefreshLayout;

    View view;
    View mBannerView;
    MZBannerView mMyBanner;
    RecycleViewDivider divider;

    public static RecommendFragment newInstance() {
        RecommendFragment fragment = new RecommendFragment();
        return fragment;
    }

    @Override
    public void setupFragmentComponent(@NonNull AppComponent appComponent) {
        DaggerRecommendComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .view(this)
                .build()
                .inject(this);
    }

    @Override
    public View initView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_recommend, container, false);
        return view;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        initRefreshLayout();
        initBannerView();
        mPresenter.initAdapter();
    }

    @Override
    public void setData(@Nullable Object data) {

    }

    @Override
    public void showLoading() {
        mRefreshLayout.setRefreshing(true);
    }

    @Override
    public void hideLoading() {
        mRefreshLayout.setRefreshing(false);
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
    public void setBanner(List<RecommendBean.DataBean.HeadBean> list) {
        mMyBanner.setIndicatorVisible(false);
        mMyBanner.setDelayedTime(3000);
        mMyBanner.setDuration(1500);
        mMyBanner.setBannerPageClickListener(new MZBannerView.BannerPageClickListener() {
            @Override
            public void onPageClick(View view, int position) {
                showMessage("当前位置:" + position);
            }
        });
        mMyBanner.setPages(list, new MZHolderCreator<BannerViewHolder>() {
            @Override
            public BannerViewHolder createViewHolder() {
                return new BannerViewHolder();
            }
        });
        mMyBanner.start();
    }

    @Override
    public void addBanner(RecommendMultipleItemAdapter adapter) {
        if (adapter.getHeaderLayoutCount() < 1) {
            adapter.addHeaderView(mBannerView);
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        mMyBanner.pause();//暂停轮播
    }

    @Override
    public void onResume() {
        super.onResume();
        mMyBanner.start();//开始轮播
    }

    @Override
    public void setContent(RecommendMultipleItemAdapter adapter) {
        rvRecommend.setLayoutManager(new LinearLayoutManager(mContext));
        rvRecommend.setAdapter(adapter);
    }

    private void initRefreshLayout() {
        mRefreshLayout.setColorSchemeColors(ArmsUtils.getColor(_mActivity, R.color.unSelectColor));
        mRefreshLayout.setOnRefreshListener(() -> {
            mPresenter.initAdapter();
        });
    }

    private void initBannerView() {
        mBannerView = getLayoutInflater().inflate(R.layout.layout_banner, null, false);
        mMyBanner = mBannerView.findViewById(R.id.banner);
    }
}
