package com.example.lesson.mvp.ui.adapter;

import android.graphics.Color;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.lesson.R;
import com.example.lesson.app.data.entity.CategoryBean;
import com.example.lesson.app.data.entity.SubTagsBean;

import java.util.List;

public class CategoryLeftAdapter extends BaseQuickAdapter<SubTagsBean, BaseViewHolder> {

    public int idx = 0;

    public CategoryLeftAdapter(int layoutResId, List<SubTagsBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, SubTagsBean subTagsBean) {
        helper.setText(R.id.left_text, subTagsBean.getTagName());
        if (helper.getAdapterPosition() == idx) {
            helper.setTextColor(R.id.left_text, mContext.getResources().getColor(R.color.selectColor));
            helper.setBackgroundColor(R.id.list_item, mContext.getResources().getColor(R.color.background));
        } else {
            helper.setTextColor(R.id.left_text, mContext.getResources().getColor(R.color.unSelectColor));
            helper.setBackgroundColor(R.id.list_item, mContext.getResources().getColor(R.color.background));
        }
    }

}
