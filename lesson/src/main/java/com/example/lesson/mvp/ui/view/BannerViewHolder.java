package com.example.lesson.mvp.ui.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.lesson.R;
import com.example.lesson.app.data.entity.RecommendBean;
import com.zhouwei.mzbanner.holder.MZViewHolder;


public class BannerViewHolder implements MZViewHolder<RecommendBean.DataBean.HeadBean> {
    ImageView mImageView;

    @Override
    public View createView(Context context) {
        // 返回页面布局
        View view = LayoutInflater.from(context).inflate(R.layout.item_banner, null);
        mImageView = (ImageView) view.findViewById(R.id.banner_image);
        return view;
    }

    @Override
    public void onBind(Context context, int position, RecommendBean.DataBean.HeadBean banner) {
        // 数据绑定
        Glide.with(context)
                .load(banner.getImg())
                .centerCrop()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .dontAnimate()
                .into(mImageView);
    }
}
