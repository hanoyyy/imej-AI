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
    private Button btnWienerFilter, btnErosion, btnOpening, btnClosing;
    private ImageView binaryImageView;
    private Bitmap originalImage, processedImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binary_image); // Replace with your layout file

        // Initialize UI elements
        imgBack = findViewById(R.id.imgBack);
        txtHeader = findViewById(R.id.txtHeader);
        btnWienerFilter = findViewById(R.id.btnWienerFilter);
        btnErosion = findViewById(R.id.btnErosion);
        btnOpening = findViewById(R.id.btnOpening);
        btnClosing = findViewById(R.id.btnClosing);

        // Back button functionality
        imgBack.setOnClickListener(v -> finish());  // Close activity when back button is clicked

        // Button listeners for different operations
        btnWienerFilter.setOnClickListener(v -> applyDilation());
        btnErosion.setOnClickListener(v -> applyErosion());
        btnOpening.setOnClickListener(v -> applyOpening());
        btnClosing.setOnClickListener(v -> applyClosing());
    }

    // Function to apply Dilation (Wiener Filter)
    private void applyDilation() {
        if (originalImage != null) {
            // Apply dilation operation on the original image here (you can use a library like OpenCV)
            // Here, it's a placeholder; replace with actual dilation logic.
            processedImage = originalImage; // Replace with actual processing
            binaryImageView.setImageBitmap(processedImage);
            Toast.makeText(this, "Dilation applied", Toast.LENGTH_SHORT).show();
        }
    }

    // Function to apply Erosion
    private void applyErosion() {
        if (originalImage != null) {
            // Apply erosion operation (placeholder)
            processedImage = originalImage; // Replace with actual processing
            binaryImageView.setImageBitmap(processedImage);
            Toast.makeText(this, "Erosion applied", Toast.LENGTH_SHORT).show();
        }
    }

    // Function to apply Opening (Dilation + Erosion)
    private void applyOpening() {
        if (originalImage != null) {
            // Apply opening operation (placeholder)
            processedImage = originalImage; // Replace with actual processing
            binaryImageView.setImageBitmap(processedImage);
            Toast.makeText(this, "Opening applied", Toast.LENGTH_SHORT).show();
        }
    }

    // Function to apply Closing (Erosion + Dilation)
    private void applyClosing() {
        if (originalImage != null) {
            // Apply closing operation (placeholder)
            processedImage = originalImage; // Replace with actual processing
            binaryImageView.setImageBitmap(processedImage);
            Toast.makeText(this, "Closing applied", Toast.LENGTH_SHORT).show();
        }
    }
}
