package com.example.ireader;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class x_zhonghepinglun extends AppCompatActivity {
    LinearLayout x_zp1;
    LinearLayout x_zp2;
    LinearLayout x_zp3;
    LinearLayout x_zp4;
    LinearLayout x_zp5;
    LinearLayout x_zp6;
    LinearLayout x_zp7;
    LinearLayout x_zp8;
    LinearLayout x_zp9;
    LinearLayout x_zp10;
    LinearLayout x_zp11;
    LinearLayout x_zp12;
    LinearLayout x_zp13;
    LinearLayout x_zp14;
    LinearLayout x_zp15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_x_zhonghepinglun);
        initView();
        jianting();
    }
    public void initView() {
        x_zp1 = (LinearLayout) findViewById(R.id.x_zhpl1);
        x_zp2 = (LinearLayout) findViewById(R.id.x_zhpl2);
        x_zp3 = (LinearLayout) findViewById(R.id.x_zhpl3);
        x_zp4 = (LinearLayout) findViewById(R.id.x_zhpl4);
        x_zp5 = (LinearLayout) findViewById(R.id.x_zhpl5);
        x_zp6 = (LinearLayout) findViewById(R.id.x_zhpl6);
        x_zp7 = (LinearLayout) findViewById(R.id.x_zhpl7);
        x_zp8 = (LinearLayout) findViewById(R.id.x_zhpl8);
        x_zp9 = (LinearLayout) findViewById(R.id.x_zhpl9);
        x_zp10 = (LinearLayout) findViewById(R.id.x_zhpl10);
        x_zp11 = (LinearLayout) findViewById(R.id.x_zhpl11);
        x_zp12 = (LinearLayout) findViewById(R.id.x_zhpl12);
        x_zp13 = (LinearLayout) findViewById(R.id.x_zhpl3);
        x_zp14 = (LinearLayout) findViewById(R.id.x_zhpl14);
        x_zp15 = (LinearLayout) findViewById(R.id.x_zhpl15);
    }
    public void clickListenerOper(View view){
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.x_zhpl1:
                        tiao1();
                        break;
                    case R.id.x_zhpl2:
                        tiao2();
                        break;
                    case R.id.x_zhpl3:
                        tiao3();
                        break;
                    case R.id.x_zhpl4:
                        tiao1();
                        break;
                    case R.id.x_zhpl5:
                        tiao2();
                        break;
                    case R.id.x_zhpl6:
                        tiao3();
                        break;
                    case R.id.x_zhpl7:
                        tiao1();
                        break;
                    case R.id.x_zhpl8:
                        tiao2();
                        break;
                    case R.id.x_zhpl9:
                        tiao3();
                        break;
                    case R.id.x_zhpl10:
                        tiao1();
                        break;
                    case R.id.x_zhpl11:
                        tiao2();
                        break;
                    case R.id.x_zhpl12:
                        tiao3();
                        break;
                    case R.id.x_zhpl13:
                        tiao1();
                        break;
                    case R.id.x_zhpl14:
                        tiao2();
                        break;
                    case R.id.x_zhpl15:
                        tiao3();
                        break;

                }
            }
        });
    }
    public void tiao1(){
        Intent intent=new Intent(x_zhonghepinglun.this,x_zhonghepinglun1.class);
        startActivity(intent);
    }
    public void tiao2(){
        Intent intent=new Intent(x_zhonghepinglun.this,x_zhonghepinglun2.class);
        startActivity(intent);
    }
    public void tiao3(){
        Intent intent=new Intent(x_zhonghepinglun.this,x_zhonghepinglun3.class);
        startActivity(intent);
    }
    public void jianting(){
        clickListenerOper(x_zp1);
        clickListenerOper(x_zp2);
        clickListenerOper(x_zp3);
        clickListenerOper(x_zp4);
        clickListenerOper(x_zp5);
        clickListenerOper(x_zp6);
        clickListenerOper(x_zp7);
        clickListenerOper(x_zp8);
        clickListenerOper(x_zp9);
        clickListenerOper(x_zp10);
        clickListenerOper(x_zp11);
        clickListenerOper(x_zp12);
        clickListenerOper(x_zp13);
        clickListenerOper(x_zp14);
        clickListenerOper(x_zp15);

    }
}
