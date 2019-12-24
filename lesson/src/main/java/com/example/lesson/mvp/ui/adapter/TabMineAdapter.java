package com.example.lesson.mvp.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.lesson.mvp.ui.fragment.LessonFragment;
import com.example.lesson.mvp.ui.fragment.RecommendFragment;
import com.example.lesson.mvp.ui.fragment.VideoFragment;

import java.util.List;

public class TabMineAdapter extends FragmentPagerAdapter {

    private List<String> mTitle;

    public TabMineAdapter(FragmentManager fm, List<String> mTitle) {
        super(fm);
        this.mTitle = mTitle;
    }

    @Override
    public Fragment getItem(int position) {
        return VideoFragment.newInstance();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitle.get(position);
    }

    @Override
    public int getCount() {
        return mTitle.size();
    }

}
