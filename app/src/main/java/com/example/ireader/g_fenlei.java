package com.example.ireader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class g_fenlei extends AppCompatActivity {

    private GridView mypp=null;
    private GridView myyp=null;
    private String[] mname={
            "玄幻","奇幻","武侠","仙侠","都市","职场","历史","军事","游戏","竞技","科幻","灵异","同人","校园"
    };

    private String[] mname2={
            "578861本","63527本","49539本","157375本","397620本","18546本","80869本","17214本","91203本","6750本","134180本","55182本","47029本","9900本"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.g_fenlei_activity);

        mypp=(GridView)findViewById(R.id.g_fen);

        myyp=(GridView)findViewById(R.id.g_fenm) ;
        List<Map<String,Object>>listitem=new ArrayList<Map<String, Object>>();

        for (int i=0;i< 14;i++){

            Map<String,Object>listite=new HashMap<String, Object>();
            listite.put("name",mname[i]);
            listite.put("name2",mname2[i]);
            listitem.add(listite);

        }
       //创建一个simpleadapter
        SimpleAdapter simpleAdapter=new SimpleAdapter(this,listitem,R.layout.g_feilei_activity,new String[]{"name","name2"},new int[]{R.id.g_text,R.id.g_text2});


        //为grifview设置adapter
        mypp.setAdapter(simpleAdapter);

        myyp.setAdapter(simpleAdapter);


    }
}
