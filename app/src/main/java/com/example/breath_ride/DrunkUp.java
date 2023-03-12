package com.example.breath_ride;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DrunkUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drunk_up);

        Button uberBtn2 = findViewById(R.id.uberBtn2);
        Button emergencyBtn2 = findViewById(R.id.emergencyBtn2);
        uberBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            //Pop Up for Uber Request
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(DrunkUp.this);
                builder.setMessage("Your Uber will arrive shortly")
                        .setTitle("Uber Request");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
        emergencyBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            //Pop Up for Emergency Contact
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(DrunkUp.this);
                builder.setMessage("We texted your emergency contact")
                        .setTitle("Emergency Contact Request");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
    }
}