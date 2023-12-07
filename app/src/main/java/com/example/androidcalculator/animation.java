package com.example.androidcalculator;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;

public class animation {
    public static void button_flash(View v){
        v.setAlpha(0.5f);

        // Opcjonalnie: Wróć do pierwotnego stanu alfa-kanału po krótkim czasie
        v.postDelayed(new Runnable() {
            @Override
            public void run() {
                v.setAlpha(1.0f);
            }
        }, 200); // 200 milisekund = 0,2 sekundy
    }
}
