package com.example.f2020065163_ahmadhassankhan_activity2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

public class Question4 extends AppCompatActivity {

    EditText editTextWithdrawalAmount;
    Button buttonCalculate;
    TextView textViewNotesOf100, textViewNotesOf50, textViewNotesOf10, textViewNotesOf1, textViewTotalNumberNotes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);

        editTextWithdrawalAmount = findViewById(R.id.editTextWithdrawalAmount);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        textViewNotesOf100 = findViewById(R.id.textViewNotesOf100);
        textViewNotesOf50 = findViewById(R.id.textViewNotesOf50);
        textViewNotesOf10 = findViewById(R.id.textViewNotesOf10);
        textViewNotesOf1 = findViewById(R.id.textViewNotesOf1);
        textViewTotalNumberNotes = findViewById(R.id.textViewTotalNumberNotes);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateNotes();
            }
        });
    }

    private void calculateNotes() {
        int amount = Integer.parseInt(editTextWithdrawalAmount.getText().toString());
        int notesOf100 = amount / 100;
        amount = amount % 100;
        int notesOf50 = amount / 50;
        amount = amount % 50;
        int notesOf10 = amount / 10;
        amount = amount % 10;
        int notesOf1 = amount;

        textViewNotesOf100.setText(getString(R.string.notes_of_100_question4, notesOf100));
        textViewNotesOf50.setText(getString(R.string.notes_of_50_question4, notesOf50));
        textViewNotesOf10.setText(getString(R.string.notes_of_10_question4, notesOf10));
        textViewNotesOf1.setText(getString(R.string.notes_of_1_question4, notesOf1));

        int totalNotes = notesOf100 + notesOf50 + notesOf10 + notesOf1;
        textViewTotalNumberNotes.setText(getString(R.string.total_number_notes_question4, totalNotes));
    }

    public void openQuestion5(View view) {
        startActivity(new Intent(this,Question5.class));
    }
}
