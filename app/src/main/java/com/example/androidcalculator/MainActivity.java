package com.example.androidcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
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
                finish();
                System.exit(0);
            }
        });
        advanceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation.button_flash(v);
                Intent intent = new Intent(MainActivity.this, AdvanceActivity.class);
                startActivity(intent);
            }
        });
        simpleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation.button_flash(v);
                Intent intent = new Intent(MainActivity.this, SimpleActivity.class);
                startActivity(intent);
            }
        });
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation.button_flash(v);
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });
    }
}