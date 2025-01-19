package com.example.miniprojectimageai;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class filterActivity extends AppCompatActivity {
    Button btnFourierTransform, btnMean, btnGaussian, btnMedian, btnEdge, backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_filter);
        initializeViews();
        setClickListeners();


    }

    private void initializeViews() {
        // Get references to all buttons
        btnFourierTransform = findViewById(R.id.btnFourierTransform);
        btnMean = findViewById(R.id.btnMean);
        btnGaussian = findViewById(R.id.btnGaussian);
        btnMedian = findViewById(R.id.btnMedian);
        btnEdge = findViewById(R.id.btnEdge);
        backButton = findViewById(R.id.back);
    }

    private void setClickListeners() {
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnFourierTransform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(filterActivity.this, "Fourier Transform Button Clicked", Toast.LENGTH_SHORT).show();


            }
        });
        btnMean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(filterActivity.this, "Mean Filter Button Clicked", Toast.LENGTH_SHORT).show();


            }
        });
        btnGaussian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(filterActivity.this, "Gaussian Filter Button Clicked", Toast.LENGTH_SHORT).show();


            }
        });
        btnMedian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(filterActivity.this, "Median Filter Button Clicked", Toast.LENGTH_SHORT).show();


            }
        });
        btnEdge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(filterActivity.this, "Edge Detection Button Clicked", Toast.LENGTH_SHORT).show();


            }
        });
    }
}