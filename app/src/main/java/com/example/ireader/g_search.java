package com.example.ireader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import android.widget.GridView;
import android.widget.SimpleAdapter;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class g_search extends AppCompatActivity {

    //搜索
    private SearchView  mSearch=null;

    private ListView mListview=null;
    private String[] mDates={"重生都市","刑警荣耀","遮天"};


    //列表

    private GridView mAppGridleview=null;
    private int[] mid={5};
    private String[] mname={
            "重生之都市","刑警荣耀","我的老妈是土豪","医武兵王","大主宰","顶级神豪","遮天"
    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.g_search_activity);

       //搜索
        mSearch=(SearchView)findViewById(R.id.searchvied);
        mListview=(ListView)findViewById(R.id.Listviewa);
        mListview.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,mDates ));
        mListview.setTextFilterEnabled(true);

        //获取页面组件
        mAppGridleview=(GridView)findViewById(R.id.g_gridview);

        //初始化数据，创建list对象，list对象的元素是Map
        List<Map<String,Object>>listItems=new ArrayList<Map<String,Object>>();

        for (int i=0;i<5;i++){
            Map<String,Object>listItem=new HashMap<String, Object>();

            listItem.put("name",mname[i]);
            listItems.add(listItem);

        }
        //创建一个SimpleAdapte

        SimpleAdapter simpleAdapter=new SimpleAdapter(this,listItems,R.layout.g_gridview_activity,new String[]{"name"},new int[]{R.id.g_name_tv});

        //为Gridview设置Adapter
        mAppGridleview.setAdapter(simpleAdapter);
        //添加监听器



        //搜索
        mSearch.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            // 当点击搜索按钮时触发该方法
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            // 当搜索内容改变时触发该方法
            @Override
            public boolean onQueryTextChange(String newText) {
                if (!TextUtils.isEmpty(newText)){
                    mListview.setFilterText(newText);
                }else{
                    mListview.clearTextFilter();
                }
                return false;
            }
        });

    }
}
