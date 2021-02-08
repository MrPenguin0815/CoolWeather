package com.example.coolweather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //这里记录一点疑问
    //为什么都可以直接去服务器上查，还要搞数据库？迁移到网易 该怎么用？因为姐姐们对本地数据的缓存也有要求

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}