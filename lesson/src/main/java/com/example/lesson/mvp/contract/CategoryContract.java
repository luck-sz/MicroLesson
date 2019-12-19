package com.example.lesson.mvp.contract;

import com.example.lesson.app.data.entity.CategoryBean;
import com.example.lesson.app.data.entity.SubTagsBean;
import com.example.lesson.mvp.ui.adapter.CategoryLeftAdapter;
import com.jess.arms.mvp.IView;
import com.jess.arms.mvp.IModel;
import com.zhy.view.flowlayout.TagAdapter;

import java.util.List;

import io.reactivex.Observable;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 12/18/2019 11:12
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
public interface CategoryContract {
    //对于经常使用的关于UI的方法可以定义到IView中,如显示隐藏进度条,和显示文字消息
    interface View extends IView {
        void setLeftAdapter(CategoryLeftAdapter categoryLeftAdapter);

        void setTagAdapter(List<SubTagsBean> list, int leftId, int tagId);
    }

    //Model层定义接口,外部只需关心Model返回的数据,无需关心内部细节,即是否使用缓存
    interface Model extends IModel {
        Observable<CategoryBean> getCategory();
    }
}
