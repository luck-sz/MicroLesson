package com.example.lesson.mvp.ui.adapter.provide;

import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.example.lesson.R;
import com.example.lesson.app.data.entity.RecommendMultipleItem;
import com.example.lesson.mvp.ui.adapter.RecommendMultipleItemAdapter;

public class HeadProvider extends BaseItemProvider<RecommendMultipleItem, BaseViewHolder> {
    @Override
    public int viewType() {
        return RecommendMultipleItemAdapter.TYPE_HEAD;
    }

    @Override
    public int layout() {
        return R.layout.item_head;
    }

    @Override
    public void convert(BaseViewHolder helper, RecommendMultipleItem data, int position) {
        helper.setText(R.id.tv_head, data.getTitle());
    }

}
