package com.example.krishnafirst;

import androidx.appcompat.app.AppCompatActivity;

import android.app.UiAutomation;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.*;


public class MainActivity extends AppCompatActivity {
    private EditText firstNumber, secondNumber, operator;
    double FirstNumber, SecondNumber;
    private Button calculate;
    private TextView answer;
    private String op;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumber = (EditText) findViewById(R.id.firstNumber);

        secondNumber =(EditText) findViewById(R.id.secondNumber);

        operator = (EditText) findViewById(R.id.operator);


        answer = (TextView) findViewById(R.id.answer);

        calculate = (Button) findViewById(R.id.calculate);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast tst = Toast.makeText(MainActivity.this, "Hare Krishna", Toast.LENGTH_LONG);
                tst.setGravity(Gravity.CENTER, 0, 0);

                try {
                    FirstNumber = Double.parseDouble(firstNumber.getText().toString());
                }
                catch(Exception e)
                {

                }
                try {
                    SecondNumber = Double.parseDouble(secondNumber.getText().toString());
                }
                catch(Exception e2)
                {

                }
                try {
                    op = operator.getText().toString();

                }
                catch(Exception e3) {}
                String rslt="";
                switch(op)
                {
                    case "+":
                        rslt = Double.toString(FirstNumber+SecondNumber);
                        break;
                    case "-":
                        rslt = Double.toString(FirstNumber-SecondNumber);
                        break;
                    case "/":
                        rslt = Double.toString(FirstNumber/SecondNumber);
                        break;
                    case "*":
                        rslt = Double.toString(FirstNumber*SecondNumber);
                        break;
                }
                answer.setText(rslt);
                tst.setText(rslt);
                tst.show();
                /*
                Toast tst = Toast.makeText(null, "Hare Krishna", Toast.LENGTH_LONG);
                tst.setGravity(Gravity.CENTER, 0, 0);
                Toast.makeText(null, Gravity.CENTER, Toast.LENGTH_LONG);
                tst.show();

                 */

            }
        });

    }
}