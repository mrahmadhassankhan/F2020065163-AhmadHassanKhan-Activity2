package com.example.f2020065163_ahmadhassankhan_activity2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Question2 extends AppCompatActivity {

    EditText editText;
    Button button;
    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);

        editText = findViewById(R.id.editText1);
        button = findViewById(R.id.button1);
        resultTextView = findViewById(R.id.textView3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String lengthInCmString = editText.getText().toString();
                if (lengthInCmString.isEmpty()) {
                    resultTextView.setText(R.string.length_in_centimeters_text_question2);
                    return;
                }

                double lengthInCm = Double.parseDouble(lengthInCmString);
                double lengthInFeet = lengthInCm / 30.48;
                resultTextView.setText(getString(R.string.length_in_feet_question2,lengthInFeet));
            }
        });

    }
    public void openQuestion3(View view) {
        startActivity(new Intent(this,Question3.class));
    }
}
