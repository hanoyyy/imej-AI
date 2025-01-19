package com.example.miniprojectimageai;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class CompressionActivity extends AppCompatActivity {
    private Button btnLossless;
    private Button btnLossy;
    private LinearLayout backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_compression);

        // Initialize views
        initializeViews();

        // Set click listeners
        setClickListeners();
    }

    private void initializeViews() {
        btnLossless = findViewById(R.id.Losslessbtn);
        btnLossy = findViewById(R.id.LossyBtn);
        backButton = findViewById(R.id.compressionbacklayout);
    }

    private void setClickListeners() {
        // Thresholding button click listener
        btnLossless.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CompressionActivity.this, "Lossless Compression selected", Toast.LENGTH_SHORT).show();
            }
        });

        // K-means button click listener
        btnLossy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CompressionActivity.this, "Lossy Compression selected", Toast.LENGTH_SHORT).show();
            }
        });

        // Back button click listener
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
