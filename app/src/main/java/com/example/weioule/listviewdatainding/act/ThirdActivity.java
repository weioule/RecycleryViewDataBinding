package com.example.weioule.listviewdatainding.act;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.weioule.listviewdatainding.R;
import com.example.weioule.listviewdatainding.databinding.ActivityThirdBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * author weioule
 * Create on 2018/7/5.
 */
public class ThirdActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("ThirdActivity");

        ActivityThirdBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_third);

        final List<String> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add("item" + i);
        }

        binding.setData(list);
    }
}
