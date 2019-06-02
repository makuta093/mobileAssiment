package com.example.mobile_assiment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class buss extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buss);

        Intent carIntent = getIntent();

        String bus_from = carIntent.getStringExtra("bus_from");
        String bus_to = carIntent.getStringExtra("bus_to");

        Toast.makeText(this, "bus from is: " + bus_from + " \n and bus to is: " + bus_to, Toast.LENGTH_LONG).show();

    }
}
