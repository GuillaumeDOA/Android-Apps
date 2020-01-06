package com.example.simpleasynctask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mText=findViewById(R.id.textView1);
    }

    public void startTask(View view) {
        mText.setText(R.string.napping);
        new SimpleAsyncTask(mText).execute();
    }
}
