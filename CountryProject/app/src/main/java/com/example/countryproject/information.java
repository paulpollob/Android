package com.example.countryproject;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class information extends AppCompatActivity {
    ImageView btn;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        Bundle bndl = getIntent().getExtras();

        txt = (TextView) findViewById(R.id.text);
        btn = (ImageView) findViewById(R.id.img);
        try {
            String name = bndl.getString("name");
            if(name.equals("bd"))
            {
                btn.setImageResource(R.drawable.bdgov);
                txt.setText(R.string.bddetails);
            }
            else if(name.equals("india"))
            {
                btn.setImageResource(R.drawable.indiagov);
                txt.setText(R.string.indiadetails);
            }
            else
            {
                btn.setImageResource(R.drawable.pakistangov);
                txt.setText(R.string.pakistandetails);
            }
        }
        catch(Exception e)
        {
            Toast.makeText(this, "Reasource could not found", Toast.LENGTH_SHORT).show();
        }



    }
}