package com.example.f2020065163_ahmadhassankhan_activity2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Question5 extends AppCompatActivity {

    EditText number1;
    EditText number2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);

        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        result = findViewById(R.id.result);

        Button addButton = findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                double sum = num1 + num2;
                result.setText("Result: " + String.format("%.2f", sum));
            }
        });

        Button subtractButton = findViewById(R.id.subtractButton);
        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                double diff = num1 - num2;
                result.setText("Result: " + String.format("%.2f", diff));
            }
        });

        Button multiplyButton = findViewById(R.id.multiplyButton);
        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                double prod = num1 * num2;
                result.setText("Result: " + String.format("%.2f", prod));
            }
        });

        Button divideButton = findViewById(R.id.divideButton);
        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                if (num2 == 0) {
                    result.setText("Result: Error! Division by zero not possible.");
                } else {
                    double quotient = num1 / num2;
                    result.setText("Result: " + String.format("%.2f", quotient));
                }
            }
        });

        Button remainderButton = findViewById(R.id.remainderButton);
        remainderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                if (num2 == 0) {
                    result.setText("Result: Error! Division by zero not possible.");
                } else {
                    double remainder = num1 % num2;
                    result.setText("Result: " + String.format("%.2f", remainder));
                }
            }
        });
    }
}





