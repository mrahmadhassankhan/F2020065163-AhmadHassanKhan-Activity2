package com.example.f2020065163_ahmadhassankhan_activity2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Question1 extends AppCompatActivity {

    EditText decimalInput;
    Button convertButton;
    TextView binaryOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);

        decimalInput = findViewById(R.id.decimal_input);
        convertButton = findViewById(R.id.convert_button);
        binaryOutput = findViewById(R.id.binary_output);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String decimalString = decimalInput.getText().toString();
                if (decimalString.isEmpty()) {
                    binaryOutput.setText(getString(R.string.enter_decimal_number_question1));
                } else {
                    double decimalNumber = Double.parseDouble(decimalString);
                    int decimalInt = (int) decimalNumber;
                    String binaryString = Integer.toBinaryString(decimalInt);
                    binaryOutput.setText(getString(R.string.binary_representation_question1, binaryString));
                }
            }

        });
    }

    public void openQuestion2(View view) {
        startActivity(new Intent(this,Question2.class));
    }
}
