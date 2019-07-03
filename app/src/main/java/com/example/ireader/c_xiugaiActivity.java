package com.example.ireader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class c_xiugaiActivity extends AppCompatActivity {

    private EditText c_et_name;
    private EditText c_et_sex;
    private EditText c_et_shengri;
    private EditText c_et_dianhua;
    private EditText c_et_emali;
    private EditText c_et_qq;
    private EditText c_et_weixin;
    private Button c_btn_bc;
    private TextView c_tv_back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_xiugai);

    c_et_name=(EditText)findViewById(R.id.c_et_name);
    c_et_sex=(EditText)findViewById(R.id.c_et_sex);
    c_et_shengri=(EditText)findViewById(R.id.c_et_shengri);
    c_et_dianhua=(EditText)findViewById(R.id.c_et_dianhua);
    c_et_emali=(EditText)findViewById(R.id.c_et_email);
    c_et_qq=(EditText)findViewById(R.id.c_et_qq);
    c_et_weixin=(EditText)findViewById(R.id.c_et_weixin);

    c_btn_bc=(Button)findViewById(R.id.c_btn_bc);
    c_tv_back=(TextView)findViewById(R.id.c_tv_back);

        Intent intent=getIntent();
        String name1=intent.getStringExtra("name");
        String sex1=intent.getStringExtra("sex");
        String shengri1=intent.getStringExtra("shengri");
        String dianhua1=intent.getStringExtra("dianhua");
        String email1=intent.getStringExtra("email");
        String qq1=intent.getStringExtra("qq");
        String weixin1=intent.getStringExtra("weixin");
        c_et_name.setText(name1);
        c_et_sex.setText(sex1);
        c_et_shengri.setText(shengri1);
        c_et_dianhua.setText(dianhua1);
        c_et_emali.setText(email1);
        c_et_qq.setText(qq1);
        c_et_weixin.setText(weixin1);

        c_btn_bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=c_et_name.getText().toString().trim();
                String sex=c_et_sex.getText().toString().trim();
                String shengri=c_et_shengri.getText().toString().trim();
                String dianhua=c_et_dianhua.getText().toString().trim();
                String email=c_et_emali.getText().toString().trim();
                String qq=c_et_qq.getText().toString().trim();
                String weixin=c_et_weixin.getText().toString().trim();

                SharedPreferences.Editor editor = getSharedPreferences("data3", MODE_PRIVATE).edit();
                editor.putString("name", name);
                editor.putString("sex", sex);
                editor.putString("shengri",shengri);
                editor.putString("dianhua",dianhua);
                editor.putString("email",email);
                editor.putString("qq",qq);
                editor.putString("weixin",weixin);
                editor.apply();

                Intent intent1 =new Intent(c_xiugaiActivity.this,c_xggrActivity.class);
                startActivity(intent1);
                finish();

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
