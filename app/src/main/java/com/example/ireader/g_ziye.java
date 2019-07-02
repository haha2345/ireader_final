package com.example.ireader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.bifan.txtreaderlib.ui.HwTxtPlayActivity;

public class g_ziye extends AppCompatActivity {

    Button g_btn;
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

        g_btn=findViewById(R.id.g_btn1);
        g_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HwTxtPlayActivity.loadTxtFile(g_ziye.this, (Environment.getExternalStorageDirectory() + "/1.txt"));
            }
        });


    }
}
