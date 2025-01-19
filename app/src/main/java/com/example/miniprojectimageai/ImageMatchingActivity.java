package com.example.miniprojectimageai;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ImageMatchingActivity extends AppCompatActivity {

    private ImageView imgBack;
    private Button btnSIFT, btnORB, btnTemplateMatching;
    private Bitmap originalImage, processedImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_matching);
        initializeViews();
        setClickListeners();


    }

    private void initializeViews() {
        // Initialize UI elements
        imgBack = findViewById(R.id.imgBack);
        btnSIFT = findViewById(R.id.btnSIFT);
        btnORB = findViewById(R.id.btnORB);
        btnTemplateMatching = findViewById(R.id.btnTemplateMatching);
    }

    private void setClickListeners() {
        // Back button functionality
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btnSIFT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ImageMatchingActivity.this, "SIFT Algorithm Applied", Toast.LENGTH_SHORT).show();
            }
        });
        btnORB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ImageMatchingActivity.this, "ORB Algorithm Applied", Toast.LENGTH_SHORT).show();
            }
        });
        btnTemplateMatching.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ImageMatchingActivity.this, "TemplateMatching Applied", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
