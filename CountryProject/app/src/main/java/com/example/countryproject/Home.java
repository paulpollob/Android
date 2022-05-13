package com.example.countryproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
    Button bd, india, pakistan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bd = (Button) findViewById(R.id.bdbtn);
        Intent intent = new Intent(Home.this, information.class);
        bd.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                intent.putExtra("name", "bd");
                startActivity(intent);
            }
        });
        india = (Button) findViewById(R.id.indiabtn);
        india.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                intent.putExtra("name", "india");
                startActivity(intent);
            }
        });
        pakistan = (Button) findViewById(R.id.pakistanbtn);
        pakistan.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                intent.putExtra("name", "pakistan");
                startActivity(intent);
            }
        });

    }
}