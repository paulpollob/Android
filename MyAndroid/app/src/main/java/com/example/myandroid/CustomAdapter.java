package com.example.myandroid;

import static com.example.myandroid.R.layout.child_of_xpnded_list;
import static com.example.myandroid.R.layout.header_of_xpnded_list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;
import java.util.zip.Inflater;

public class CustomAdapter extends BaseExpandableListAdapter {
    Context context;
    HashMap<String, List<String>> child;
    List<String> header;
    public CustomAdapter(Context context, HashMap<String, List<String>> child, List<String>header )
    {
        this.context = context;
        this.child = child;
        this.header = header;
    }


    @Override
    public int getGroupCount() {
        return header.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return child.get(header.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return header.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return child.get(header.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int chilgroupPositiondPosition) {
        return groupPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        convertView = (View) inflater.inflate(header_of_xpnded_list, null);

        TextView txt = convertView.findViewById(R.id.header);

        txt.setText(header.get(groupPosition));


        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        convertView = (View) inflater.inflate(child_of_xpnded_list, null);

        TextView txt = convertView.findViewById(R.id.child);

        txt.setText(child.get(header.get(groupPosition)).get(childPosition));

        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
