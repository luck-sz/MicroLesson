package com.example.lesson.mvp.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class TabAdapter extends FragmentStatePagerAdapter {

    List<Fragment> fragments;
    List<String> mTitle;

    public TabAdapter(FragmentManager fm, List<Fragment> fragments, List<String> mTitle) {
        super(fm);
        this.fragments = fragments;
        this.mTitle = mTitle;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
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
