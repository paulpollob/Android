package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView list;
    private String countryName[];
    int flags[] = {R.drawable.belgium, R.drawable.brazil, R.drawable.canada,
            R.drawable.english, R.drawable.egypt, R.drawable.india, R.drawable.iran, R.drawable.israel,
            R.drawable.nepal, R.drawable.usa

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.list);

        countryName = getResources().getStringArray(R.array.CountryNames);
        CustomAdapter adptr = new CustomAdapter(this, countryName, flags);
        list.setAdapter(adptr);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast toast = Toast.makeText(MainActivity.this, countryName[position], Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}