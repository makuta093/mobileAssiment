package com.example.mobile_assiment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class bus_search extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_search);


        Button search = findViewById(R.id.bus_search);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String bus_to = ((EditText) findViewById(R.id.bus_to)).getText().toString();

                String bus_from = ((EditText) findViewById(R.id.bus_from)).getText().toString();

                Intent carIntent = new Intent(bus_search.this , bus_map.class);
                carIntent.setClass(getApplicationContext(), bus_map.class);
                carIntent.putExtra("bus_from", bus_from);
                carIntent.putExtra("bus_to", bus_to);

                startActivity(carIntent);


            }

            //String from_car_info = to_car_text.toString();

        });
    }
}
