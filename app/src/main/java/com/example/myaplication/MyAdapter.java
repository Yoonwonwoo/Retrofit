package com.example.myaplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.myaplication.model.Articles;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends BaseAdapter {
    List<Articles> items;

    public MyAdapter(List<Articles> items) {
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list,null,false);

        TextView textView = v.findViewById(R.id.textView);
        textView.setText(items.get(position).getTitle());

        return v;
    }
}
