package com.example.miniprojectimageai;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SegmentActivity extends AppCompatActivity {
    private Button btnThresholding;
    private Button btnKMeans;
    private LinearLayout backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_segmentation);

        // Initialize views
        initializeViews();

        // Set click listeners
        setClickListeners();
    }

    private void initializeViews() {
        btnThresholding = findViewById(R.id.Thresholdingbtn);
        btnKMeans = findViewById(R.id.Kmeansbtn);
        backButton = findViewById(R.id.segmentbacklayout);
    }

    private void setClickListeners() {
        // Thresholding button click listener
        btnThresholding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SegmentActivity.this, "Thresholding segmentation selected", Toast.LENGTH_SHORT).show();
            }
        });

        // K-means button click listener
        btnKMeans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SegmentActivity.this, "K-means segmentation selected", Toast.LENGTH_SHORT).show();
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
