package com.example.samplecirclesdefault;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import com.viewpagerindicator.CirclePageIndicator;
import com.viewpagerindicator.PageIndicator;

public class SampleCirclesDefault extends FragmentActivity {
	TestFragmentAdapter mAdapter;
    ViewPager mPager;
    PageIndicator mIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_circles);
        LayoutInflater mLi = LayoutInflater.from(this);
        View view1 = mLi.inflate(R.layout.image1_layout, null);
        View view2 = mLi.inflate(R.layout.img_layout, null);
        View view3 = mLi.inflate(R.layout.image2_layout, null);
        final ArrayList<View> views = new ArrayList<View>();
        views.add(view1);
        views.add(view2); 
        views.add(view3);
        mAdapter = new TestFragmentAdapter(views);
        mPager = (ViewPager)findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);

        mIndicator = (CirclePageIndicator)findViewById(R.id.indicator);
        mIndicator.setViewPager(mPager);
    }
}