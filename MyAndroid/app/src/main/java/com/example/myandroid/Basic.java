package com.example.myandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class Basic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);

        Intent intent = getIntent();
        intent.getExtras();

        String msg = intent.getStringExtra("message");

        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}