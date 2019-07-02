package com.example.ireader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

public class g_ziye extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.g_ziye_activity);

        ImageButton btn=(ImageButton)findViewById(R.id.g_imabutton);
        ImageButton btn1=(ImageButton)findViewById(R.id.g_imabutton1);
        ImageButton btn2=(ImageButton)findViewById(R.id.g_imabutton2);
        btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    ((ImageButton)view).setImageDrawable(getResources().getDrawable(R.drawable.g_zan1));

                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    ((ImageButton)view).setImageDrawable(getResources().getDrawable(R.drawable.g_zan));

                }
                return false;
            }
        });

        btn1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    ((ImageButton)view).setImageDrawable(getResources().getDrawable(R.drawable.g_zan1));

                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    ((ImageButton)view).setImageDrawable(getResources().getDrawable(R.drawable.g_zan));

                }
                return false;
            }
        });
        btn2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    ((ImageButton)view).setImageDrawable(getResources().getDrawable(R.drawable.g_zan1));

                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    ((ImageButton)view).setImageDrawable(getResources().getDrawable(R.drawable.g_zan));

                }
                return false;
            }
        });



    }
}
