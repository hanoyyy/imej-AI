package com.example.miniprojectimageai;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class filterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_filter);

        // Get references to all buttons
        Button btnFourierTransform = findViewById(R.id.btnFourierTransform);
        Button btnMean = findViewById(R.id.btnMean);
        Button btnGaussian = findViewById(R.id.btnGaussian);
        Button btnMedian = findViewById(R.id.btnMedian);
        Button btnEdge = findViewById(R.id.btnEdge);
        Button backButton = findViewById(R.id.back);

        backButton.setOnClickListener(v -> {
            Toast.makeText(filterActivity.this, "Back Button Clicked", Toast.LENGTH_SHORT).show();

            // Navigate back to the previous activity
            Intent intent = new Intent(filterActivity.this, edit_photo_activity.class);
            startActivity(intent);
        });


        // Set click listeners for each button
        btnFourierTransform.setOnClickListener(v ->
                Toast.makeText(this, "Fourier Transform Button Clicked", Toast.LENGTH_SHORT).show()
        );

        btnMean.setOnClickListener(v ->
                Toast.makeText(this, "Mean Filter Button Clicked", Toast.LENGTH_SHORT).show()
        );

        btnGaussian.setOnClickListener(v ->
                Toast.makeText(this, "Gaussian Filter Button Clicked", Toast.LENGTH_SHORT).show()
        );

        btnMedian.setOnClickListener(v ->
                Toast.makeText(this, "Median Filter Button Clicked", Toast.LENGTH_SHORT).show()
        );

        btnEdge.setOnClickListener(v ->
                Toast.makeText(this, "Edge Detection Button Clicked", Toast.LENGTH_SHORT).show()
        );
    }
}