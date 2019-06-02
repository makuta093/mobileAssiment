package com.example.mobile_assiment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class car_search extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_search);
        Button search = findViewById(R.id.car_search);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String car_to = ((EditText) findViewById(R.id.car_to)).getText().toString();

                String car_from = ((EditText) findViewById(R.id.car_from)).getText().toString();

                Intent carIntent = new Intent(car_search.this , car_map.class);
                carIntent.setClass(getApplicationContext(), car_map.class);
                carIntent.putExtra("car_from", car_from);
                carIntent.putExtra("car_to", car_to);

                startActivity(carIntent);


            }

                //String from_car_info = to_car_text.toString();

        });
    }
}
