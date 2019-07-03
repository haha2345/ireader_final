package com.example.ireader;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import android.app.ProgressDialog;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class x_chuan extends AppCompatActivity {

    private ImageButton x_ib;
    private EditText x_ed;
    String ip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_x_chuan);
        x_ib = findViewById(R.id.x_kaishi);
        x_ed = findViewById(R.id.x_shuru);
        x_ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            ip= x_ed.getText().toString();
            if(isIP(ip)){
                AlertDialog alert=new AlertDialog.Builder(x_chuan.this).create();
                alert.setTitle("传书");
                alert.setMessage("真的要上传此书吗？");
                //添加取消按钮
                alert.setButton(DialogInterface.BUTTON_NEGATIVE,"不",new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // TODO Auto-generated method stub

                    }
                });
                //添加"确定"按钮
                alert.setButton(DialogInterface.BUTTON_POSITIVE,"是的", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        Intent intent=new Intent(x_chuan.this,g_ziye.class);
                        startActivity(intent);
                    }
                });
                alert.show();
            }
            else {
                Toast.makeText(x_chuan.this,"输入正确的IP",Toast.LENGTH_SHORT).show();
            }
            }
        });

    }
    public boolean isIP(String addr) {
        if (addr.length() < 7 || addr.length() > 15 || "".equals(addr)) {
            return false;
        }
        String rexp = "([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}";

        Pattern pat = Pattern.compile(rexp);

        Matcher mat = pat.matcher(addr);

        boolean ipAddress = mat.find();

        return ipAddress;
    }
}
