package com.example.democustomizelistview;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class MyAdapter extends BaseAdapter {

    private Context context;
    private List<ItemApplication> dataSource;

    public MyAdapter(Context context, List<ItemApplication> dataSource) {
        this.context = context;
        this.dataSource = dataSource;
    }

    @Override
    public int getCount() {
        return dataSource.size();
    }

    @Override
    public Object getItem(int i) {
        return dataSource.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null){
          view = LayoutInflater.from(context).inflate(R.layout.item_application, viewGroup,false);
        }
        // Bind id
        ImageView imgApp = view.findViewById(R.id.imgApp);
        TextView tvApp = view.findViewById(R.id.tvAppName);
        RatingBar ratingBar = view.findViewById(R.id.rbApp);
        // Do du lieu vao view
        ItemApplication itemApplication = dataSource.get(i);
        tvApp.setText(itemApplication.getName());
        ratingBar.setRating(itemApplication.getRating());
        Glide.with(context).load(itemApplication.getImageURL()).into(imgApp);

        return view;
    }
}
