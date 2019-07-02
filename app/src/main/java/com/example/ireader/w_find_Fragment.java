package com.example.ireader;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class w_find_Fragment extends Fragment {

    Button w_btn1;
    Button w_btn2;
    Button w_btn3;
    Button w_btn4;


    public w_find_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_w_find_, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {//调用这个
        super.onActivityCreated(savedInstanceState);
        init();
        w_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), g_custom.class);
                startActivity(intent);
            }
        });

        w_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), g_fenlei.class);
                startActivity(intent);
            }
        });


    }

    private void init(){
        w_btn1=getActivity().findViewById(R.id.w_find1);
        w_btn2=getActivity().findViewById(R.id.w_find2);
        w_btn3=getActivity().findViewById(R.id.w_find3);
        w_btn4=getActivity().findViewById(R.id.w_find4);

    }
}
