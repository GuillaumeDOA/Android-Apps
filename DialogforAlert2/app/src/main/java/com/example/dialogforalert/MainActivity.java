package com.example.dialogforalert;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowAlert(View view) {
        AlertDialog.Builder myAlertBuilder = new
                                    AlertDialog.Builder(MainActivity.this);
        //Title and Message
        myAlertBuilder.setTitle(getString(R.string.alert_title));
        myAlertBuilder.setMessage(getString(R.string.alert_message));
        //Dialog Buttons
        myAlertBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //user clicked OK
                Toast.makeText(MainActivity.this, "Clicked OK", Toast.LENGTH_SHORT).show();
            }
        });
        myAlertBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Clicked Cancel", Toast.LENGTH_SHORT).show();
            }
        });
        //Create and show Alertdialog
        myAlertBuilder.show();
    }
}
