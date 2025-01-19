package com.example.miniprojectimageai;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class blendingActivity extends AppCompatActivity {
    ImageView image2;
    Button backButton,btnBlend;

    private static final int IMAGE_PICK_REQUEST = 100; // Request code for picking an image

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_blending);
        // Initialize views
        initializeViews();

        // Set click listeners
        setClickListeners();
    }
    private void initializeViews() {

        image2 = findViewById(R.id.image2);
        btnBlend = findViewById(R.id.btnBlend);
        backButton = findViewById(R.id.back);
    }

    private void setClickListeners() {
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(blendingActivity.this, "Back Button Clicked", Toast.LENGTH_SHORT).show();

                // Navigate back to the previous activity
                finish();
            }
        });

        // Handle ImageView click to pick an image from the gallery
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });


        btnBlend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(blendingActivity.this, "Blend Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
    // Handle the result of the image selection
}