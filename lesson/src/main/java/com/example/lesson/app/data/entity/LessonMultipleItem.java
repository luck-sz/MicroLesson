package com.example.lesson.app.data.entity;

import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.chad.library.adapter.base.entity.SectionMultiEntity;

import java.io.Serializable;

/**
 * https://github.com/CymChad/BaseRecyclerViewAdapterHelper
 */
public class LessonMultipleItem extends SectionMultiEntity<Object> implements MultiItemEntity, Serializable {

    public static final int HEAD_ITEM = 1;          // 头部
    public static final int CONTENT_ITEM = 2;       // 内容

    // Item类型
    private int itemType;
    // 头部标题
    private String title;
    // 内容
    private LessonBean.DataBean.ColumnBean.CourseCardsBean bean;

    public LessonMultipleItem(int itemType, LessonBean.DataBean.ColumnBean.CourseCardsBean bean) {
        super(bean);
        this.bean = bean;
        this.itemType = itemType;
    }

    public LessonMultipleItem(int itemType, boolean isHeader, String title) {
        super(isHeader, title);
        this.title = title;
        this.itemType = itemType;
    }

    public LessonBean.DataBean.ColumnBean.CourseCardsBean getBean() {
        return bean;
    }

    public void setBean(LessonBean.DataBean.ColumnBean.CourseCardsBean bean) {
        this.bean = bean;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int getItemType() {
        return itemType;
    }
}
