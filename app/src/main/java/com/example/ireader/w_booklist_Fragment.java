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


/**
 * A simple {@link Fragment} subclass.
 */
public class w_booklist_Fragment extends Fragment {

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

