package com.example.miniprojectimageai;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class math_operation_activity extends AppCompatActivity {
    Button backButton, btnAdd, btnSub, btnMul, btnDiv;
    ImageView image2;
    private static final int IMAGE_PICK_REQUEST = 100; // Request code for picking an image

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_math_operation);
        initializeViews();
        setClickListeners();


    }

    private void initializeViews() {
        backButton = findViewById(R.id.back);
        image2 = findViewById(R.id.image2);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
    }

    private void setClickListeners() {
        backButton.setOnClickListener(v -> {
            finish();
        });


        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(math_operation_activity.this, "Addition Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });


        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(math_operation_activity.this, "Subtraction Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });


        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(math_operation_activity.this, "Multiplication Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });


        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(math_operation_activity.this, "Division Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
