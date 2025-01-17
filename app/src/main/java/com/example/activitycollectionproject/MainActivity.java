package com.example.activitycollectionproject;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnLayout, btnButton, btnCalculator, btnMatch3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnLayout = (Button) findViewById(R.id.btnLayoutExercise);
        btnLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent layoutActivity = new Intent(MainActivity.this, LayoutTestingActivity.class);
                startActivity(layoutActivity);
            }
        });
        btnCalculator = (Button) findViewById(R.id.btnCalculator);
        btnCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent layoutActivity = new Intent(MainActivity.this, CalculatorExercise.class);
                startActivity(layoutActivity);
            }
        });
        btnMatch3 = (Button) findViewById(R.id.btnMatch3);
        btnMatch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buttonActivity = new Intent(MainActivity.this, activity_button_exercise.class);
                startActivity(buttonActivity);
            }
        });

        btnButton = (Button) findViewById(R.id.btnButtonExercise);
        btnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buttonActivity = new Intent(MainActivity.this, activity_button_exercise.class);
                startActivity(buttonActivity);
            }
        });
    }
}