package com.example.ireader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;

public class g_resou extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




        setContentView(R.layout.g_resou_acticity);




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
