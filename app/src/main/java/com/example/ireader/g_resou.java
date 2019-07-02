package com.example.ireader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;


import android.view.LayoutInflater;
import android.view.View;
import android.os.Bundle;
import android.view.Window;
import java.util.ArrayList;
public class g_resou extends AppCompatActivity {

    private ViewPager viewPager;
    private ArrayList<View> pageview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.g_resou_acticity);

        viewPager=(ViewPager)findViewById(R.id.g_hua);

        LayoutInflater inflater =getLayoutInflater();
        View view1 = inflater.inflate(R.layout.g_huadong1_activity, null);
        View view2 = ((LayoutInflater) inflater).inflate(R.layout.g_huadong2_activity, null);
        View view3 = inflater.inflate(R.layout.g_huadong3_activity, null);



        pageview =new ArrayList<View>();
        pageview.add(view1);
        pageview.add(view2);
        pageview.add(view3);

        PagerAdapter mPagerAdapter=new PagerAdapter() {
            @Override
            public int getCount() {
                return pageview.size();
            }

            @Override
            public boolean isViewFromObject(@NonNull View arg0, @NonNull Object arg1) {
                return arg0==arg1;
            }
            public void destroyItem(View arg0,int arg1,Object arg2){
                ((ViewPager)arg0).removeView(pageview.get(arg1));
            }
            public Object instantiateItem(View arg0,int arg1){
                ((ViewPager)arg0).addView(pageview.get(arg1));
                return pageview.get(arg1);
            }
        };
        viewPager.setAdapter(mPagerAdapter);


        ScrollView scrollView=(ScrollView)findViewById(R.id.g_scroll1);
        FrameLayout g_frame=(FrameLayout)findViewById(R.id.g_fragmet);

        scrollView.setVerticalScrollBarEnabled(false);
        g_frame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(g_resou.this, g_ziye.class);
                startActivity(intent);

            }
        });



    }
}
