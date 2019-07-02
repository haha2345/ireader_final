package com.example.ireader;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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
                Intent intent =new Intent(c_configActivity.this,c_loginActivity.class);
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
                        editor.apply();
                        SharedPreferences sp2 = getSharedPreferences("deta",MODE_PRIVATE);
                        SharedPreferences.Editor editor2 = sp2.edit();
                        editor2.clear();
                        editor2.apply();
                        SharedPreferences sp3 = getSharedPreferences("deta",MODE_PRIVATE);
                        SharedPreferences.Editor editor3 = sp3.edit();
                        editor3.clear();
                        editor3.apply();
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
