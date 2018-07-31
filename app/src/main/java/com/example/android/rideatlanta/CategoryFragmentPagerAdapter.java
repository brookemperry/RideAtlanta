package com.example.android.rideatlanta;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryFragmentPagerAdapter extends FragmentPagerAdapter {
    public CategoryFragmentPagerAdapter(FragmentManager fm){
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new TrailsFragment();
        }
        else if (position == 1){
            return new ShopsFragment();
        }
        else if (position == 2){
            return new ClubsFragment();
        }
        else return new GroupRidesFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
            return "TRAILS";
        }
        else if (position == 1){
            return "BIKE SHOPS";
        }
        else if (position == 2){
            return "CLUBS";
        }
        else return "GROUP RIDES";
    }
}
