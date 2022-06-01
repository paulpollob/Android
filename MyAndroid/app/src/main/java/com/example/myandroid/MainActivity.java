package com.example.myandroid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(this);

        btn2 = (Button) findViewById(R.id.calculator);
        btn2.setOnClickListener(this);

        btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(this);

    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_lalyout, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.shareid)
        {
            Toast.makeText(this, "Hare Krishna please share the app.", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");

            String sub = "My app";
            String body = "This help is very useful to learn c programing. contact with paulpollob71@gmail.com(gmail)";

            intent.putExtra(Intent.EXTRA_SUBJECT, sub);
            intent.putExtra(Intent.EXTRA_TEXT, body);

            startActivity(Intent.createChooser(intent, " share with."));
        }
        else if(item.getItemId() == R.id.feedback)
        {
            Intent  intent = new Intent(this, Feedback.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }



    @Override
    public void onClick(View v) {
        if(v.getId() == btn1.getId())
        {
            Toast.makeText(MainActivity.this, "Hare Krishna", Toast.LENGTH_SHORT).show();

            Intent  intent = new Intent(this, ExpendableList.class);
            startActivity(intent);

        }
        else if(v.getId() == btn2.getId())
        {
            Intent  intent = new Intent(MainActivity.this, Calculator.class);
            intent.putExtra("message", "Hare Krishna from second button");
            startActivity(intent);
        }
        else if(v.getId() == btn3.getId())
        {
            Intent  intent = new Intent(this, Basic.class);
            intent.putExtra("message", "Hare Krishna from third button");
            startActivity(intent);
        }


    }
}