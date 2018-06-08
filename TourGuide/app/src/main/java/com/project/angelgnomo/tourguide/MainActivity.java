package com.project.angelgnomo.tourguide;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InitializeTourLocationViewPager();
    }

    private void InitializeTourLocationViewPager() {
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        TourLocationPagerAdapter locAdapter = new TourLocationPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(locAdapter);

        TabLayout tourguideTabs = (TabLayout) findViewById(R.id.tourguide_tabs);
        tourguideTabs.setupWithViewPager(viewPager);
    }
}
