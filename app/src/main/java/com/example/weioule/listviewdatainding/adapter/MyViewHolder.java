package com.example.weioule.listviewdatainding.adapter;

import android.support.v7.widget.RecyclerView;

import com.example.weioule.listviewdatainding.databinding.ItemLayoutBinding;

/**
 * author weioule
 * Create on 2018/7/5.
 */
public class MyViewHolder extends RecyclerView.ViewHolder {
    private ItemLayoutBinding binding;

    public MyViewHolder(ItemLayoutBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public ItemLayoutBinding getBinding() {
        return binding;
    }
}
