package com.example.urich;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    boolean emma;
    TextView numberView;
    Random random=new Random();
    int getal=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberView=findViewById(R.id.numberView);
        emma=false;
    }

    public void Change(View view) {
        if(emma){
            emma=false;
        }else{
            emma=true;
        }
    }

    public void Roll(View view) {
        if(emma){
            getal = random.nextInt(7-4)+4;
            Log.d("getal","EMMA"+getal);
        }else {
            getal = random.nextInt(7-1)+1;
            Log.d("getal",""+getal);
        }
        numberView.setText(String.valueOf(getal));
    }

    public void Reset(View view) {
        numberView.setText("");
    }
}
