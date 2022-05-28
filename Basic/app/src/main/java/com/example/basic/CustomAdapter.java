package com.example.basic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    int pic[];
    String names[];
    Context context;

    public CustomAdapter(Context context, int pic[], String names[])
    {
        this.context = context;
        this.pic = pic;
        this.names = names;
    }

    @Override
    public int getCount() { return names.length; }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.sampleview, parent, false);

        ImageView img = convertView.findViewById(R.id.img);
        TextView txt = convertView.findViewById(R.id.txt1);
        TextView txt2 = convertView.findViewById(R.id.txt2);
        img.setImageResource(pic[position]);
        txt.setText(names[position]);

        return convertView;
    }
}
