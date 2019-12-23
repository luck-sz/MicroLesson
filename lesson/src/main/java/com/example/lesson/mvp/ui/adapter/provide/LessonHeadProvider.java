package com.example.lesson.mvp.ui.adapter.provide;

import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.example.lesson.R;
import com.example.lesson.app.data.entity.LessonMultipleItem;
import com.example.lesson.app.data.entity.RecommendMultipleItem;
import com.example.lesson.mvp.ui.adapter.LessonMultipleItemAdapter;
import com.example.lesson.mvp.ui.adapter.RecommendMultipleItemAdapter;

public class LessonHeadProvider extends BaseItemProvider<LessonMultipleItem, BaseViewHolder> {
    @Override
    public int viewType() {
        return LessonMultipleItemAdapter.TYPE_HEAD;
    }

    @Override
    public int layout() {
        return R.layout.item_lesson_head;
    }

    @Override
    public void convert(BaseViewHolder helper, LessonMultipleItem data, int position) {
        helper.setText(R.id.tv_lesson_head, data.getTitle());
    }

}
