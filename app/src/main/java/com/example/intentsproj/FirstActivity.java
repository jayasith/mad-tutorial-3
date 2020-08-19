package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    Button button;
    String firstNO,secondNo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

     OnClickButtonListener();
    }

    public void OnClickButtonListener(){
        button = (Button) findViewById(R.id.okbtn);

        button.setOnClickListener(new View.OnClickListener(){

                                      @Override
                                      public void onClick(View view) {
                                          Context context = getApplicationContext();
                                          CharSequence text = "You just clicked the OK button";
                                          int duration = Toast.LENGTH_SHORT;
                                          Toast toast = Toast.makeText(context,text,duration);
                                          toast.setGravity(Gravity.BOTTOM|Gravity.CENTER,0,0);
                                          Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                                          firstNO = ((EditText)findViewById(R.id.no1input)).getText().toString();
                                          secondNo =((EditText) findViewById(R.id.no2input)).getText().toString();
                                          intent.putExtra("no1",firstNO);
                                          intent.putExtra("no2",secondNo);
                                          startActivity(intent);
                                      }
                                  }
        );

    }
}