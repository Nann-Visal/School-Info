package com.example.school_info;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdapter extends BaseAdapter {

    Context context;
    String[] school_titles;
    int[] school_logos;

    LayoutInflater inflater;

    public GridAdapter(Context context, String[] school_titles, int[] school_logos) {
        this.context = context;
        this.school_titles = school_titles;
        this.school_logos = school_logos;
    }

    @Override
    public int getCount() {
        return school_titles.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(inflater == null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }if(view == null){
            view = inflater.inflate(R.layout.items_of_school_layout,null);
        }
        ImageView imageView = view.findViewById(R.id.items_of_school_logo);
        imageView.setImageResource(school_logos[i]);

        TextView textView = view.findViewById(R.id.items_of_school_title);
        textView.setText(school_titles[i]);
        return view;
    }
}
