package com.example.ireader;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;

import android.view.View;
import android.widget.TextView;

public class w_detailActivity extends AppCompatActivity {
    TextView w_tv;

    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_w_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        w_tv=findViewById(R.id.w_bg1);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(count==0){
                    Snackbar.make(view, "切换夜间模式成功！", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                    w_tv.setBackgroundColor(Color.parseColor("#000000"));
                    w_tv.setTextColor(Color.parseColor("#ffffff"));
                    count++;
                }else {
                    Snackbar.make(view, "切换日间模式成功！", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                    w_tv.setBackgroundColor(Color.parseColor("#ffffff"));
                    w_tv.setTextColor(Color.parseColor("#9a9a9a"));
                    count--;

                }


            }
        });
    }
}
