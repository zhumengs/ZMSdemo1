package com.example.administrator.zms.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.administrator.zms.R;

public class LinearRecyclerViewActivity extends AppCompatActivity {

    private RecyclerView mRvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_recycler_view);
        mRvMain = (RecyclerView)findViewById(R.id.rv_main);
        mRvMain.setLayoutManager(new LinearLayoutManager(LinearRecyclerViewActivity.this));
        mRvMain.setAdapter(new LinearAdapter(LinearRecyclerViewActivity.this));
    }
}
