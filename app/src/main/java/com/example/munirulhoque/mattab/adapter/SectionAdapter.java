package com.example.munirulhoque.mattab.adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by munirul.hoque on 5/16/2016.
 */
public class SectionAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragmentList = new ArrayList<Fragment>();
    private List<String> fragmentTitle = new ArrayList<String>();

    public SectionAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTitle.get(position);
    }
    public void addFrag(Fragment fr, String title){
        fragmentList.add(fr);
        fragmentTitle.add(title);
    }
}
