package com.example.lesson.mvp.contract;

import com.example.lesson.app.data.entity.LessonBean;
import com.example.lesson.app.data.entity.LessonMultipleItem;
import com.example.lesson.app.data.entity.RecommendBean;
import com.example.lesson.app.data.entity.RecommendMultipleItem;
import com.example.lesson.mvp.ui.adapter.LessonMultipleItemAdapter;
import com.example.lesson.mvp.ui.adapter.RecommendMultipleItemAdapter;
import com.jess.arms.mvp.IView;
import com.jess.arms.mvp.IModel;

import java.util.List;

import io.reactivex.Observable;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 12/17/2019 11:41
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
public interface LessonContract {
    //对于经常使用的关于UI的方法可以定义到IView中,如显示隐藏进度条,和显示文字消息
    interface View extends IView {
        // 设置Banner
        void setBanner(List<LessonBean.DataBean.BannerBean> list);

        // 添加Banner到头部
        void addBanner(LessonMultipleItemAdapter adapter);

        // 设置课程内容
        void setContent(LessonMultipleItemAdapter adapter);

        // 添加底部
        void addFooter(LessonMultipleItemAdapter adapter);

        // 设置空布局
        void setEmpty(LessonMultipleItemAdapter adapter);
    }

    //Model层定义接口,外部只需关心Model返回的数据,无需关心内部细节,即是否使用缓存
    interface Model extends IModel {
        // 获取课程数据
        Observable<LessonBean> getLesson(String tagId);

        // 设置列表数据
        List<LessonMultipleItem> setData(LessonBean bean);

    }
}
