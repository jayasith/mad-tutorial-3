package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    String no1,no2;
    int Number1,Number2;
    Button Add, Sub, Div, Multi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        no1 = getIntent().getExtras().getString("no1");
        no2 = getIntent().getExtras().getString("no2");
        ((EditText)findViewById(R.id.No1input)).setText(no1);
        ((EditText)findViewById(R.id.No2input)).setText(no2);

        Number1 = Integer.parseInt(no1);
        Number2 = Integer.parseInt(no2);

        OnClickButtonListener(Number1,Number2);
    }

    private void OnClickButtonListener(final int number1, final int number2) {
        Add = findViewById(R.id.addbtn);
        Sub = findViewById(R.id.subtrabtn);
        Div = findViewById(R.id.dividbtn);
        Multi = findViewById(R.id.multibtn);
        final TextView Answer = findViewById(R.id.answer);

        Add.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                      int  r = number1 + number2;
                        Answer.setText(number1 + " + " + number2 + " = " + r);
                    }
                }
        );
        Sub.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int r = number1 - number2;
                        Answer.setText(number1 + " + " + number2 + " = " + r);
                    }
                }

        );
        Div.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int r = number1 / number2;
                        Answer.setText(number1 + " + " + number2 + " = " + r);
                    }
                }

        );
        Multi.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int r = number1 * number2;
                        Answer.setText(number1 + " + " + number2 + " = " + r);
                    }
                }

        );

    }


}