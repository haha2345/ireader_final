package com.example.ireader;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.MenuItem;
import android.widget.TextView;

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

    private void switchFragment(int lastfragment,int index)
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
