package com.example.androidcalculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

import java.text.DecimalFormat;

public class AdvanceActivity extends AppCompatActivity {

    private static final char ADDITION = '+';
    private static final char SUBTRACTION = '-';
    private static final char MULTIPLICATION = '*';
    private static final char DIVISION = '/';
    private static final char PROC = '%';
    private static final char SQRT = 'Q';
    private static final char POW = 'P';
    private static final char POWY = '^';
    private static final char LOGARITHM = 'L';
    private static final char SIN = 'S';
    private static final char COS = 'C';
    private static final char TAN = 'T';
    private static final char LOGARITHM_NATURAL = 'N';

    List<Character> oneLinerList = Arrays.asList('Q', 'P', 'S', 'C', 'T', 'N');
    private char currentSymbol = '0';
    private double operateValue =  Double.NaN;
    private double endValue =  Double.NaN;
    private TextView inputDisplay, outputDisplay;
    private DecimalFormat decimalFormat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.advance);

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
        Button buttonsqrt = findViewById(R.id.BTSQRT);
        Button buttonpow = findViewById(R.id.BTPOW);
        Button buttonpowy = findViewById(R.id.BTPOWY);
        Button buttonlog = findViewById(R.id.BTLOG);
        Button buttonln = findViewById(R.id.BTLN);
        Button buttonsin = findViewById(R.id.BTSIN);
        Button buttoncos = findViewById(R.id.BTCOS);
        Button buttontan = findViewById(R.id.BTTAN);
        Button buttonproc = findViewById(R.id.BTPROC);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation.button_flash(view);
                inputDisplay.setText(inputDisplay.getText() + "0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation.button_flash(view);
                inputDisplay.setText(inputDisplay.getText() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation.button_flash(view);
                inputDisplay.setText(inputDisplay.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation.button_flash(view);
                inputDisplay.setText(inputDisplay.getText() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation.button_flash(view);
                inputDisplay.setText(inputDisplay.getText() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation.button_flash(view);
                inputDisplay.setText(inputDisplay.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation.button_flash(view);
                inputDisplay.setText(inputDisplay.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation.button_flash(view);
                inputDisplay.setText(inputDisplay.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation.button_flash(view);
                inputDisplay.setText(inputDisplay.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation.button_flash(view);
                inputDisplay.setText(inputDisplay.getText() + "9");
            }
        });
        buttonChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation.button_flash(view);
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
                inputDisplay.setText(inputDisplay.getText() + ".");
            }
        });
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation.button_flash(view);
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
                allCalculations();
                outputDisplay.setText(decimalFormat.format(endValue));
                inputDisplay.setText("");
                operateValue = Double.NaN;
                currentSymbol = '0';
            }
        });
        buttonproc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation.button_flash(view);
                allCalculations();
                currentSymbol = PROC;
                outputDisplay.setText(decimalFormat.format(endValue) + "%");
                inputDisplay.setText(null);
            }
        });
        buttonsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation.button_flash(view);
                currentSymbol = SQRT;
                allCalculations();
                outputDisplay.setText(decimalFormat.format(endValue));
                inputDisplay.setText(null);
            }
        });
        buttonpow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation.button_flash(view);
                currentSymbol = POW;
                allCalculations();
                outputDisplay.setText(decimalFormat.format(endValue));
                inputDisplay.setText(null);
            }
        });
        buttonpowy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation.button_flash(view);
                allCalculations();
                currentSymbol = POWY;
                outputDisplay.setText(decimalFormat.format(endValue)+"^");
                inputDisplay.setText(null);
            }
        });
        buttonsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation.button_flash(view);
                currentSymbol = SIN;
                allCalculations();
                outputDisplay.setText(decimalFormat.format(endValue));
                inputDisplay.setText(null);
            }
        });
        buttoncos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation.button_flash(view);
                currentSymbol = COS;
                allCalculations();
                outputDisplay.setText(decimalFormat.format(endValue));
                inputDisplay.setText(null);
            }
        });
        buttontan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation.button_flash(view);
                currentSymbol = TAN;
                allCalculations();
                outputDisplay.setText(decimalFormat.format(endValue));
                inputDisplay.setText(null);
            }
        });
        buttonln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation.button_flash(view);
                currentSymbol = LOGARITHM_NATURAL;
                allCalculations();
                outputDisplay.setText(decimalFormat.format(endValue));
                inputDisplay.setText(null);
            }
        });
        buttonlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation.button_flash(view);
                allCalculations();
                currentSymbol = LOGARITHM;
                outputDisplay.setText("log"+decimalFormat.format(endValue));
                inputDisplay.setText(null);
            }
        });
    }
    private void allCalculations() {
        boolean BEorNOTtoBE = oneLinerList.contains(currentSymbol);
        if (!inputDisplay.getText().toString().isEmpty()||BEorNOTtoBE) {
            if (!Double.isNaN(endValue)&&!BEorNOTtoBE) {
                operateValue = Double.parseDouble(inputDisplay.getText().toString());
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
                else if (currentSymbol == PROC)
                    endValue = (endValue*operateValue)/100;
                else if (currentSymbol == POWY)
                    endValue = Math.pow(endValue,operateValue);
                else if (currentSymbol == LOGARITHM)
                    endValue = Math.log(operateValue)/Math.log(endValue);
            }
            else {
                if(!inputDisplay.getText().toString().isEmpty()){
                    operateValue = Double.parseDouble(inputDisplay.getText().toString());
                    endValue = operateValue;
                    operateValue = Double.NaN;
                }
                if(currentSymbol == SQRT)
                    endValue = Math.sqrt(endValue);
                else if (currentSymbol == POW)
                    endValue = Math.pow(endValue,2);
                else if (currentSymbol == SIN){
                    endValue = Math.toRadians(endValue);
                    endValue = Math.sin(endValue);
                }
                else if (currentSymbol == COS) {
                    endValue = Math.toRadians(endValue);
                    endValue = Math.cos(endValue);
                }
                else if (currentSymbol == TAN){
                    if((Math.abs(endValue)%180)-90!=0){
                    endValue = Math.toRadians(endValue);
                    endValue = Math.tan(endValue);
                    }
                    else{
                        Toast.makeText(this, "Brak wartosci dla danego kąta", Toast.LENGTH_SHORT).show();
                    }
                }
                else if (currentSymbol == LOGARITHM_NATURAL) {
                    endValue = Math.log(endValue);
                }
            }
        } else {
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