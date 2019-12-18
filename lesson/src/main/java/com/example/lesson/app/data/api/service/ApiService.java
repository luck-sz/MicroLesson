package com.example.lesson.app.data.api.service;

import com.example.lesson.app.data.entity.CategoryBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ApiService {

    /**
     * 分类页面的数据
     */
    @GET("/course3/api/content/stages?api_ver=1.10&keyfrom=course.3.2.2.android&model=MI_6&mid=8.0.0&imei=866822031582307&vendor=xiaomi&screen=1080x1920&abtest=6&Mkt1st=xiaomi&Mkt=xiaomi&Pdt=mCourse.android")
    Observable<CategoryBean> getCategory();

}
