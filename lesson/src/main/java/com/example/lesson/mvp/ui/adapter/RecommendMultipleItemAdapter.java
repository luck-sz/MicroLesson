package com.example.lesson.mvp.ui.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.MultipleItemRvAdapter;
import com.example.lesson.app.data.entity.RecommendMultipleItem;
import com.example.lesson.mvp.ui.adapter.provide.FamousProvider;
import com.example.lesson.mvp.ui.adapter.provide.HeadProvider;
import com.example.lesson.mvp.ui.adapter.provide.SerialProvider;

import java.util.List;

/**
 * https://github.com/CymChad/BaseRecyclerViewAdapterHelper
 */
public class RecommendMultipleItemAdapter extends MultipleItemRvAdapter<RecommendMultipleItem, BaseViewHolder> {

    public static final int TYPE_HEAD = 100;
    public static final int TYPE_FAMOUS = 200;
    public static final int TYPE_SERIES = 300;
    public static final int TYPE_CHOSEN = 400;

    public RecommendMultipleItemAdapter(@Nullable List<RecommendMultipleItem> data) {
        super(data);
        finishInitialize();
    }

    @Override
    protected int getViewType(RecommendMultipleItem entity) {
        if (entity.getItemType() == RecommendMultipleItem.HEAD_ITEM) {
            return TYPE_HEAD;
        } else if (entity.getItemType() == RecommendMultipleItem.FAMOUS_ITEM) {
            return TYPE_FAMOUS;
        } else if (entity.getItemType() == RecommendMultipleItem.SERIES_ITEM) {
            return TYPE_SERIES;
        } else if (entity.getItemType() == RecommendMultipleItem.CHOSEN_ITEM) {
            return TYPE_CHOSEN;
        }
        return 0;
    }

    @Override
    public void registerItemProvider() {
        mProviderDelegate.registerProvider(new HeadProvider());
        mProviderDelegate.registerProvider(new FamousProvider());
        mProviderDelegate.registerProvider(new SerialProvider());
    }
}
