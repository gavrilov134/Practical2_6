package com.mirea.kt.practical2_6;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CalcActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        Log.d("PracticalTask2_tag", "CalcActivity onCreate");
        EditText editText1 = findViewById(R.id.editText1);
        EditText editText2 = findViewById(R.id.editText2);
        EditText editText3 = findViewById(R.id.editText3);
        Button buttonCalculate = findViewById(R.id.buttonCalculate);
        TextView textViewResult = findViewById(R.id.textViewResult);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("PracticalTask2_tag", "Calculate button clicked");
                int num1 = Integer.parseInt(editText1.getText().toString());
                int num2 = Integer.parseInt(editText2.getText().toString());
                int num3 = Integer.parseInt(editText3.getText().toString());

                int result = num1 - num2 - num3;
                Log.d("PracticalTask2_tag", "Calculation result: " + result);
                textViewResult.setText("Result: " + result);
            }
        });
    }
}