package com.example.ireader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class x_shuping extends AppCompatActivity {
    LinearLayout x_sp1;
    LinearLayout x_sp2;
    LinearLayout x_sp3;
    LinearLayout x_sp4;
    LinearLayout x_sp5;
    LinearLayout x_sp6;
    LinearLayout x_sp7;
    LinearLayout x_sp8;
    LinearLayout x_sp9;
    LinearLayout x_sp10;
    LinearLayout x_sp11;
    LinearLayout x_sp12;
    LinearLayout x_sp13;
    LinearLayout x_sp14;
    LinearLayout x_sp15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_x_shuping);
        initView();
        jianting();

    }
    public void initView(){
        x_sp1 = (LinearLayout) findViewById(R.id.x_sp1);
        x_sp2 = (LinearLayout) findViewById(R.id.x_sp2);
        x_sp3 = (LinearLayout) findViewById(R.id.x_sp3);
        x_sp4 = (LinearLayout) findViewById(R.id.x_sp4);
        x_sp5 = (LinearLayout) findViewById(R.id.x_sp5);
        x_sp6 = (LinearLayout) findViewById(R.id.x_sp6);
        x_sp7 = (LinearLayout) findViewById(R.id.x_sp7);
        x_sp8 = (LinearLayout) findViewById(R.id.x_sp8);
        x_sp9 = (LinearLayout) findViewById(R.id.x_sp9);
        x_sp10 = (LinearLayout) findViewById(R.id.x_sp10);
        x_sp11 = (LinearLayout) findViewById(R.id.x_sp11);
        x_sp12 = (LinearLayout) findViewById(R.id.x_sp12);
        x_sp13 = (LinearLayout) findViewById(R.id.x_sp13);
        x_sp14= (LinearLayout) findViewById(R.id.x_sp14);
        x_sp15= (LinearLayout) findViewById(R.id.x_sp15);

    }
    public void clickListenerOper(View view){
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.x_sp1:
                        tiao1();
                        break;
                    case R.id.x_sp2:
                        tiao2();
                        break;
                    case R.id.x_sp3:
                        tiao3();
                        break;
                    case R.id.x_sp4:
                        tiao3();
                        break;
                    case R.id.x_sp5:
                        tiao3();
                        break;
                    case R.id.x_sp6:
                        tiao2();
                        break;
                    case R.id.x_sp7:
                        tiao1();
                        break;
                    case R.id.x_sp8:
                        tiao1();
                        break;
                    case R.id.x_sp9:
                        tiao3();
                        break;
                    case R.id.x_sp10:
                        tiao2();
                        break;
                    case R.id.x_sp11:
                        tiao3();
                        break;
                    case R.id.x_sp12:
                        tiao1();
                        break;
                    case R.id.x_sp13:
                        tiao2();
                        break;
                    case R.id.x_sp14:
                        tiao3();
                        break;
                    case R.id.x_sp15:
                        tiao1();
                        break;
                }
            }
        });
    }
    public void tiao1(){
        Intent intent=new Intent(x_shuping.this,x_shuping1.class);
        startActivity(intent);
    }
    public void tiao2() {
        Intent intent = new Intent(x_shuping.this, x_shuping2.class);
        startActivity(intent);
    }
    public void tiao3(){
        Intent intent=new Intent(x_shuping.this,x_shuping3.class);
        startActivity(intent);
    }
    public void jianting(){
        clickListenerOper(x_sp1);
        clickListenerOper(x_sp2);
        clickListenerOper(x_sp3);
        clickListenerOper(x_sp4);
        clickListenerOper(x_sp5);
        clickListenerOper(x_sp6);
        clickListenerOper(x_sp7);
        clickListenerOper(x_sp8);
        clickListenerOper(x_sp9);
        clickListenerOper(x_sp10);
        clickListenerOper(x_sp11);
        clickListenerOper(x_sp12);
        clickListenerOper(x_sp13);
        clickListenerOper(x_sp14);
        clickListenerOper(x_sp15);

    }
}

