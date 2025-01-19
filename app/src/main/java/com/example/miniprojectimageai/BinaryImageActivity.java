package com.example.miniprojectimageai;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class BinaryImageActivity extends AppCompatActivity {

    private ImageView imgBack;
    private TextView txtHeader;
    private Button btnWienerFilter, btnErosion, btnOpening, btnClosing, btnBoundaryExtraction;
    private ImageView binaryImageView;
    private Bitmap originalImage, processedImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binary_image); // Replace with your layout file
        // Initialize views
        initializeViews();

        // Set click listeners
        setClickListeners();
    }

    private void initializeViews() {
        imgBack = findViewById(R.id.imgBack);
        txtHeader = findViewById(R.id.txtHeader);
        btnWienerFilter = findViewById(R.id.btnWienerFilter);
        btnErosion = findViewById(R.id.btnErosion);
        btnOpening = findViewById(R.id.btnOpening);
        btnClosing = findViewById(R.id.btnClosing);
        btnBoundaryExtraction = findViewById(R.id.btnBoundaryExtraction);
    }

    private void setClickListeners() {
        // Back button functionality
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BinaryImageActivity.this, "Back Button Clicked", Toast.LENGTH_SHORT).show();

                // Navigate back to the previous activity
                finish();
            }
        });

        // Button listeners for different operations
        btnWienerFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BinaryImageActivity.this, "Dilation Filter Applied", Toast.LENGTH_SHORT).show();
            }
        });
        btnErosion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BinaryImageActivity.this, "Erosion Filter Applied", Toast.LENGTH_SHORT).show();
            }
        });
        btnOpening.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BinaryImageActivity.this, "Opening Filter Applied", Toast.LENGTH_SHORT).show();
            }
        });
        btnClosing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BinaryImageActivity.this, "Closing Filter Applied", Toast.LENGTH_SHORT).show();
            }
        });
        btnBoundaryExtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BinaryImageActivity.this, "Boundary Extraction Filter Applied", Toast.LENGTH_SHORT).show();
            }
        });
    }
}