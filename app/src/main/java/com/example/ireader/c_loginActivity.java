package com.example.ireader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class c_loginActivity extends AppCompatActivity {

    private TextView c_tv_title;
    private TextView c_tv_back;
    private EditText c_et_uname;
    private EditText c_et_upwd;
    private Button c_btn_login;
    private TextView c_tv_registre;
    private TextView c_tv_rpsw;

    private String uname,upwd,sppwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_login);
        //设置此界面为竖屏
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        init();
    }
    private void init(){

        c_tv_title=(TextView)findViewById(R.id.c_tv_title);
        c_tv_title.setText("登录");
        c_tv_back=(TextView)findViewById(R.id.c_tv_back);
        c_et_uname=(EditText)findViewById(R.id.c_et_uname);
        c_et_upwd=(EditText)findViewById(R.id.c_et_upwd);
        c_btn_login=(Button)findViewById(R.id.c_btn_login);
        c_tv_registre=(TextView)findViewById(R.id.c_tv_register);
        c_tv_rpsw=(TextView)findViewById(R.id.c_tv_rpsw);

        //判断是否登陆过
        SharedPreferences sp2 =getSharedPreferences("data2",MODE_PRIVATE);
        int log =sp2.getInt("log",0);
        String name =sp2.getString("name","");
        if(log==1){
            Intent intent=new Intent(c_loginActivity.this,w_main_pageActivity.class);
            intent.putExtra("uname",name);
            startActivity(intent);
            finish();
        }

        Intent intent =getIntent();
        String data=intent.getStringExtra("uname");
        c_et_uname.setText(data);


        //在登录页面点击返回销毁登录界面并跳转到index
        c_tv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent=new Intent(c_loginActivity.this,c_indexActivity.class);
//                startActivityForResult(intent,1);
                c_loginActivity.this.finish();
            }
        });
        //点击注册跳转到注册
        c_tv_registre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(c_loginActivity.this,c_registerActivity.class);
                startActivityForResult(intent, 1);
            }
        });
        //点击找回密码
        c_tv_rpsw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //暂时未实现
            }
        });
        //点击登录
        c_btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                uname=c_et_uname.getText().toString();
                upwd=c_et_upwd.getText().toString();

                SharedPreferences sp =getSharedPreferences("data",MODE_PRIVATE);
                String gname =sp.getString("name","");
                String gpwd =sp.getString("pwd","");

                if(uname.equals("admin") && upwd.equals("admin"))
                {

                    Intent intent=new Intent(c_loginActivity.this,w_main_pageActivity.class);
                    intent.putExtra("uname",uname);
                    startActivity(intent);

                    SharedPreferences.Editor editor =getSharedPreferences("data2",MODE_PRIVATE).edit();
                    editor.putInt("log",1);
                    editor.putString("name",uname);
                    editor.apply();
                    Toast.makeText(c_loginActivity.this,"登陆成功",Toast.LENGTH_SHORT).show();
                    finish();
                    return;
                }
                else if(TextUtils.isEmpty(uname))
                {
                    Toast.makeText(c_loginActivity.this,"请输入用户名",Toast.LENGTH_SHORT).show();
                    return;
                }else if (TextUtils.isEmpty(upwd))
                {
                    Toast.makeText(c_loginActivity.this,"请输入密码",Toast.LENGTH_SHORT).show();
                    return;
                }else if(uname.equals(gname) && upwd .equals(gpwd))
                {
                    Toast.makeText(c_loginActivity.this,"登陆成功",Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(c_loginActivity.this,w_main_pageActivity.class);
                    intent.putExtra("uname",uname);
                    startActivity(intent);
                    finish();
                    return;
                }else if(upwd!=null && upwd.equals(gpwd))
                {
                    Toast.makeText(c_loginActivity.this,"密码不一致",Toast.LENGTH_SHORT).show();
                    return;
                }else
                {
                    Toast.makeText(c_loginActivity.this,"用户名或密码错误",Toast.LENGTH_SHORT).show();
                    return;
                }
            }
        });
    }
}
