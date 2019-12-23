package com.example.lesson.mvp.ui.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.MultipleItemRvAdapter;
import com.example.lesson.app.data.entity.LessonMultipleItem;
import com.example.lesson.app.data.entity.RecommendMultipleItem;
import com.example.lesson.mvp.ui.adapter.provide.ChosenProvider;
import com.example.lesson.mvp.ui.adapter.provide.FamousProvider;
import com.example.lesson.mvp.ui.adapter.provide.HeadProvider;
import com.example.lesson.mvp.ui.adapter.provide.LessonContentProvider;
import com.example.lesson.mvp.ui.adapter.provide.LessonHeadProvider;
import com.example.lesson.mvp.ui.adapter.provide.SerialProvider;

import java.util.List;

/**
 * https://github.com/CymChad/BaseRecyclerViewAdapterHelper
 */
public class LessonMultipleItemAdapter extends MultipleItemRvAdapter<LessonMultipleItem, BaseViewHolder> {

    public static final int TYPE_HEAD = 100;
    public static final int TYPE_CONTENT = 200;

    public LessonMultipleItemAdapter(@Nullable List<LessonMultipleItem> data) {
        super(data);
        finishInitialize();
    }

    @Override
    protected int getViewType(LessonMultipleItem entity) {
        if (entity.getItemType() == LessonMultipleItem.HEAD_ITEM) {
            return TYPE_HEAD;
        } else if (entity.getItemType() == LessonMultipleItem.CONTENT_ITEM) {
            return TYPE_CONTENT;
        }
        return 0;
    }

    @Override
    public void registerItemProvider() {
        mProviderDelegate.registerProvider(new LessonHeadProvider());
        mProviderDelegate.registerProvider(new LessonContentProvider());
    }
}
