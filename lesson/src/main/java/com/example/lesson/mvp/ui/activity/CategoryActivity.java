package com.example.lesson.mvp.ui.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.lesson.R;
import com.example.lesson.app.base.MySupportActivity;
import com.example.lesson.app.data.entity.SubTagsBean;
import com.example.lesson.di.component.DaggerCategoryComponent;
import com.example.lesson.mvp.contract.CategoryContract;
import com.example.lesson.mvp.presenter.CategoryPresenter;
import com.example.lesson.mvp.ui.adapter.CategoryLeftAdapter;
import com.gyf.immersionbar.ImmersionBar;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.zhy.view.flowlayout.FlowLayout;
import com.zhy.view.flowlayout.TagAdapter;
import com.zhy.view.flowlayout.TagFlowLayout;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.jess.arms.utils.Preconditions.checkNotNull;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 12/18/2019 11:12
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
public class CategoryActivity extends MySupportActivity<CategoryPresenter> implements CategoryContract.View {

    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.left)
    RecyclerView mRecycleView;
    @BindView(R.id.mTflRepresent)
    TagFlowLayout mTagFlowLayout;

    TagAdapter tagAdapter;

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerCategoryComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .view(this)
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.activity_category; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        initStatusBar();
        initToolbar();
        mPresenter.getCategory();
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
                .statusBarDarkFont(true)
                .fitsSystemWindows(true)
                .statusBarColor(R.color.white)
                .init();
    }

    private void initToolbar() {
        mToolbar.inflateMenu(R.menu.menu_category);
        mToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                if (menuItem.getItemId() == R.id.category_close) {
                    finish();
                }
                return false;
            }
        });
    }

    @Override
    public void setLeftAdapter(CategoryLeftAdapter categoryLeftAdapter) {
        mRecycleView.setLayoutManager(new LinearLayoutManager(this));
        mRecycleView.setAdapter(categoryLeftAdapter);
    }

    @Override
    public void setTagAdapter(List<SubTagsBean> list) {
        tagAdapter = new TagAdapter<SubTagsBean>(list) {
            @Override
            public View getView(FlowLayout parent, int position, SubTagsBean bean) {
                View mTagLayout = LayoutInflater.from(CategoryActivity.this).inflate(R.layout.itme_category_tag, parent, false);
                TextView textView = mTagLayout.findViewById(R.id.mTvTag);
                CardView cardView = mTagLayout.findViewById(R.id.cardView);
                textView.setText(bean.getTagName());
                if (bean.getTagId() == 2364) {
                    textView.setTextColor(Color.parseColor("#0CB65B"));
                    cardView.setCardBackgroundColor(Color.parseColor("#F9FEF8"));
                }else {
                    textView.setTextColor(Color.parseColor("#A5A9AD"));
                    cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                }
                return mTagLayout;
            }
        };
        mTagFlowLayout.setAdapter(tagAdapter);
        mTagFlowLayout.setOnTagClickListener(new TagFlowLayout.OnTagClickListener() {
            @Override
            public boolean onTagClick(View view, int position, FlowLayout parent) {

                return true;
            }
        });
    }

}
