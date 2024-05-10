package com.mirea.kt.practical2_6;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("PracticalTask2_tag", "MainActivity created");
        Button buttonStart = findViewById(R.id.buttonStart);

        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("PracticalTask2_tag", "Start button clicked");
                Intent intent = new Intent(MainActivity.this, CalcActivity.class);
                startActivity(intent);
            }
        });
    }
}