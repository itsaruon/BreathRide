package com.example.breath_ride;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SoberActivity extends AppCompatActivity {
    private TextView sober_message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sober);

        sober_message = findViewById(R.id.soberMessage);


    }
}