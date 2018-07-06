package com.example.weioule.listviewdatainding.act;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableArrayMap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.weioule.listviewdatainding.R;
import com.example.weioule.listviewdatainding.bean.Bean;
import com.example.weioule.listviewdatainding.bean.Bean2;
import com.example.weioule.listviewdatainding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("MainActivity");

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        final Bean bean = new Bean();
        bean.setTitle("等待2秒钟后自动刷新数据！");
        binding.setBean(bean);

        final Bean2 bean2 = new Bean2();
        bean2.name.set("张三");
        bean2.age.set(23);
        binding.setBean2(bean2);

        final ObservableArrayList<Object> list = new ObservableArrayList<>();
        list.add("李四");
        list.add(24);
        binding.setList(list);

        final ObservableArrayMap<String, Object> map = new ObservableArrayMap<>();
        map.put("name", "王五");
        map.put("age", "25");
        binding.setMap(map);


        //模拟刷新数据
        binding.btn.postDelayed(new Runnable() {
            @Override
            public void run() {
                bean.setTitle("垚鑫");
            }
        }, 2000);
        binding.btn.postDelayed(new Runnable() {
            @Override
            public void run() {
                bean2.name.set("张三三");
                bean2.age.set(233);
            }
        }, 2000);
        binding.btn.postDelayed(new Runnable() {
            @Override
            public void run() {
                list.add(0, "李四四");
                list.add(1, 244);
            }
        }, 2000);
        binding.btn.postDelayed(new Runnable() {
            @Override
            public void run() {
                map.put("name", "王五五");
                map.put("age", "255");
            }
        }, 2000);

    }

    public void doNext(View view) {
        startActivity(new Intent(this, SecondAvtivity.class));
    }
}
