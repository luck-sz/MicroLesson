package com.example.lesson.app.data.entity;

import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.chad.library.adapter.base.entity.SectionMultiEntity;

import java.io.Serializable;

/**
 * https://github.com/CymChad/BaseRecyclerViewAdapterHelper
 */
public class RecommendMultipleItem extends SectionMultiEntity<Object> implements MultiItemEntity, Serializable {

    public static final int HEAD_ITEM = 1;          // 头部
    public static final int FAMOUS_ITEM = 2;        // 名师推荐
    public static final int SERIES_ITEM = 3;        // 系列好课
    public static final int CHOSEN_ITEM = 4;        // 精选好课

    // Item类型
    private int itemType;
    // 头部标题
    private String title;
    // 名师
    private RecommendBean.DataBean.ZhuanlanBean zhuanlanBean;
    // 系列
    private RecommendBean.DataBean.SerialBean serialBean;

    public RecommendMultipleItem(int itemType, RecommendBean.DataBean.ZhuanlanBean bean) {
        super(bean);
        this.zhuanlanBean = bean;
        this.itemType = itemType;
    }

    public RecommendMultipleItem(int itemType, RecommendBean.DataBean.SerialBean bean) {
        super(bean);
        this.serialBean = bean;
        this.itemType = itemType;
    }

    public RecommendMultipleItem(int itemType, boolean isHeader, String title) {
        super(isHeader, title);
        this.title = title;
        this.itemType = itemType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public RecommendBean.DataBean.ZhuanlanBean getZhuanlanBean() {
        return zhuanlanBean;
    }

    public void setZhuanlanBean(RecommendBean.DataBean.ZhuanlanBean zhuanlanBean) {
        this.zhuanlanBean = zhuanlanBean;
    }

    public RecommendBean.DataBean.SerialBean getSerialBean() {
        return serialBean;
    }

    public void setSerialBean(RecommendBean.DataBean.SerialBean serialBean) {
        this.serialBean = serialBean;
    }

    @Override
    public int getItemType() {
        return itemType;
    }
}
