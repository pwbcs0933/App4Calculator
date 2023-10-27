package com.example.calculatorforgit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText input1, input2;
    Button addButton, subtractButton, multiplyButton, divideButton;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        addButton = findViewById(R.id.addButton);
        subtractButton = findViewById(R.id.subtractButton);
        multiplyButton = findViewById(R.id.multiplyButton);
        divideButton = findViewById(R.id.divideButton);
        resultText = findViewById(R.id.resultText);

        addButton.setOnClickListener(v -> {
            int num1 = Integer.parseInt(input1.getText().toString());
            int num2 = Integer.parseInt(input2.getText().toString());
            int result = num1 + num2;
            resultText.setText(String.valueOf(result));
        });

        subtractButton.setOnClickListener(v -> {
            int num1 = Integer.parseInt(input1.getText().toString());
            int num2 = Integer.parseInt(input2.getText().toString());
            int result = num1 - num2;
            resultText.setText(String.valueOf(result));
        });

        multiplyButton.setOnClickListener(v -> {
            int num1 = Integer.parseInt(input1.getText().toString());
            int num2 = Integer.parseInt(input2.getText().toString());
            int result = num1 * num2;
            resultText.setText(String.valueOf(result));
        });

        divideButton.setOnClickListener(v -> {
            int num1 = Integer.parseInt(input1.getText().toString());
            int num2 = Integer.parseInt(input2.getText().toString());
            if (num2 != 0) {
                float result = (float) num1 / num2;
                resultText.setText(String.valueOf(result));
            } else {
                resultText.setText("Cannot divide by zero");
            }
        });
    }
}