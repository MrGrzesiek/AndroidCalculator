package com.example.androidcalculator;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.os.VibrationEffect;
import android.os.Vibrator;
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
    public static void performVibration(Vibrator vibrator) {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            // Wibracja dla urządzeń z Androidem Oreo (8.0) i nowszymi
            VibrationEffect vibrationEffect = VibrationEffect.createOneShot(50, VibrationEffect.DEFAULT_AMPLITUDE);
            vibrator.vibrate(vibrationEffect);
        } else {
            // Starsza wersja Androida - wibracja bez ustawienia amplitudy
            vibrator.vibrate(50);
        }
    }
}
