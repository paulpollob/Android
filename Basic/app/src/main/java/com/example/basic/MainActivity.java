package com.example.basic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Spinner spnr;
    private Button btn1, btn2;
    private String name[];
    private int pic[] = {
            R.drawable.narayan, R.drawable.narasimha, R.drawable.rama, R.drawable.krishna,
            R.drawable.gauranga, R.drawable.nityananda
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = getResources().getStringArray(R.array.name);

        btn1 = (Button) findViewById(R.id.btn1);
         btn1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Toast.makeText(MainActivity.this, "Horiboll", Toast.LENGTH_LONG).show();
             }
         });

         btn2 = (Button) findViewById(R.id.btn2);
         btn2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Toast.makeText(MainActivity.this, "Hare Krishna", Toast.LENGTH_SHORT).show();
             }
         });

         spnr = (Spinner) findViewById(R.id.snpnr);

         CustomAdapter adptr = new CustomAdapter(this, pic, name);

         spnr.setAdapter(adptr);

         spnr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
             @Override
             public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                 String nam = (String)(((TextView)(view.findViewById(R.id.txt1))).getText()) ;
                 Toast.makeText(MainActivity.this, (CharSequence) nam, Toast.LENGTH_SHORT).show();
             }

             @Override
             public void onNothingSelected(AdapterView<?> parent) {

             }
         });
    }
}