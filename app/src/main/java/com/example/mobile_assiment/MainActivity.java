package com.example.mobile_assiment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button car = findViewById(R.id.car_button);
        Button bus =findViewById(R.id.bus_button);

        car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                carDialog();
            }
        });

        bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View c) {
                busDialog();
            }
        });
    }
    public void carDialog() {
        Intent car_dialog = new Intent(MainActivity.this , car_search.class);

        startActivity(car_dialog);
    }

    public void busDialog() {
        Intent BUS_dialog = new Intent(MainActivity.this , bus_search.class);

        startActivity(BUS_dialog);
    }
}
