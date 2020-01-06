package com.example.droidcafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {

    TextView order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        order=findViewById(R.id.order_text);
        Intent intent = getIntent();
        String ordermessage = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        order.setText(ordermessage);
    }
}
