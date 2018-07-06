package com.example.weioule.listviewdatainding.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.weioule.listviewdatainding.R;
import com.example.weioule.listviewdatainding.databinding.ItemLayoutBinding;

import java.util.List;

/**
 * author weioule
 * Create on 2018/7/5.
 */
public class ListViewBindingAdapter extends BaseAdapter {
    private Context context;
    private List<String> data;

    public ListViewBindingAdapter(Context context, List<String> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data == null ? 0 : data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        ListViewHolder holder = null;
        ItemLayoutBinding binding = null;
        if (convertView == null) {
            binding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.item_layout, viewGroup, false);
            holder = new ListViewHolder(binding);
            convertView = binding.getRoot();
            convertView.setTag(holder);
        } else {
            holder = (ListViewHolder) convertView.getTag();
            binding = holder.getBinding();
        }
        binding.setItemName(data.get(i));
        return convertView;
    }
}
