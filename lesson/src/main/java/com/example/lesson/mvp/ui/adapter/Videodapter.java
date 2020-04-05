package com.example.lesson.mvp.ui.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.lesson.R;
import com.example.lesson.app.data.entity.SubTagsBean;
import com.example.lesson.app.data.entity.VideoBean;
import com.jess.arms.http.imageloader.glide.ImageConfigImpl;
import com.jess.arms.utils.ArmsUtils;

import java.util.List;

public class Videodapter extends BaseQuickAdapter<VideoBean.DataBean.PlayerBean, BaseViewHolder> {

    public Videodapter(int layoutResId, List<VideoBean.DataBean.PlayerBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, VideoBean.DataBean.PlayerBean playerBean) {
        helper.addOnClickListener(R.id.fab);
        // 视频标题
        helper.setText(R.id.tv_video_title, playerBean.getTitle());
        // 视频封面
        ArmsUtils.obtainAppComponentFromContext(mContext)
                .imageLoader()
                .loadImage(mContext, ImageConfigImpl
                        .builder()
                        .imageView(helper.getView(R.id.iv_video))
                        .url(playerBean.getImg())
                        .build());
    }

}
