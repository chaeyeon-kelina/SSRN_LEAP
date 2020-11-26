package com.example.ssrn;

import android.graphics.drawable.Drawable;

public class favorite_store_data  {
    private Drawable icon;
    private String store;

    public favorite_store_data(int poster, String movieName){
        this.icon = icon;
        this.store = store;
    }

    public Drawable getIcon()
    {
        return this.icon;
    }

    public String getStore()
    {
        return this.store;
    }
}