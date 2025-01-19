package com.example.miniprojectimageai;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ImageMatchingActivity extends AppCompatActivity {

    private ImageView imgBack;
    private Button btnSIFT, btnORB;
    private Bitmap originalImage, processedImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_matching);

        // Initialize UI elements
        imgBack = findViewById(R.id.imgBack);
        btnSIFT = findViewById(R.id.btnSIFT);
        btnORB = findViewById(R.id.btnORB);

        // Back button functionality
        imgBack.setOnClickListener(v -> finish());

        // Set listeners for SIFT and ORB buttons
        btnSIFT.setOnClickListener(v -> applySIFTAlgorithm());
        btnORB.setOnClickListener(v -> applyORBAlgorithm());
    }

    private void applySIFTAlgorithm() {
        if (originalImage != null) {
            // Placeholder: Replace with actual SIFT algorithm implementation
            processedImage = originalImage; // Simulated processing
            Toast.makeText(this, "SIFT Algorithm Applied", Toast.LENGTH_SHORT).show();
        }
    }

    private void applyORBAlgorithm() {
        if (originalImage != null) {
            // Placeholder: Replace with actual ORB algorithm implementation
            processedImage = originalImage; // Simulated processing
            Toast.makeText(this, "ORB Algorithm Applied", Toast.LENGTH_SHORT).show();
        }
    }
}
