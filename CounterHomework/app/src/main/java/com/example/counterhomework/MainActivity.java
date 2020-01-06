package com.example.counterhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView counter;
    EditText text;
    int counterInt=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter=findViewById(R.id.counter_view);
        text=findViewById(R.id.text_view);

        if(savedInstanceState!=null){
            counterInt=savedInstanceState.getInt("counter");
            counter.setText(""+counterInt);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if(counter.getVisibility()==View.VISIBLE){
            outState.putInt("counter",counterInt);
        }
    }

    public void CoountUp(View view) {
        counterInt++;
        counter.setText(""+counterInt);
    }
}
