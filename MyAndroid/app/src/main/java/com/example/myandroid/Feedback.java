package com.example.myandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Feedback extends AppCompatActivity {
    EditText name, email, message;
    Button send, clear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        name = (EditText) findViewById(R.id.name);


        email = (EditText) findViewById(R.id.email);


        message = (EditText) findViewById(R.id.message);


        send = (Button) findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                        String nam = name.getText().toString();

                        String eml = email.getText().toString();

                        String msg = message.getText().toString();


                        Intent intent = new Intent(Intent.ACTION_SEND);

                        intent.setType("text/email");

                        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"paulpollob71@gmail.com"});
                        intent.putExtra(Intent.EXTRA_SUBJECT, "fFeedback from App");
                        intent.putExtra(Intent.EXTRA_TEXT, "Name: "+name+"\n Message: "+message);
                        startActivity(Intent.createChooser(intent, "Feedback with"));
                }
                catch(Exception e)
                {
                    Toast.makeText(Feedback.this, "Exception: "+e, Toast.LENGTH_SHORT).show();
                }

            }
        });

        clear = (Button) findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.setText("");
                email.setText("");
                message.setText("");
            }
        });

    }
}