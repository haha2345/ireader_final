package com.example.ireader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class c_xggrActivity extends AppCompatActivity {


    private TextView c_tv_name;
    private TextView c_tv_sex;
    private TextView c_tv_shengri;
    private TextView c_tv_dianhua;
    private TextView c_tv_email;
    private TextView c_tv_qq;
    private TextView c_tv_weixin;
    private Button c_btn_xg;
    private  TextView c_tv_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_xggr);

        c_tv_name=(TextView)findViewById(R.id.c_tv_name);
        c_tv_sex=(TextView)findViewById(R.id.c_tv_sex);
        c_tv_shengri=(TextView)findViewById(R.id.c_tv_shengri);
        c_tv_dianhua=(TextView)findViewById(R.id.c_tv_dianhua);
        c_tv_email=(TextView)findViewById(R.id.c_tv_email);
        c_tv_qq=(TextView)findViewById(R.id.c_tv_qq);
        c_tv_weixin=(TextView)findViewById(R.id.c_tv_weixin);

        c_btn_xg=(Button)findViewById(R.id.c_btn_xg);

        c_tv_back=(TextView)findViewById(R.id.c_tv_back);
        SharedPreferences sp =getSharedPreferences("data3",MODE_PRIVATE);
        String name =sp.getString("name","");
        String sex =sp.getString("sex","");
        String shengri =sp.getString("shengri","");
        String dianhua =sp.getString("dianhua","");
        String email =sp.getString("email","");
        String qq =sp.getString("qq","");
        String weixin =sp.getString("weixin","");

        c_tv_name.setText(name);
        c_tv_sex.setText(sex);
        c_tv_shengri.setText(shengri);
        c_tv_dianhua.setText(dianhua);
        c_tv_email.setText(email);
        c_tv_qq.setText(qq);
        c_tv_weixin.setText(weixin);

        c_btn_xg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name1=c_tv_name.getText().toString().trim();
                String sex1=c_tv_sex.getText().toString().trim();
                String shengri1=c_tv_shengri.getText().toString().trim();
                String dianhua1=c_tv_dianhua.getText().toString().trim();
                String email1=c_tv_email.getText().toString().trim();
                String qq1 =c_tv_qq.getText().toString().trim();
                String weixin1=c_tv_weixin.getText().toString().trim();


                Intent intent = new Intent(c_xggrActivity.this,c_xiugaiActivity.class);
                intent.putExtra("name",name1);
                intent.putExtra("sex",sex1);
                intent.putExtra("shengri",shengri1);
                intent.putExtra("dianhua",dianhua1);
                intent.putExtra("email",email1);
                intent.putExtra("qq",qq1);
                intent.putExtra("weixin",weixin1);
                startActivity(intent);
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
