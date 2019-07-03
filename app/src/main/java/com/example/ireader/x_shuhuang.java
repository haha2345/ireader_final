package com.example.ireader;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class x_shuhuang extends Activity {
    private List<x_Fruit> fruitList = new ArrayList<x_Fruit>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_x_shuhuang);
        initFruits();
        x_FruitAdapter adapter=new x_FruitAdapter(x_shuhuang.this,R.layout.activity_x_shuhuang_item ,fruitList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        ListView listView1=(ListView)findViewById(R.id.list_view);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                tiao();
            }
        });
    }

    public void tiao(){
        Intent intent=new Intent(x_shuhuang.this,x_shuping1.class);
        startActivity(intent);
    }

    private void initFruits() {
        x_Fruit apple = new x_Fruit("我就是静静\n各位大佬又好看的书推荐吗", R.drawable.x_tx15);
        fruitList.add(apple);
        x_Fruit banana = new x_Fruit("给我书\n站好了我要说话了", R.drawable.x_tx13);
        fruitList.add(banana);
        x_Fruit orange = new x_Fruit("小黑\n不想说什么", R.drawable.x_tx14);
        fruitList.add(orange);
        x_Fruit watermelon = new x_Fruit("蛋糕\n我真是人才", R.drawable.x_tx12);
        fruitList.add(watermelon);
        x_Fruit pear = new x_Fruit("无颜祖\n难受呀", R.drawable.x_tx11);
        fruitList.add(pear);
        x_Fruit grape = new x_Fruit("艾琳娜\n怎么办才好", R.drawable.x_tx10);
        fruitList.add(grape);
        x_Fruit pineapple = new x_Fruit("小白\n这是怎么了", R.drawable.x_tx8);
        fruitList.add(pineapple);
        x_Fruit strawberry = new x_Fruit("以为\n心情很棒", R.drawable.x_tx7);
        fruitList.add(strawberry);
        x_Fruit cherry = new x_Fruit("叛逆\n对于追书的看法", R.drawable.x_tx6);
        fruitList.add(cherry);
        x_Fruit mango = new x_Fruit("童话\n心里有问题", R.drawable.x_tx2);
        fruitList.add(mango);
        x_Fruit mango1 = new x_Fruit("书虫\n快给我书", R.drawable.x_tx1);
        fruitList.add(mango1);
        x_Fruit mango2 = new x_Fruit("半梦半醒\n人真的是要有压力才知道自己可以", R.drawable.x_tx3);
        fruitList.add(mango2);
        x_Fruit mango3 = new x_Fruit("笨蛋\n真是没办法", R.drawable.x_tx4);
        fruitList.add(mango3);
        x_Fruit mango4 = new x_Fruit("书匠\n没书看真难受", R.drawable.x_tx5);
        fruitList.add(mango4);
        x_Fruit mango5 = new x_Fruit("你好啊\n以后我要自己写书", R.drawable.x_tx9);
        fruitList.add(mango5);
    }
}


