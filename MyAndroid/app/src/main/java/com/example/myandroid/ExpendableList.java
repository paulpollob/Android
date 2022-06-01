package com.example.myandroid;

import static com.example.myandroid.R.array.*;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ExpendableList extends AppCompatActivity {
    private ExpandableListView xpnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expendable_list);


        xpnd = (ExpandableListView) findViewById(R.id.xpnd);


//        String header[] = getResources().getStringArray(R.array.header);

        List<String> header = Arrays.asList(getResources().getStringArray(R.array.header));
        HashMap<String, List<String>> Child = new HashMap<String, List<String>>();

        for(int i=0; i<header.size(); i++)
        {
            List<String> childd = new ArrayList<String>();
            if((header.get(i)).equals("Sylhet")) childd = Arrays.asList(getResources().getStringArray(Sylhet));
            else if(header.get(i).equals("Dhaka")) { childd = Arrays.asList(getResources().getStringArray(R.array.Dhaka));}
            else if(header.get(i).equals("Chittagang")) { childd = Arrays.asList(getResources().getStringArray(R.array.Chittagong));}
            else if(header.get(i).equals("Barishal")) { childd = Arrays.asList(getResources().getStringArray(R.array.Barishal));}
            else if(header.get(i).equals("Khulna")) { childd = Arrays.asList(getResources().getStringArray(R.array.Khulna));}
            else if(header.get(i).equals("Rajshahi")) { childd = Arrays.asList(getResources().getStringArray(R.array.Rajshahi));}
            else if(header.get(i).equals("Rangpur")) { childd = Arrays.asList(getResources().getStringArray(R.array.Rangpur));}
            else if(header.get(i).equals("Mymensingh")) { childd = Arrays.asList(getResources().getStringArray(R.array.Mymensingh));}


            Child.put(header.get(i), childd);
        }


        /*Toast.makeText(this, "Expendable activity started", Toast.LENGTH_SHORT).show();
        for(int i=0; i<header.size(); i++)
        {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Toast.makeText(this, "Number is: "+header.get(i)+": "+i, Toast.LENGTH_SHORT).show();
        }*/

        CustomAdapter adptr = new CustomAdapter(this, Child, header);

        xpnd.setAdapter(adptr);

    }
}