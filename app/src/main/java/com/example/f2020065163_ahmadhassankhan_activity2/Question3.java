package com.example.f2020065163_ahmadhassankhan_activity2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Question3 extends AppCompatActivity {

        EditText editTextCelsius;
        Button buttonConvert;
        TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);

        editTextCelsius = findViewById(R.id.editTextCelsius);
        buttonConvert = findViewById(R.id.buttonConvert);
        textViewResult = findViewById(R.id.textViewResult);

        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double celsius = Double.parseDouble(editTextCelsius.getText().toString());

                double fahrenheit = celsius * 9 / 5 + 32;

                String result = String.format(getString(R.string.result_format_question3), fahrenheit);
                textViewResult.setText(result);
            }
        });
    }

    public void openQuestion4(View view) {
        startActivity(new Intent(this,Question4.class));
    }
}
