package com.example.lesson.mvp.ui.adapter.provide;

import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.example.lesson.R;
import com.example.lesson.app.data.entity.RecommendMultipleItem;
import com.example.lesson.mvp.ui.adapter.RecommendMultipleItemAdapter;
import com.jess.arms.http.imageloader.glide.ImageConfigImpl;
import com.jess.arms.utils.ArmsUtils;

import timber.log.Timber;

public class ChosenProvider extends BaseItemProvider<RecommendMultipleItem, BaseViewHolder> {
    @Override
    public int viewType() {
        return RecommendMultipleItemAdapter.TYPE_CHOSEN;
    }

    @Override
    public int layout() {
        return R.layout.item_chosen;
    }

    @Override
    public void convert(BaseViewHolder helper, RecommendMultipleItem data, int position) {
        // 标签
        helper.setText(R.id.tv_chosen_tag, data.getCourseBean().getCategoryName());
        // 标题
        helper.setText(R.id.tv_chosen_title, data.getCourseBean().getCourseTitle());
        // 开课时间
        helper.setText(R.id.tv_chosen_time, "开课时间: " + data.getCourseBean().getCourseTime() + " " + data.getCourseBean().getLessonNum() + "课时");
        // 老师头像以及名字
        int teacher[] = {R.id.ll_teacher1, R.id.ll_teacher2, R.id.ll_teacher3};
        int img[] = {R.id.cv_teacher1, R.id.cv_teacher2, R.id.cv_teacher3};
        int name[] = {R.id.tv_name1, R.id.tv_name2, R.id.tv_name3};
        Timber.d("老师列表" + data.getCourseBean().getTeacherList().size());
        for (int i = 0; i < data.getCourseBean().getTeacherList().size(); i++) {
            if (i < 3) {
                helper.setVisible(teacher[i], true);
                helper.setText(name[i], data.getCourseBean().getTeacherList().get(i).getName());
                ArmsUtils.obtainAppComponentFromContext(mContext)
                        .imageLoader()
                        .loadImage(mContext, ImageConfigImpl
                                .builder()
                                .imageView(helper.getView(img[i]))
                                .url(data.getCourseBean().getTeacherList().get(i).getImgUrl())
                                .build());
            }
        }
        // 价格
        helper.setText(R.id.tv_chosen_price, "￥" + data.getCourseBean().getCourseSalePrice());
        // 购买人数
        if (data.getCourseBean().getCourseSaleNum() > 0) {
            helper.setText(R.id.tv_chosen_buy, "已有" + data.getCourseBean().getCourseSaleNum() + "购买");
        } else {
            helper.setVisible(R.id.tv_chosen_buy, false);
        }

    }

}
