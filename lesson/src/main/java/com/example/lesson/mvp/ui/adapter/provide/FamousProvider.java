package com.example.lesson.mvp.ui.adapter.provide;

import android.content.Intent;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.example.lesson.R;
import com.example.lesson.app.data.entity.RecommendMultipleItem;
import com.example.lesson.mvp.ui.activity.DetailActivity;
import com.example.lesson.mvp.ui.adapter.RecommendMultipleItemAdapter;
import com.jess.arms.http.imageloader.glide.ImageConfigImpl;
import com.jess.arms.utils.ArmsUtils;

import timber.log.Timber;

public class FamousProvider extends BaseItemProvider<RecommendMultipleItem, BaseViewHolder> {
    @Override
    public int viewType() {
        return RecommendMultipleItemAdapter.TYPE_FAMOUS;
    }

    @Override
    public int layout() {
        return R.layout.item_famous;
    }

    @Override
    public void convert(BaseViewHolder helper, RecommendMultipleItem data, int position) {
        // 标题
        helper.setText(R.id.special_title, data.getZhuanlanBean().getTitle());
        // 老师名字
        helper.setText(R.id.tv_teacher_name, data.getZhuanlanBean().getTeacherName());
        // 老师图片
        ArmsUtils.obtainAppComponentFromContext(mContext)
                .imageLoader()
                .loadImage(mContext, ImageConfigImpl
                        .builder()
                        .imageView(helper.getView(R.id.iv_teacher))
                        .imageRadius(5)
                        .url(data.getZhuanlanBean().getImg())
                        .build());
        // 内容
        helper.setText(R.id.special_content, data.getZhuanlanBean().getIntroduction());
        // 标签
        helper.setText(R.id.tv_teacher_tag, data.getZhuanlanBean().getTeacherTag());
        // 隐藏分割线
    }

    @Override
    public void onClick(BaseViewHolder helper, RecommendMultipleItem data, int position) {
        super.onClick(helper, data, position);
        Intent intent = new Intent(mContext, DetailActivity.class);
        intent.putExtra(DetailActivity.PARAM_TITLE, data.getZhuanlanBean().getTitle());
        intent.putExtra(DetailActivity.PARAM_URL, data.getZhuanlanBean().getUrl());
        mContext.startActivity(intent);
    }
}
