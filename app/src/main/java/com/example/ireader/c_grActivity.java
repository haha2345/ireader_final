package com.example.ireader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class c_grActivity extends AppCompatActivity {

    private TextView c_tv_title;
    private TextView c_tv_back;
    private TextView c_tv_name;
    private ImageButton c_i_config;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_gr);

        c_tv_back=(TextView)findViewById(R.id.c_tv_back);
        c_tv_title=(TextView)findViewById(R.id.c_tv_title);
        c_tv_title.setText("我的");

        c_tv_name =(TextView)findViewById(R.id.c_tv_name);
        Intent intent=getIntent();
        String data=intent.getStringExtra("uname");
        c_tv_name.setText(data);
        c_tv_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String uname = c_tv_name.getText().toString();
                Intent intent1 = new Intent(c_grActivity.this,c_xggrActivity.class);
                intent1.putExtra("uname",uname);
                startActivity(intent1);
            }
        });
        c_i_config=(ImageButton)findViewById(R.id.c_i_config);
        c_i_config.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 =new Intent(c_grActivity.this,c_configActivity.class);
                startActivity(intent1);
            }
        });

        c_tv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
