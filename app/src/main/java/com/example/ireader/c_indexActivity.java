package com.example.ireader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.os.Handler;
import android.view.View.OnClickListener;

import java.util.Timer;
import java.util.TimerTask;


public class c_indexActivity extends AppCompatActivity {

    private int recLen = 5;
    private TextView c_tv_djs;
    private Button c_btn_index;
    Timer timer = new Timer();
    private Handler handler;
    private Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_index);
        c_tv_djs = (TextView) findViewById(R.id.c_tv_djs);
        c_btn_index = (Button) findViewById(R.id.c_btn_index);

        c_btn_index.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(c_indexActivity.this,c_loginActivity.class);
                startActivityForResult(intent, 1);
                finish();
            }
        });

    }
}