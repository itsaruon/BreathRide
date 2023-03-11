package com.example.breath_ride;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button uberBtn = findViewById(R.id.uberBtn);
        Button emergencyBtn = findViewById(R.id.emergencyBtn);

        uberBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Your Uber will arrive shortly")
                        .setTitle("Uber Request");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        emergencyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("We texted your emergency contact")
                        .setTitle("Emergency Contact Request");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
    }

}