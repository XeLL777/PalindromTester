package com.example.manuel.palindromtester;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button checkButton = (Button) findViewById(R.id.checkBtn);

        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkStringForPalindrom(v);
            }
        });
    }

    private EditText inputString;
    private TextView resultView;

    public void checkStringForPalindrom(View v) {
        inputString = (EditText) findViewById(R.id.inputString);
        resultView = (TextView) findViewById(R.id.resultView);

        String outputMessage;
        resultView.setTextColor(Color.RED);

        if(inputString.getText().toString().isEmpty()) {
            outputMessage = "Field is empty!\nPlease input a string!";
        } else if(inputString.getText().toString().trim().length() == 0) {
            outputMessage = "Field contains only white spaces!\nPlease input valid string.";
        } else if (inputString.getText().toString().length() < 5) {
            outputMessage = "String must contain a minimum of 5 characters!";
        } else if(isPalindrom(inputString.getText().toString())) {
            resultView.setTextColor(Color.GREEN);
            outputMessage = "It is a Palindrom!";
        } else {
            outputMessage = "It is not a Palindrom!";
        }

        resultView.setText(outputMessage);
        inputString.selectAll();
    }

    public boolean isPalindrom(String s) {
        return s.toLowerCase().equals(new StringBuilder(s).reverse().toString().toLowerCase());
    }
}
