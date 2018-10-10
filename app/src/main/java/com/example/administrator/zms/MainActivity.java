package com.example.administrator.zms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mBtnSelectAddress;

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

        });


    }
}
