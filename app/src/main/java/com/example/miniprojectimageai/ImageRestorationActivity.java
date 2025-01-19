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

        // Initialize UI elements
        imgBack = findViewById(R.id.imgBack);
        btnWienerFilter = findViewById(R.id.btnWienerFilter);
        btnRestorationGaussianFilter = findViewById(R.id.btnRestorationGaussianFilter);
        btnInpainting = findViewById(R.id.btnInpainting);


        // Set listeners for the buttons
        btnWienerFilter.setOnClickListener(v -> applyWienerFilter());
        btnRestorationGaussianFilter.setOnClickListener(v -> applyGaussianFilter());
        btnInpainting.setOnClickListener(v -> applyInpainting());

        // Back button functionality
        imgBack.setOnClickListener(v -> finish());
    }


    private void applyWienerFilter() {
        if (originalImage != null) {
            // Apply Wiener Filter to the original image (This is just a placeholder for the actual logic)
            processedImage = originalImage; // Replace with actual Wiener Filter implementation
            binaryImageView.setImageBitmap(processedImage);
            Toast.makeText(ImageRestorationActivity.this, "Wiener Filter Applied", Toast.LENGTH_SHORT).show();
        }
    }

    private void applyGaussianFilter() {
        if (originalImage != null) {
            // Apply Gaussian Filter to the original image (This is just a placeholder for the actual logic)
            processedImage = originalImage; // Replace with actual Gaussian Filter implementation
            binaryImageView.setImageBitmap(processedImage);
            Toast.makeText(ImageRestorationActivity.this, "Gaussian Filter Applied", Toast.LENGTH_SHORT).show();
        }
    }

    private void applyInpainting() {
        if (originalImage != null) {
            // Apply Wiener Filter to the original image (This is just a placeholder for the actual logic)
            processedImage = originalImage; // Replace with actual Wiener Filter implementation
            binaryImageView.setImageBitmap(processedImage);
            Toast.makeText(ImageRestorationActivity.this, "Inpainting Applied", Toast.LENGTH_SHORT).show();
        }
    }
}
