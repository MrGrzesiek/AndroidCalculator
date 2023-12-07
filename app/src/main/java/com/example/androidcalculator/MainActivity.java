package com.example.androidcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Vibrator vibrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button exitButton = findViewById(R.id.Exit);
        Button advanceButton = findViewById(R.id.Advance);
        Button simpleButton = findViewById(R.id.Simple);
        Button aboutButton = findViewById(R.id.About);
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation.button_flash(v);
                animation.performVibration(vibrator);
                finish();
                System.exit(0);
            }
        });
        advanceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation.button_flash(v);
                animation.performVibration(vibrator);
                Intent intent = new Intent(MainActivity.this, AdvanceActivity.class);
                startActivity(intent);
            }
        });
        simpleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation.button_flash(v);
                animation.performVibration(vibrator);
                Intent intent = new Intent(MainActivity.this, SimpleActivity.class);
                startActivity(intent);
            }
        });
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation.button_flash(v);
                animation.performVibration(vibrator);
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });
    }
}