package com.example.lesson.mvp.contract;

import com.example.lesson.app.data.entity.RecommendBean;
import com.example.lesson.app.data.entity.RecommendMultipleItem;
import com.example.lesson.mvp.ui.adapter.RecommendMultipleItemAdapter;
import com.jess.arms.mvp.IView;
import com.jess.arms.mvp.IModel;

import java.util.List;

import io.reactivex.Observable;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 12/19/2019 10:20
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
public interface RecommendContract {
    //对于经常使用的关于UI的方法可以定义到IView中,如显示隐藏进度条,和显示文字消息
    interface View extends IView {
        // 设置Banner
        void setBanner(List<RecommendBean.DataBean.HeadBean> list);

        // 添加Banner到头部
        void addBanner(RecommendMultipleItemAdapter adapter);

        // 设置推荐内容
        void setContent(RecommendMultipleItemAdapter adapter);

        // 添加底部
        void addFooter(RecommendMultipleItemAdapter adapter);
    }

    //Model层定义接口,外部只需关心Model返回的数据,无需关心内部细节,即是否使用缓存
    interface Model extends IModel {
        // 获取精选内容
        Observable<RecommendBean> getRecommend();

        // 设置列表数据
        List<RecommendMultipleItem> setData(RecommendBean bean);
    }
}
