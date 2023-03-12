package com.example.breath_ride;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AlertDialog;
import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;
import android.util.Log;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // Initialize the Firebase SDK
        FirebaseApp.initializeApp(this);

        // Get a reference to the Realtime Database
        DatabaseReference databaseRef = FirebaseDatabase.getInstance().getReference();

        // Attach a ValueEventListener to read data from the database
        databaseRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                Integer value = dataSnapshot.getValue(Integer.class);
                Log.d(TAG, "Value is: " + value);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });

        // Write data to the database - TEST
        databaseRef.setValue(0);


        Button uberBtn = findViewById(R.id.uberBtn);
        Button emergencyBtn = findViewById(R.id.emergencyBtn);
        uberBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            //Pop Up for Uber Request
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
            //Pop Up for Emergency Contact
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