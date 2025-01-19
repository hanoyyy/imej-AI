package com.example.miniprojectimageai;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class scalingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_scalling);

        EditText valueX = findViewById(R.id.value_x);
        EditText valueY = findViewById(R.id.value_y);
        Button btnScale = findViewById(R.id.btnScaling);
        Button backButton = findViewById(R.id.back);
        backButton.setOnClickListener(v -> {
            finish();
        });

        btnScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String xValue = valueX.getText().toString();
                String yValue = valueY.getText().toString();

                if (isInteger(xValue) && isInteger(yValue)) {
                    Toast.makeText(scalingActivity.this, "Scaling: X = " + xValue + ", Y = " + yValue, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(scalingActivity.this, "Please enter valid integer values", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}