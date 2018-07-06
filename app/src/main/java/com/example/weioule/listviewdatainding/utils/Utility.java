package com.example.weioule.listviewdatainding.utils;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import com.example.weioule.listviewdatainding.adapter.BindingAdapter;
import com.example.weioule.listviewdatainding.adapter.ListViewBindingAdapter;

import java.util.List;

/**
 * author weioule
 * Create on 2018/7/5.
 */
public class Utility {

    @android.databinding.BindingAdapter("bind:bindData")
    public static void setAdapterAndData(RecyclerView recyclerView, List<String> data) {
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(new BindingAdapter(recyclerView.getContext(), data));
    }

    @android.databinding.BindingAdapter("bind:listData")
    public static void setAdapterAndData(ListView listView, List<String> data) {
        listView.setAdapter(new ListViewBindingAdapter(listView.getContext(), data));
    }
}
