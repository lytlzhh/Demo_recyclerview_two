package com.example.llw.demo_recyclerview_two;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import adapter.com.Myadapter;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerId;
    public LinearLayoutManager layoutManager = null;
    public Myadapter myadapter = null;
    public int ITEMSIZE = 16;
    private String[] data = new String[]{"aa", "bb", "a", "b", "aaa", "bbb", "aaaa", "bbbb", "aa", "bb", "aa", "bb", "aa", "bb", "aa", "bb", "aa", "bb", "aa", "bb"};

    private void assignViews() {
        recyclerId = (RecyclerView) findViewById(R.id.recycler_id);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        assignViews();
        fun();
    }

    public void fun() {
        layoutManager = new LinearLayoutManager(this);
        recyclerId.setLayoutManager(layoutManager);
        recyclerId.setHasFixedSize(true);

        myadapter = new Myadapter(data);
        recyclerId.addItemDecoration(new Itemdecraction(ITEMSIZE));
        recyclerId.setAdapter(myadapter);

        myadapter.setOnItemClickListener(new Myadapter.OnRecyclerViewItemClickListener() {
            @Override
            public void onItemClick(View view, int data) {
                Toast.makeText(MainActivity.this, " :::" + data, Toast.LENGTH_SHORT).show();
            }
        });

    }


}
