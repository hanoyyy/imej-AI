package com.example.miniprojectimageai;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class rotationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_rotation);

        Button btn45 = findViewById(R.id.btn45);
        Button btn90 = findViewById(R.id.btn90);
        Button btn135 = findViewById(R.id.btn135);
        Button btn180 = findViewById(R.id.btn180);
        Button btn225 = findViewById(R.id.btn225);
        Button btn270 = findViewById(R.id.btn270);
        Button btn315 = findViewById(R.id.btn315);

        btn45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show Toast for 45° button click
                Toast.makeText(rotationActivity.this, "45° Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        btn90.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(rotationActivity.this, "90° Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        btn135.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(rotationActivity.this, "135° Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        btn180.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(rotationActivity.this, "180° Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        btn225.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(rotationActivity.this, "225° Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        btn270.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(rotationActivity.this, "270° Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        btn315.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(rotationActivity.this, "315° Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}