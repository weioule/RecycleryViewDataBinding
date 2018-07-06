package com.example.weioule.listviewdatainding.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.weioule.listviewdatainding.BR;

/**
 * author weioule
 * Create on 2018/7/4.
 */
public class Bean extends BaseObservable {
    private String title;

    @Bindable
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        notifyPropertyChanged(BR.title);
    }
}
