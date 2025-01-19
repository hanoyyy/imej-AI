package com.example.miniprojectimageai;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class basic_image_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_basic_image);
        // Buttons
        Button btnGrayscale = findViewById(R.id.btnGrayscale);
        Button btnNegative = findViewById(R.id.btnNegative);
        Button btnColorManipulation = findViewById(R.id.btnColorManipulation);
        Button btnFlip = findViewById(R.id.btnFlip);
        Button btnTranslation = findViewById(R.id.btnTranslation);
        Button btnRotation = findViewById(R.id.btnRotation);
        Button btnScaling = findViewById(R.id.btnScaling);
        Button btnCropping = findViewById(R.id.btnCropping);
        Button btnImageBlend = findViewById(R.id.btnImageBlend);
        Button btnPaddingBorder = findViewById(R.id.btnPaddingBorder);

        // Sliders
        SeekBar sliderBrightness = findViewById(R.id.sliderBrightness);
        SeekBar sliderContrast = findViewById(R.id.sliderContrast);

        Button backButton = findViewById(R.id.back);

        backButton.setOnClickListener(v -> {
            Toast.makeText(basic_image_activity.this, "Back Button Clicked", Toast.LENGTH_SHORT).show();

            // Navigate back to the previous activity
            Intent intent = new Intent(basic_image_activity.this, EditPhotoActivity.class);
            startActivity(intent);
        });


        // Handle Button Clicks
        btnGrayscale.setOnClickListener(v ->
                Toast.makeText(this, "Grayscale button clicked!", Toast.LENGTH_SHORT).show()
        );

        btnNegative.setOnClickListener(v ->
                Toast.makeText(this, "Negative button clicked!", Toast.LENGTH_SHORT).show()
        );

        btnColorManipulation.setOnClickListener(v -> {
            Intent intent = new Intent(basic_image_activity.this, color_manipulation_activity.class);
            startActivity(intent);
        });

        btnFlip.setOnClickListener(v -> {
            Intent intent = new Intent(basic_image_activity.this, flipActivity.class);
            startActivity(intent);
        });

        btnTranslation.setOnClickListener(v -> {
            Intent intent = new Intent(basic_image_activity.this, translationActivity.class);
            startActivity(intent);
        });

        btnRotation.setOnClickListener(v -> {
            Intent intent = new Intent(basic_image_activity.this, rotationActivity.class);
            startActivity(intent);
        });

        btnScaling.setOnClickListener(v -> {
            Intent intent = new Intent(basic_image_activity.this, scalingActivity.class);
            startActivity(intent);
        });

        btnCropping.setOnClickListener(v ->
                Toast.makeText(this, "crop button clicked!", Toast.LENGTH_SHORT).show()
        );

        btnImageBlend.setOnClickListener(v -> {
            Intent intent = new Intent(basic_image_activity.this, blendingActivity.class);
            startActivity(intent);
        });

        btnPaddingBorder.setOnClickListener(v -> {
            Intent intent = new Intent(basic_image_activity.this, padding_border_activity.class);
            startActivity(intent);
        });

        // Handle Slider Changes
        sliderBrightness.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Toast.makeText(basic_image_activity.this, "Brightness: " + progress, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        sliderContrast.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Toast.makeText(basic_image_activity.this, "Contrast: " + progress, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

    }


}
