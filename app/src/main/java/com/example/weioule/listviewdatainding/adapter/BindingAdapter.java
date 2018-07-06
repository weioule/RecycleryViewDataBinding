package com.example.weioule.listviewdatainding.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.weioule.listviewdatainding.R;
import com.example.weioule.listviewdatainding.databinding.ItemLayoutBinding;

import java.util.List;

/**
 * author weioule
 * Create on 2018/7/5.
 */
public class BindingAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private Context context;
    private List<String> data;

    public BindingAdapter(Context context, List<String> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemLayoutBinding binding = DataBindingUtil.inflate(LayoutInflater.from(context),
                R.layout.item_layout, parent, false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.getBinding().setItemName(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }
}
