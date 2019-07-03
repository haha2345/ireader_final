package com.example.ireader;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class c_configActivity extends AppCompatActivity {

    private Button c_btn_end;
    private TextView c_tv_back;
    private TextView c_tv_qchc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_config);

        c_tv_qchc=(TextView)findViewById(R.id.c_tv_qchc);
        c_tv_back=(TextView)findViewById(R.id.c_tv_back);
        c_btn_end =(Button)findViewById(R.id.c_btn_end);
        c_btn_end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor =getSharedPreferences("data2",MODE_PRIVATE).edit();
                editor.putInt("log",0);
                editor.apply();
                Intent intent =new Intent(c_configActivity.this,c_loginActivity.class);
                intent.setFlags(intent.FLAG_ACTIVITY_CLEAR_TASK|intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);

                finish();
            }
        });

        c_tv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        c_tv_qchc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(c_configActivity.this);
                dialog.setTitle("警告！");
                dialog.setMessage("你是否删除缓存，可能有部分功能会受此影响");
                dialog.setCancelable(false);
                dialog.setPositiveButton("是", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        SharedPreferences sp = getSharedPreferences("deta",MODE_PRIVATE);
                        SharedPreferences.Editor editor = sp.edit();
                        editor.clear();
                        editor.commit();
                        SharedPreferences sp2 = getSharedPreferences("deta2",MODE_PRIVATE);
                        SharedPreferences.Editor editor2 = sp2.edit();
                        editor2.clear();
                        editor2.commit();
                        SharedPreferences sp3 = getSharedPreferences("deta3",MODE_PRIVATE);
                        SharedPreferences.Editor editor3 = sp3.edit();
                        editor3.clear();
                        editor3.commit();

                        SharedPreferences.Editor editor4 =getSharedPreferences("data2",MODE_PRIVATE).edit();
                        editor4.putInt("log",0);
                        editor4.apply();
                    }
                });
                dialog.setNegativeButton("否", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                dialog.show();
            }
        });
    }
}
