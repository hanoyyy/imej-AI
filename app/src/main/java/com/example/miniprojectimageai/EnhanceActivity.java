package com.example.miniprojectimageai;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Part;

public class EnhanceActivity extends AppCompatActivity {

    private Button histogramButton, contrastButton, gammaButton;
    private LinearLayout backbtn;
    private ApiService apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enhance_image);

        // Initialize UI components

        // Initialize views
        initializeViews();

        // Set click listeners
        setClickListeners();
    }

    private void initializeViews() {
        histogramButton = findViewById(R.id.Histogrambtn);
        contrastButton = findViewById(R.id.Contrastbtn);
        gammaButton = findViewById(R.id.Gammabtn);
        backbtn = findViewById(R.id.enhancebacklayout);
    }

        // Histogram button logic
        private void setClickListeners() {
            // Histogram button click listener
            histogramButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(EnhanceActivity.this, "Histogram Equalization selected", Toast.LENGTH_SHORT).show();
                }
            });

            gammaButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(EnhanceActivity.this, "Gamma Correction selected", Toast.LENGTH_SHORT).show();
                }
            });

            // Contrast button click listener
            contrastButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(EnhanceActivity.this, "Contrast Stretching selected", Toast.LENGTH_SHORT).show();
                }
            });

            // Back button click listener
            backbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }
}