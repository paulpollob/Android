package com.example.myandroid;

import static com.example.myandroid.R.array.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;
import android.widget.Toast;

public class ExpendableList extends AppCompatActivity {
    //private ExpandableListView xpnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expendable_list);
/*
//        xpnd = (ExpandableListView) findViewById(R.id.xpnd);


        String header[] = getResources().getStringArray(R.array.header);

        for(int i=0; i<header.length; i++)
        {
            Toast.makeText(this, "Number is: "+header[i], Toast.LENGTH_SHORT).show();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/

//        CustomAdapter adptr = CustomAdapter();

    }
}