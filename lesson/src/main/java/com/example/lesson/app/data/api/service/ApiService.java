package com.example.lesson.app.data.api.service;

import com.example.lesson.app.data.entity.CategoryBean;
import com.example.lesson.app.data.entity.LessonBean;
import com.example.lesson.app.data.entity.RecommendBean;
import com.example.lesson.app.data.entity.TagSuccessBean;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    /**
     * 分类页面的数据
     */
    @GET("/course3/api/content/stages?api_ver=1.10&keyfrom=course.3.2.2.android&model=MI_6&mid=8.0.0&imei=866822031582307&vendor=xiaomi&screen=1080x1920&abtest=6&Mkt1st=xiaomi&Mkt=xiaomi&Pdt=mCourse.android")
    Observable<CategoryBean> getCategory();

    /**
     * 修改当前学习阶段
     */
    @GET("/course3/api/user/profile/tag/set?api_ver=1.10&keyfrom=course.3.2.2.android&model=MI_6&mid=8.0.0&imei=866822031582307&vendor=xiaomi&screen=1080x1920&abtest=6&Mkt1st=xiaomi&Mkt=xiaomi&Pdt=mCourse.android")
    Observable<TagSuccessBean> changeState(@Query("tags") List<Integer> list);

    /**
     * 获取精选内容
     */
    @GET("/course3/api/apphome?api_ver=1.10&keyfrom=course.3.2.2.android&model=MI_6&mid=8.0.0&imei=866822031582307&vendor=xiaomi&screen=1440x2560&abtest=6&Mkt1st=xiaomi&Mkt=xiaomi&Pdt=mCourse.android&popup=false")
    Observable<RecommendBean> getRecommend();

    /**
     * 获取相应Tag页面的内容(比如语文)
     */
    @GET("/course3/api/vertical2?api_ver=1.10&keyfrom=course.3.2.2.android&model=MI_6&mid=8.0.0&imei=866822031582307&vendor=xiaomi&screen=1080x1920&abtest=6&Mkt1st=xiaomi&Mkt=xiaomi&Pdt=mCourse.android")
    Observable<LessonBean> getLesson(@Query("tag") String tag);

    /**
     * 获取头像，名字
     */

    /**
     * 获取视频流
     */

}
