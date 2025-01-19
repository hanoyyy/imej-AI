package com.example.miniprojectimageai;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class color_manipulation_activity extends AppCompatActivity {

    private int redValue = 0;
    private int greenValue = 0;
    private int blueValue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_manipulation);

        // Get references to the sliders and the button
        SeekBar sliderRed = findViewById(R.id.sliderRed);
        SeekBar sliderGreen = findViewById(R.id.sliderGreen);
        SeekBar sliderBlue = findViewById(R.id.sliderBlue);
        Button btnDone = findViewById(R.id.btnDone);

        Button backButton = findViewById(R.id.back);
        backButton.setOnClickListener(v -> {
            Toast.makeText(color_manipulation_activity.this, "Back Button Clicked", Toast.LENGTH_SHORT).show();

            // Navigate back to the previous activity
            Intent intent = new Intent(color_manipulation_activity.this, basic_image_activity.class);
            startActivity(intent);
        });

        // Set listeners for the sliders to update their values
        sliderRed.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                redValue = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sliderGreen.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                greenValue = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sliderBlue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                blueValue = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        // Set listener for the Done button
        btnDone.setOnClickListener(v -> {
            // Show the slider values using a Toast
            String message = "Red: " + redValue + ", Green: " + greenValue + ", Blue: " + blueValue;
            Toast.makeText(color_manipulation_activity.this, message, Toast.LENGTH_LONG).show();
        });
    }
}