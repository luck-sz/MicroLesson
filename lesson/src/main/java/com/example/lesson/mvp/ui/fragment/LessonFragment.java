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
import android.widget.TextView;

import com.example.lesson.app.base.MySupportFragment;
import com.example.lesson.app.data.entity.LessonBean;
import com.example.lesson.mvp.contract.LessonContract;
import com.example.lesson.mvp.ui.activity.DetailActivity;
import com.example.lesson.mvp.ui.adapter.LessonMultipleItemAdapter;
import com.example.lesson.mvp.ui.view.BannerViewHolder;
import com.github.nukc.stateview.StateView;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;

import com.example.lesson.di.component.DaggerLessonComponent;
import com.example.lesson.mvp.presenter.LessonPresenter;

import com.example.lesson.R;
import com.zhouwei.mzbanner.MZBannerView;
import com.zhouwei.mzbanner.holder.MZHolderCreator;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import timber.log.Timber;

import static com.jess.arms.utils.Preconditions.checkNotNull;


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
public class LessonFragment extends MySupportFragment<LessonPresenter> implements LessonContract.View {

    @BindView(R.id.rv_lesson)
    RecyclerView rvLesson;
    @BindView(R.id.refresh_layout)
    SwipeRefreshLayout mRefreshLayout;

    String tagId;
    View mBannerView;
    MZBannerView mMyBanner;
    StateView stateView;
    View mFooterView;
    View mEmptyView;
    View view;

    public static LessonFragment newInstance(String tagId) {
        LessonFragment fragment = new LessonFragment();
        Bundle args = new Bundle();
        args.putString("tagId", tagId);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void setupFragmentComponent(@NonNull AppComponent appComponent) {
        DaggerLessonComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .view(this)
                .build()
                .inject(this);
    }

    @Override
    public View initView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_lesson, container, false);
        return view;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        initView();
        if (getArguments() != null) {
            tagId = getArguments().getString("tagId");
            if (!tagId.equals("") && mPresenter != null) {
                mPresenter.getLesson(tagId);
            }
        }
        initRefreshLayout();
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
    public void setBanner(List<LessonBean.DataBean.BannerBean> list) {
        List<String> url = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            url.add(list.get(i).getImg());
        }
        if (url.size() == 1) {
            mMyBanner.setIndicatorVisible(false);
        }
        mMyBanner.setIndicatorVisible(true);
        mMyBanner.setDelayedTime(3000);
        mMyBanner.setDuration(1500);
        mMyBanner.setBannerPageClickListener(new MZBannerView.BannerPageClickListener() {
            @Override
            public void onPageClick(View view, int position) {
                Intent intent = new Intent(getActivity(), DetailActivity.class);
                intent.putExtra(DetailActivity.PARAM_TITLE, list.get(position).getTitle());
                intent.putExtra(DetailActivity.PARAM_URL, list.get(position).getUrl());
                launchActivity(intent);
            }
        });
        mMyBanner.setPages(url, new MZHolderCreator<BannerViewHolder>() {
            @Override
            public BannerViewHolder createViewHolder() {
                return new BannerViewHolder();
            }
        });
        mMyBanner.start();
    }

    @Override
    public void addBanner(LessonMultipleItemAdapter adapter) {
        if (adapter.getHeaderLayoutCount() < 1) {
            adapter.addHeaderView(mBannerView);
        }
    }

    @Override
    public void setContent(LessonMultipleItemAdapter adapter) {
        rvLesson.setLayoutManager(new LinearLayoutManager(mContext));
        rvLesson.setAdapter(adapter);
    }

    @Override
    public void addFooter(LessonMultipleItemAdapter adapter) {
        if (adapter.getFooterLayoutCount() < 1) {
            adapter.addFooterView(mFooterView);
        }
    }

    @Override
    public void setEmpty(LessonMultipleItemAdapter adapter) {
        stateView.showEmpty();
        adapter.setEmptyView(mEmptyView);
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
    public void onDestroy() {
        super.onDestroy();
        view = null;
        mBannerView = null;
    }

    private void initRefreshLayout() {
        mRefreshLayout.setColorSchemeColors(ArmsUtils.getColor(_mActivity, R.color.unSelectColor));
        mRefreshLayout.setOnRefreshListener(() -> {
            mPresenter.getLesson(tagId);
        });
    }

    private void initView() {
        // Banner
        mBannerView = getLayoutInflater().inflate(R.layout.layout_banner, null, false);
        mMyBanner = mBannerView.findViewById(R.id.banner);
        // 暂无更多
        mFooterView = getLayoutInflater().inflate(R.layout.layout_item_footer, null, false);
        // 空布局
        mEmptyView = getLayoutInflater().inflate(R.layout.layout_empty, null, false);
        stateView = mEmptyView.findViewById(R.id.stateView);
    }
}
