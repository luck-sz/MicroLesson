package com.example.lesson.app.base;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public abstract class FixedPagerAdapter<T> extends FragmentStatePagerAdapter {

    private List<ItemObject> mCurrentItems = new ArrayList<>();

    public FixedPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        while (mCurrentItems.size() <= position) {
            mCurrentItems.add(null);
        }
        Fragment fragment = (Fragment) super.instantiateItem(container, position);
        ItemObject object = new ItemObject(fragment, getItemData(position));
        mCurrentItems.set(position, object);
        return object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        mCurrentItems.set(position, null);
        super.destroyItem(container, position, ((ItemObject) object).fragment);
    }

    @Override
    public int getItemPosition(Object object) {
        ItemObject itemObject = (ItemObject) object;
        if (mCurrentItems.contains(itemObject)) {
            T oldData = itemObject.t;
            int oldPosition = mCurrentItems.indexOf(itemObject);
            T newData = getItemData(oldPosition);
            if (equals(oldData, newData)) {
                return POSITION_UNCHANGED;
            } else {
                int newPosition = getDataPosition(oldData);
                return newPosition >= 0 ? newPosition : POSITION_NONE;
            }
        }
        return POSITION_UNCHANGED;
    }

    @Override
    public void setPrimaryItem(ViewGroup container, int position, Object object) {
        super.setPrimaryItem(container, position, ((ItemObject) object).fragment);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return super.isViewFromObject(view, ((ItemObject) object).fragment);
    }

    public abstract T getItemData(int position);

    public abstract int getDataPosition(T t);

    public abstract boolean equals(T oldD, T newD);

    public class ItemObject {

        public Fragment fragment;
        public T t;

        public ItemObject(Fragment fragment, T t) {
            this.fragment = fragment;
            this.t = t;
        }
    }

}
