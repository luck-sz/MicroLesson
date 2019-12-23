package com.example.lesson.mvp.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.lesson.mvp.ui.fragment.HomeFragment;
import com.example.lesson.mvp.ui.fragment.LessonFragment;
import com.example.lesson.mvp.ui.fragment.RecommendFragment;

import java.util.List;

import timber.log.Timber;

public class TabAdapter extends FragmentStatePagerAdapter {

    List<String> mTitle;
    List<String> tagIds;

    public TabAdapter(FragmentManager fm, List<String> mTitle, List<String> tagIds) {
        super(fm);
        this.mTitle = mTitle;
        this.tagIds = tagIds;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return RecommendFragment.newInstance();
        } else {
            return LessonFragment.newInstance(tagIds.get(position - 1));
        }
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
