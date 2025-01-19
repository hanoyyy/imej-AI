package com.example.miniprojectimageai;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class EnhanceActivity extends AppCompatActivity {
    private static final String TAG = "EnhanceActivity";
    private Button histogramButton, contrastButton, gammaButton;
    private LinearLayout backbtn;
    private ApiService apiService;
    private String currentImagePath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enhance_image);

        initializeViews();
        setClickListeners();


    }

    private void initializeViews() {
        histogramButton = findViewById(R.id.Histogrambtn);
        contrastButton = findViewById(R.id.Contrastbtn);
        gammaButton = findViewById(R.id.Gammabtn);
        backbtn = findViewById(R.id.enhancebacklayout);
    }

    private void setClickListeners() {
        histogramButton.setOnClickListener(v -> Toast.makeText(this, " Histogram Equalization clicked!", Toast.LENGTH_SHORT).show());
        contrastButton.setOnClickListener(v -> Toast.makeText(this, "Contrast Stretching clicked!", Toast.LENGTH_SHORT).show());
        gammaButton.setOnClickListener(v ->Toast.makeText(this, "Gamma Correction clicked!", Toast.LENGTH_SHORT).show());

        backbtn.setOnClickListener(v -> finish());
    }



}