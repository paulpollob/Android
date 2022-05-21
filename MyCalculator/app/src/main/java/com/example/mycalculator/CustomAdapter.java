package com.example.mycalculator;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter
{
    String CountryNames[];
    int flag[];
    Context context;
    LayoutInflater layoutinfalter ;

    public CustomAdapter(Context context, String CountryName[], int flag[])
    {
        this.context = context;
        this.flag = flag;
        this.CountryNames = CountryName;
    }
    @Override
    public int getCount() {
        return flag.length;
    }

    @Override
    public Object getItem(int position) {
        return CountryNames[position];
    }

    @Override
    public long getItemId(int position) {
        return 2;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        layoutinfalter = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        convertView = layoutinfalter.inflate(R.layout.custom, parent, false);

        ImageView img = (ImageView) convertView.findViewById(R.id.img);
        img.setImageResource(flag[position]);

        TextView txt = (TextView) convertView.findViewById(R.id.name);
        txt.setText(CountryNames[position]);

        TextView tx = (TextView) convertView.findViewById(R.id.des);
        tx.setText(CountryNames[position]);


        return convertView;
    }
}
