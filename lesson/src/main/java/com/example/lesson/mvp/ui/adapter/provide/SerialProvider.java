package com.example.lesson.mvp.ui.adapter.provide;

import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.example.lesson.R;
import com.example.lesson.app.data.entity.RecommendMultipleItem;
import com.example.lesson.mvp.ui.adapter.RecommendMultipleItemAdapter;
import com.jess.arms.http.imageloader.glide.ImageConfigImpl;
import com.jess.arms.utils.ArmsUtils;

public class SerialProvider extends BaseItemProvider<RecommendMultipleItem, BaseViewHolder> {
    @Override
    public int viewType() {
        return RecommendMultipleItemAdapter.TYPE_SERIES;
    }

    @Override
    public int layout() {
        return R.layout.item_serial;
    }

    @Override
    public void convert(BaseViewHolder helper, RecommendMultipleItem data, int position) {
        // 标签
        helper.setText(R.id.tv_serial_tag, data.getSerialBean().getCategoryName());
        // 标题
        helper.setText(R.id.tv_serial_title, data.getSerialBean().getTitle());
        // 课程数
        helper.setText(R.id.tv_serial_timeNum, data.getSerialBean().getSerialType() + "/共" + data.getSerialBean().getCourseCount() + "门课");
        // 老师头像以及名字
        int teacher[] = {R.id.ll_teacher1, R.id.ll_teacher2, R.id.ll_teacher3};
        int img[] = {R.id.cv_teacher1, R.id.cv_teacher2, R.id.cv_teacher3};
        int name[] = {R.id.tv_name1, R.id.tv_name2, R.id.tv_name3};
        for (int i = 0; i < data.getSerialBean().getTeacherList().size(); i++) {
            helper.setVisible(teacher[i], true);
            helper.setText(name[i], data.getSerialBean().getTeacherList().get(i).getName());
            ArmsUtils.obtainAppComponentFromContext(mContext)
                    .imageLoader()
                    .loadImage(mContext, ImageConfigImpl
                            .builder()
                            .imageView(helper.getView(img[i]))
                            .url(data.getSerialBean().getTeacherList().get(i).getImgUrl())
                            .build());
        }
        // 价格
        helper.setText(R.id.tv_serial_price, "￥" + data.getSerialBean().getMinPrice() + " - " + data.getSerialBean().getMaxPrice());
        // 购买人数
        if (data.getSerialBean().getSaleNum() > 0) {
            helper.setText(R.id.tv_serial_buy, "已有" + data.getSerialBean().getSaleNum() + "购买");
        }else {
            helper.setVisible(R.id.tv_serial_buy, false);
        }

    }

}
