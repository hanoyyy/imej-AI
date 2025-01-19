package com.example.miniprojectimageai;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.slider.Slider;

public class basic_image_activity extends AppCompatActivity {

    Button btnGrayscale, btnNegative,btnColorManipulation,backButton,btnFlip,btnTranslation,btnRotation,btnScaling,btnCropping,btnImageBlend,btnPaddingBorder;
    SeekBar sliderBrightness,sliderContrast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_basic_image);

        // Initialize views
        initializeViews();

        // Set click listeners
        setClickListeners();
    }
                // Buttons
                private void initializeViews() {
                    btnGrayscale = findViewById(R.id.btnGrayscale);
                    btnNegative = findViewById(R.id.btnNegative);
                    btnColorManipulation = findViewById(R.id.btnColorManipulation);
                    btnFlip = findViewById(R.id.btnFlip);
                    btnTranslation = findViewById(R.id.btnTranslation);
                    btnRotation = findViewById(R.id.btnRotation);
                    btnScaling = findViewById(R.id.btnScaling);
                    btnCropping = findViewById(R.id.btnCropping);
                    btnImageBlend = findViewById(R.id.btnImageBlend);
                    btnPaddingBorder = findViewById(R.id.btnPaddingBorder);

                    // Sliders
                    sliderBrightness = findViewById(R.id.sliderBrightness);
                    sliderContrast = findViewById(R.id.sliderContrast);

                    backButton = findViewById(R.id.back);
                }

    private void setClickListeners() {
                backButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(basic_image_activity.this, "Back Button Clicked", Toast.LENGTH_SHORT).show();

                        // Navigate back to the previous activity
                        finish();
                    }
                });

                    btnGrayscale.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(basic_image_activity.this, "Grayscale button clicked!", Toast.LENGTH_SHORT).show();
                        }
                });

        btnNegative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(basic_image_activity.this, "Negative button clicked!", Toast.LENGTH_SHORT).show();
            }
        });
        btnColorManipulation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(basic_image_activity.this, color_manipulation_activity.class);
                startActivity(intent);
            }
        });

        btnFlip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(basic_image_activity.this, flipActivity.class);
                startActivity(intent);
            }
        });

        btnTranslation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(basic_image_activity.this, translationActivity.class);
                startActivity(intent);
            }
        });

        btnRotation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(basic_image_activity.this, rotationActivity.class);
                startActivity(intent);
            }
        });
        btnScaling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(basic_image_activity.this, scalingActivity.class);
                startActivity(intent);
            }
        });
        btnCropping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(basic_image_activity.this, "crop button clicked!", Toast.LENGTH_SHORT).show();
            }
        });
        btnImageBlend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(basic_image_activity.this, blendingActivity.class);
                startActivity(intent);
            }
        });
        btnPaddingBorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(basic_image_activity.this, padding_border_activity.class);
                startActivity(intent);
            }
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
