package com.example.weioule.listviewdatainding.act;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.weioule.listviewdatainding.R;
import com.example.weioule.listviewdatainding.databinding.ActivitySecondBinding;

import java.util.ArrayList;
import java.util.List;


/**
 * author weioule
 * Create on 2018/7/5.
 */
public class SecondAvtivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("SecondAvtivity");

        ActivitySecondBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_second);

        final List<String> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add("item" + i);
        }

        binding.setData(list);

    }

    public void doNext(View view) {
        startActivity(new Intent(this, ThirdActivity.class));
    }
}
