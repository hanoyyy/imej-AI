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

    private static final int IMAGE_PICK_REQUEST = 100; // Request code for picking an image

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_math_operation);

        Button backButton = findViewById(R.id.back);

        backButton.setOnClickListener(v -> {
            Toast.makeText(math_operation_activity.this, "Back Button Clicked", Toast.LENGTH_SHORT).show();

            // Navigate back to the previous activity
            Intent intent = new Intent(math_operation_activity.this, EditPhotoActivity.class);
            startActivity(intent);
        });

        ImageView image2 = findViewById(R.id.image2);

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(intent, IMAGE_PICK_REQUEST);
            }
        });

        Button btnAdd = findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(math_operation_activity.this, "Addition Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        Button btnSub = findViewById(R.id.btnSub);
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(math_operation_activity.this, "Subtraction Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        Button btnMul = findViewById(R.id.btnMul);
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(math_operation_activity.this, "Multiplication Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        Button btnDiv = findViewById(R.id.btnDiv);
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(math_operation_activity.this, "Division Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    // Handle the result of the image selection
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == IMAGE_PICK_REQUEST && resultCode == RESULT_OK) {
            if (data != null) {
                Uri imageUri = data.getData();
                try {
                    // Display the selected image in the ImageView
                    Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), imageUri);
                    ImageView image2 = findViewById(R.id.image2);
                    image2.setImageBitmap(bitmap);

                    Toast.makeText(this, "Image Successfully Imported!", Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                    Toast.makeText(this, "Failed to Import Image: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        } else {
            Toast.makeText(this, "Image selection failed or canceled", Toast.LENGTH_SHORT).show();
        }
    }
}

