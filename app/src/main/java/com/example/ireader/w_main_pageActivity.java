package com.example.ireader;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class w_main_pageActivity extends AppCompatActivity {
    private TextView mTextMessage;
    private  w_booklist_Fragment bookListFragment;
    private w_contact_Fragment contactFragment;
    private w_find_Fragment findFragment;
    private Fragment[] fragments;
    private int lastfragment;//用于记录上个选择的Fragment


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                {
                    if(lastfragment!=0)
                    {
                        switchFragment(lastfragment,0);
                        lastfragment=0;

                    }
                    return true;
                }
                case R.id.navigation_dashboard:
                {
                    if(lastfragment!=1)
                    {
                        switchFragment(lastfragment,1);
                        lastfragment=1;

                    }
                    return true;
                }

                case R.id.navigation_notifications:
                {
                    if(lastfragment!=2)
                    {
                        switchFragment(lastfragment,2);
                        lastfragment=2;

                    }
                    return true;
                }
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_w_main_page);


        BottomNavigationView navView = findViewById(R.id.nav_view);
        mTextMessage = findViewById(R.id.message);
        initFragment();
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {//新建三个小点
        getMenuInflater().inflate(R.menu.w_menu,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {//菜单的点击事件
        switch (item.getItemId()){
            case R.id.w_menu_item1:
                Toast.makeText(this,"正在搜索目录。。。",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(this,w_list_Activity.class);
                startActivity(intent);
                break;
            case R.id.w_menu_item2:
                //huo qu yong hu ming
                Intent intent5 = getIntent();
                String name = intent5.getStringExtra("uname");

                Intent intent1=new Intent(this,c_grActivity.class);
                intent1.putExtra("uname",name);
                startActivity(intent1);
                break;
            case R.id.w_menu_item3:
                Intent intent2=new Intent(this,x_chuan.class);
                startActivity(intent2);
                break;
            case R.id.w_menu_item4:
                Intent intent3=new Intent(this,c_configActivity.class);
                startActivity(intent3);
                break;
            case R.id.w_menu_item5:
                Intent intent4=new Intent(this,w_detailActivity.class);
                startActivity(intent4);
                break;
                default:

        }
        return super.onOptionsItemSelected(item);
    }

    private void switchFragment(int lastfragment, int index)//选择fragment
    {
        FragmentTransaction transaction =getSupportFragmentManager().beginTransaction();
        transaction.hide(fragments[lastfragment]);//隐藏上个Fragment
        if(fragments[index].isAdded()==false)
        {
            transaction.add(R.id.pageholder,fragments[index]);


        }
        transaction.show(fragments[index]).commitAllowingStateLoss();


    }
    private void initFragment()//初始化
    {

        bookListFragment = new w_booklist_Fragment();
        contactFragment = new w_contact_Fragment();
        findFragment = new w_find_Fragment();
        fragments = new Fragment[]{bookListFragment,contactFragment,findFragment};
        lastfragment=0;
        getSupportFragmentManager().beginTransaction().replace(R.id.pageholder,bookListFragment).show(bookListFragment).commit();

    }

}
