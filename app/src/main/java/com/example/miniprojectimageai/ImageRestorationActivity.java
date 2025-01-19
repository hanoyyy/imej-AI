package com.example.miniprojectimageai;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ImageRestorationActivity extends AppCompatActivity {

    private ImageView imgBack, binaryImageView;
    private Button btnWienerFilter, btnRestorationGaussianFilter, btnInpainting;
    private Bitmap originalImage, processedImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_restoration); // Ensure the correct layout is used
        initializeViews();
        setClickListeners();


    }
    private void initializeViews() {
        // Initialize UI elements
        imgBack = findViewById(R.id.imgBack);
        btnWienerFilter = findViewById(R.id.btnWienerFilter);
        btnRestorationGaussianFilter = findViewById(R.id.btnRestorationGaussianFilter);
        btnInpainting = findViewById(R.id.btnInpainting);

    }
    private void setClickListeners() {
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btnWienerFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ImageRestorationActivity.this, "Wiener Filter Applied", Toast.LENGTH_SHORT).show();
            }
        });
        btnRestorationGaussianFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ImageRestorationActivity.this, "Gaussian Filter Applied", Toast.LENGTH_SHORT).show();
            }
        });
        btnInpainting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ImageRestorationActivity.this, "Inpainting Applied", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
