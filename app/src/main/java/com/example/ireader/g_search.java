package com.example.ireader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
public class g_search extends AppCompatActivity {
    private SearchView  mSearch=null;
    private ListView mListview=null;
    private String[] mDates={"重生都市","刑警荣耀","我的老妈是土豪"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.g_search_activity);

        mSearch=(SearchView)findViewById(R.id.searchvied);
        mListview=(ListView)findViewById(R.id.Listviewa);
        mListview.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,mDates ));
        mListview.setTextFilterEnabled(true);



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
