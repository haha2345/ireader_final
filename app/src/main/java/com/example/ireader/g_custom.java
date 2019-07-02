package com.example.ireader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ScrollView;

public class g_custom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.g_custom_activity);

        ScrollView sview=(ScrollView)findViewById(R.id.g_scroll2);

        FrameLayout frame=(FrameLayout)findViewById(R.id.g_fram);

        FrameLayout frame2=(FrameLayout)findViewById(R.id.g_frame2);
        FrameLayout frame3=(FrameLayout)findViewById(R.id.g_frame3);
        sview.setVerticalScrollBarEnabled(false);






        frame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(g_custom.this,g_resou.class);
                startActivity(intent);
            }
        });

        frame2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(g_custom.this,g_resou2.class);
                startActivity(intent);
            }
        });
        frame3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(g_custom.this,g_resou3.class);
                startActivity(intent);
            }
        });


    }

}



