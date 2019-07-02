package com.example.ireader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import com.example.ireader.R;
import static android.R.layout.simple_list_item_1;

public class g_leibiao extends AppCompatActivity implements AdapterView.OnItemClickListener, AdapterView.OnItemSelectedListener {

    private Spinner mProSpinner = null;
    private Spinner mBookSpinner = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.g_leibiao_activity);

        mProSpinner = (Spinner) findViewById(R.id.spin_one);
        mBookSpinner = (Spinner) findViewById(R.id.spin_two);

        String[] aee={"全部","精品"};

        String[] arr = { "默认排序", "最新发布","最多评论"};


        ArrayAdapter<String> adapterr = new ArrayAdapter<String>(this,
                simple_list_item_1, aee);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                simple_list_item_1, arr);

        mProSpinner.setAdapter(adapterr);
        mBookSpinner.setAdapter(adapter);

        mProSpinner.setOnItemSelectedListener(this);
        mBookSpinner.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
