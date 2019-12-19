package com.example.lesson.mvp.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.lesson.R;
import com.example.lesson.app.base.MySupportFragment;
import com.example.lesson.app.data.entity.RecommendBean;
import com.example.lesson.app.eventbus.ChangeTag;
import com.example.lesson.di.component.DaggerHomeComponent;
import com.example.lesson.mvp.contract.HomeContract;
import com.example.lesson.mvp.presenter.HomePresenter;
import com.example.lesson.mvp.ui.activity.CategoryActivity;
import com.example.lesson.mvp.ui.adapter.TabAdapter;
import com.flyco.tablayout.SlidingTabLayout;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;

import org.simple.eventbus.Subscriber;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import timber.log.Timber;

import static com.jess.arms.utils.Preconditions.checkNotNull;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 12/17/2019 10:22
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
public class HomeFragment extends MySupportFragment<HomePresenter> implements HomeContract.View {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.tab_home)
    SlidingTabLayout tabHome;
    @BindView(R.id.vp_content)
    ViewPager vpContent;
    @BindView(R.id.toolbar_text)
    TextView mTitle;
    @BindView(R.id.ll_choose)
    LinearLayout choose;
    List<Integer> numbers;
    TabAdapter adapter;
    List<Fragment> fragments;
    List<String> mTitles;

    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }

    @Override
    public void setupFragmentComponent(@NonNull AppComponent appComponent) {
        DaggerHomeComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .view(this)
                .build()
                .inject(this);
    }

    @Override
    public View initView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        initToolBar();
        numbers = new ArrayList<>();
        numbers.add(430);
        numbers.add(1068);
        mPresenter.changeState(numbers);
    }

    @Override
    public void setData(@Nullable Object data) {

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

    }

    private void initToolBar() {
    }

    @Override
    public void setTitle(List<RecommendBean.DataBean.UserStagesBean> stagesBean) {
        if (stagesBean.size() > 0) {
            mTitle.setText(stagesBean.get(0).getTagName());
            choose.setOnClickListener(v -> {
                Intent intent = new Intent(getActivity(), CategoryActivity.class);
                int leftId = Integer.parseInt(stagesBean.get(0).getTagId());
                int tagId = Integer.parseInt(stagesBean.get(1).getTagId());
                Bundle bundle = new Bundle();
                bundle.putInt("leftId", leftId);
                bundle.putInt("tagId", tagId);
                intent.putExtra("bundle", bundle);
                launchActivity(intent);
            });
        }
    }

    @Override
    public void setTabTitle(List<RecommendBean.DataBean.SubTagsBean> subTagsBeans) {
        mTitles = new ArrayList<>();
        fragments = new ArrayList<>();
        mTitles.add("精选");
        fragments.add(RecommendFragment.newInstance());
        for (int i = 0; i < subTagsBeans.size(); i++) {
            mTitles.add(subTagsBeans.get(i).getTagName());
            fragments.add(TabChildFragment.newInstance(subTagsBeans.get(i).getTagName()));
        }
        adapter = new TabAdapter(getChildFragmentManager(), fragments, mTitles);
        vpContent.setAdapter(adapter);
        // 设置tab选项卡的默认选项
        tabHome.setViewPager(vpContent);
        tabHome.setCurrentTab(0);
    }

    @Subscriber(tag = "ChangeTag")
    public void changTag(ChangeTag changeTag) {
        tabHome.setCurrentTab(0);
        mPresenter.changeState(changeTag.getList());
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        numbers = null;
    }
}
