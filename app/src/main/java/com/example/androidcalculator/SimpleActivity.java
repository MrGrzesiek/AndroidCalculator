package com.example.androidcalculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class SimpleActivity extends AppCompatActivity {



    private static final char ADDITION = '+';
    private static final char SUBTRACTION = '-';
    private static final char MULTIPLICATION = '*';
    private static final char DIVISION = '/';

    private char currentSymbol;
    private double operateValue =  Double.NaN;
    private double endValue =  Double.NaN;
    private TextView inputDisplay, outputDisplay;
    private DecimalFormat decimalFormat;
    private Vibrator vibrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple);

        decimalFormat = new DecimalFormat("#.##########");
        inputDisplay = findViewById(R.id.CAL);
        outputDisplay = findViewById(R.id.Number);
        Button button0 = findViewById(R.id.BT0);
        Button button1 = findViewById(R.id.BT1);
        Button button2 = findViewById(R.id.BT2);
        Button button3 = findViewById(R.id.BT3);
        Button button4 = findViewById(R.id.BT4);
        Button button5 = findViewById(R.id.BT5);
        Button button6 = findViewById(R.id.BT6);
        Button button7 = findViewById(R.id.BT7);
        Button button8 = findViewById(R.id.BT8);
        Button button9 = findViewById(R.id.BT9);
        Button buttonAdd = findViewById(R.id.BTPLUS);
        Button buttonSub = findViewById(R.id.BTMINUS);
        Button buttonDivide = findViewById(R.id.BTDIV);
        Button buttonDot = findViewById(R.id.BTDOOT);
        Button buttonMultiply = findViewById(R.id.BTMULTI);
        Button buttonClear = findViewById(R.id.BTCCE);
        Button buttonAC = findViewById(R.id.BTAC);
        Button buttonEqual = findViewById(R.id.BTEQUAL);
        Button buttonChange = findViewById(R.id.BTCHANGE);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation.button_flash(view);
                animation.performVibration(vibrator);
                inputDisplay.setText(inputDisplay.getText() + "0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation.button_flash(view);
                animation.performVibration(vibrator);
                inputDisplay.setText(inputDisplay.getText() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation.button_flash(view);
                animation.performVibration(vibrator);
                inputDisplay.setText(inputDisplay.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation.button_flash(view);
                animation.performVibration(vibrator);
                inputDisplay.setText(inputDisplay.getText() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation.button_flash(view);
                animation.performVibration(vibrator);
                inputDisplay.setText(inputDisplay.getText() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation.button_flash(view);
                animation.performVibration(vibrator);
                inputDisplay.setText(inputDisplay.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation.button_flash(view);
                animation.performVibration(vibrator);
                inputDisplay.setText(inputDisplay.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation.button_flash(view);
                animation.performVibration(vibrator);
                inputDisplay.setText(inputDisplay.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation.button_flash(view);
                animation.performVibration(vibrator);
                inputDisplay.setText(inputDisplay.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation.button_flash(view);
                animation.performVibration(vibrator);
                inputDisplay.setText(inputDisplay.getText() + "9");
            }
        });
        buttonChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation.button_flash(view);
                animation.performVibration(vibrator);
                String currentInput = inputDisplay.getText().toString();
                if (!currentInput.isEmpty()) {
                    double value = Double.parseDouble(currentInput);
                    value = -value;
                    inputDisplay.setText(decimalFormat.format(value));
                }
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation.button_flash(view);
                animation.performVibration(vibrator);
                allCalculations();
                currentSymbol = ADDITION;
                outputDisplay.setText(decimalFormat.format(endValue) + "+");
                inputDisplay.setText(null);
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation.button_flash(view);
                animation.performVibration(vibrator);
                allCalculations();
                currentSymbol = SUBTRACTION;
                outputDisplay.setText(decimalFormat.format(endValue) + "-");
                inputDisplay.setText(null);
            }
        });
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation.button_flash(view);
                animation.performVibration(vibrator);
                allCalculations();
                currentSymbol = MULTIPLICATION;
                outputDisplay.setText(decimalFormat.format(endValue) + "x");
                inputDisplay.setText(null);
            }
        });
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation.button_flash(view);
                animation.performVibration(vibrator);
                allCalculations();
                currentSymbol = DIVISION;
                outputDisplay.setText(decimalFormat.format(endValue) + "/");
                inputDisplay.setText(null);
            }
        });
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation.button_flash(view);
                animation.performVibration(vibrator);
                String currentInput = inputDisplay.getText().toString();
                // Check if the current input already contains a dot
                if (!currentInput.contains(".")) {
                    // If there's no dot, add it to the input
                    inputDisplay.setText(currentInput + ".");
                } else {
                    // If there's already a dot, show a message or perform any desired action
                    Toast.makeText(SimpleActivity.this, "Decimal point already exists", Toast.LENGTH_SHORT).show();
                }
            }
        });
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation.button_flash(view);
                animation.performVibration(vibrator);
                if (inputDisplay.getText().length() > 0) {
                    CharSequence currentText = inputDisplay.getText();
                    inputDisplay.setText(currentText.subSequence(0, currentText.length() - 1));
                }
            }
        });
        buttonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation.button_flash(view);
                animation.performVibration(vibrator);
                operateValue = Double.NaN;
                endValue = Double.NaN;
                currentSymbol = '0';
                inputDisplay.setText("");
                outputDisplay.setText("");
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation.button_flash(view);
                animation.performVibration(vibrator);
                allCalculations();
                outputDisplay.setText(decimalFormat.format(endValue));
                inputDisplay.setText("");
                operateValue = Double.NaN;
                currentSymbol = '0';
            }
        });
    }
    private void allCalculations() {
        if (inputDisplay.getText().toString().equals(".")) {
            Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
            endValue=0;
        }
        else if (!inputDisplay.getText().toString().isEmpty()) {
            operateValue = Double.parseDouble(inputDisplay.getText().toString());

            if (!Double.isNaN(endValue)) {
                if (currentSymbol == ADDITION)
                    endValue += operateValue;
                else if (currentSymbol == SUBTRACTION)
                    endValue -= operateValue;
                else if (currentSymbol == MULTIPLICATION)
                    endValue *= operateValue;
                else if (currentSymbol == DIVISION) {
                    if (operateValue != 0) {
                        endValue /= operateValue;
                    } else {
                        // Obsługa dzielenia przez zero
                        Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_SHORT).show();
                        return;
                    }
                }
            } else {
                endValue = operateValue;
            }
        }
        else {
            // Obsługa pustego pola tekstowego
            Toast.makeText(this, "Enter a valid number", Toast.LENGTH_SHORT).show();

            return;
        }
    }
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("inputValue", inputDisplay.getText().toString());
        outState.putString("outputValue", outputDisplay.getText().toString());
        outState.putDouble("firstValue", operateValue);
        outState.putDouble("secondValue", endValue);
        outState.putChar("currentSymbol", currentSymbol);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String inputValue = savedInstanceState.getString("inputValue");
        String outputValue = savedInstanceState.getString("outputValue");
        operateValue = savedInstanceState.getDouble("firstValue");
        endValue = savedInstanceState.getDouble("secondValue");
        currentSymbol = savedInstanceState.getChar("currentSymbol", (char) 0);
        if (inputValue != null) {
            inputDisplay.setText(inputValue);
        }

        if (outputValue != null) {
            outputDisplay.setText(outputValue);
        }
    }

}