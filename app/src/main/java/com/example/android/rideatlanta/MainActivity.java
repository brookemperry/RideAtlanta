package com.example.android.rideatlanta;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //the viewpager lets the user swipe between fragments
        ViewPager viewPager = findViewById(R.id.viewpager);

        //the adapter knows which fragment should be displayed on each page
        CategoryFragmentPagerAdapter adapter = new CategoryFragmentPagerAdapter(getSupportFragmentManager());

        //This sets the adapter on the viewpager
        viewPager.setAdapter(adapter);

        //get the tab layout
        TabLayout tablayout = findViewById(R.id.tabs);

        //This attaches the tab layout with the viewpager
        tablayout.setupWithViewPager(viewPager);
    }
}
