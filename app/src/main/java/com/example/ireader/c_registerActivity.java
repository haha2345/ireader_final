package com.example.ireader;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.text.TextUtils;//判断字符等功能


public class c_registerActivity extends AppCompatActivity {

    private TextView c_tv_title;
    private TextView c_tv_back;
    private EditText c_et_uname;
    private EditText c_et_upwd;
    private EditText c_et_rupwd;
    private Button c_btn_register;
    private String uname;
    private String upwd;
    private String rupwd;
    //定义布局
    private RelativeLayout c_title_bar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_register);

        init();
    }
    private void init() {
        c_tv_title = (TextView) findViewById(R.id.c_tv_title);
        c_tv_title.setText("注册");
        c_tv_back = (TextView) findViewById(R.id.c_tv_back);
        //布局根元素
        c_title_bar = (RelativeLayout) findViewById(R.id.c_title_bar);
        c_title_bar.setBackgroundColor(Color.TRANSPARENT);
        //获取控件值
        c_btn_register = (Button) findViewById(R.id.c_btn_register);
        c_et_uname = (EditText) findViewById(R.id.c_et_uname);
        c_et_upwd = (EditText) findViewById(R.id.c_et_upwd);
        c_et_rupwd = (EditText) findViewById(R.id.c_et_rupwd);


        c_btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                uname = c_et_uname.getText().toString().trim();
                upwd = c_et_upwd.getText().toString().trim();
                rupwd = c_et_rupwd.getText().toString().trim();

                SharedPreferences sp = getSharedPreferences("data", MODE_PRIVATE);
                String name = sp.getString("name", "");
                String pwd = sp.getString("pwd", "");

                c_tv_title.setText(name + pwd);


                if (c_et_uname.length() < 1) {
                    Toast.makeText(c_registerActivity.this, "请输入用户名，用户名不能为空", Toast.LENGTH_SHORT).show();
                    return;
                } else if (c_et_upwd.length() < 1 || c_et_rupwd.length() < 1) {
                    Toast.makeText(c_registerActivity.this, "请输入密码，密码不能为空", Toast.LENGTH_SHORT).show();
                    return;
                }else if(uname.equals(name)){
                    Toast.makeText(c_registerActivity.this, "该用户已存在", Toast.LENGTH_SHORT).show();
                    return;
                }
                else if (rupwd.equals(upwd)) {
                    SharedPreferences.Editor editor = getSharedPreferences("data", MODE_PRIVATE).edit();
                    editor.putString("name", uname);
                    editor.putString("pwd", upwd);
                    editor.apply();
                       Intent intent=new Intent(c_registerActivity.this,c_loginActivity.class);
                       intent.putExtra("uname",uname);
                       startActivity(intent);
                    Toast.makeText(c_registerActivity.this, "注册成功", Toast.LENGTH_SHORT).show();
                    finish();
                } else if (!rupwd.equals(upwd)) {
                    Toast.makeText(c_registerActivity.this, "两次密码不正确", Toast.LENGTH_SHORT).show();
                    return;
                }

            }
        });
        c_tv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
  /*      c_tv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(c_registerActivity.this,c_loginActivity.class);
                intent.putExtra("uname",uname);
                startActivity(intent);
                finish();
            }
        });
    }
*/
  /*  //查询用户名是否存在
    private boolean isExistUserName(String userName){
        boolean hasuname=false;
        SharedPreferences sp=getSharedPreferences("data", MODE_PRIVATE);
        String sname=sp.getString(userName, "");//传入获取

        if(!TextUtils.isEmpty(sname)) {
            hasuname=true;
        }
        return hasuname;
    }*/
    /*保存用户名密码
    private void saveRegisterInfo(String userName,String psw){
        SharedPreferences sp=getSharedPreferences("c_loginInfo", MODE_PRIVATE);
        //获取编辑器， SharedPreferences.Editor  editor -> sp.edit();
        SharedPreferences.Editor editor=sp.edit();
        //以用户名为key，密码为value保存在SharedPreferences中
        editor.putString(userName, psw);
        //提交修改 editor.commit();
        editor.commit();
    }*/
}
