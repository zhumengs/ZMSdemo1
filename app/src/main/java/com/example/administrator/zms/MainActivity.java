package com.example.administrator.zms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.administrator.zms.recyclerview.LinearRecyclerViewActivity;

public class MainActivity extends AppCompatActivity {

    private Button mBtnSelectAddress;
    private Button mBtnRv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnSelectAddress = findViewById(R.id.btn_selectaddress);
        mBtnSelectAddress.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //跳转到选择地址界面
                Intent intent = new Intent(MainActivity.this,SelectAddressActivity.class);
                startActivity(intent);
            }

        }
        );
        mBtnRv = findViewById(R.id.btn_recyclerview);
        mBtnSelectAddress.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this,LinearRecyclerViewActivity.class);
                startActivity(intent);
            }
        }
        );


       //push


    }
}
