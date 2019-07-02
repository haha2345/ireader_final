package com.example.ireader;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;


import android.view.LayoutInflater;
import android.view.View;


import android.os.Bundle;
import android.view.Window;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class w_booklist_Fragment extends Fragment {

    private ViewPager viewPager;
    private ArrayList<View> pageview;

    Button w_btn1;
    Button w_btn2;
    Button w_btn3;
    Button w_btn4;
    Button w_btn5;
    Button w_btn6;
    Button w_2readBtn;

    public w_booklist_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_w_booklist_, container, false);

        return view;






    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {


        super.onActivityCreated(savedInstanceState);
        getActivity().setContentView(R.layout.fragment_w_booklist_);
        super.onActivityCreated(savedInstanceState);
        viewPager=getActivity().findViewById(R.id.g_hua);

        LayoutInflater inflater=getLayoutInflater();
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
            public void destroyItem(View arg0, int arg1, Object arg2) {
                ((ViewPager) arg0).removeView(pageview.get(arg1));
            }
            public Object instantiateItem(View arg0, int arg1){
                ((ViewPager)arg0).addView(pageview.get(arg1));
                return pageview.get(arg1);
            }
        };
        viewPager.setAdapter(mPagerAdapter);





        init();

        w_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), w_detailActivity.class);
                startActivity(intent);
            }
        });
        w_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), w_detailActivity.class);
                startActivity(intent);
            }
        });
        w_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), w_detailActivity.class);
                startActivity(intent);
            }
        });
        w_2readBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(getActivity(),w_open_local_file_Activity.class);
                startActivity(intent);
            }
        });



    }

    private void init() {
        w_btn1 = getActivity().findViewById(R.id.w_book_btn1);
        w_btn2 = getActivity().findViewById(R.id.w_book_btn2);
        w_btn3 = getActivity().findViewById(R.id.w_book_btn3);
        w_btn4 = getActivity().findViewById(R.id.w_book_btn4);
        w_btn5 = getActivity().findViewById(R.id.w_book_btn5);
        w_btn6 = getActivity().findViewById(R.id.w_book_btn6);
        w_2readBtn=getActivity().findViewById(R.id.w_btn2read);

    }


}

