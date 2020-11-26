package com.example.ssrn;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FavoriteSotreAdapter extends BaseAdapter {

    Context mContext = null;
    LayoutInflater mLayoutInflater = null;
    ArrayList<favorite_store_data> listVeiwItemList =  new ArrayList<favorite_store_data>();

    public FavoriteSotreAdapter(Context context, ArrayList<favorite_store_data> data) {
        mContext = context;
        listVeiwItemList = data;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return listVeiwItemList.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public favorite_store_data getItem(int position) {
        return listVeiwItemList.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();

        // "listview_item" Layout을 inflate하여 convertView 참조 획득.
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.store_list, parent, false);
        }

        // 화면에 표시될 View(Layout이 inflate된)으로부터 위젯에 대한 참조 획득
        ImageView iconImageView = (ImageView) convertView.findViewById(R.id.student_place_icon) ;
        TextView textTextView = (TextView) convertView.findViewById(R.id.store_list) ;

        // Data Set(listViewItemList)에서 position에 위치한 데이터 참조 획득
        favorite_store_data listViewItem = listVeiwItemList.get(position);

        // 아이템 내 각 위젯에 데이터 반영
        iconImageView.setImageDrawable(listViewItem.getIcon());
        textTextView.setText(listViewItem.getStore());

        return convertView;
    }
}
