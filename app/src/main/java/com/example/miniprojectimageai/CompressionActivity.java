package com.example.miniprojectimageai;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

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

    OkHttpClient okHttpClient = new OkHttpClient();
    Request request = new Request.Builder().url("http://10.0.2.2:5000/compress_dct" + AppState.getImageName()).build();

    private void setClickListeners() {
        btnLossless.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = findViewById(R.id.imageview);
                okHttpClient.newCall(request).enqueue(new Callback() {
                    @Override
                    public void onFailure(@NonNull Call call, @NonNull IOException e) {

                    }

                    @Override
                    public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {

                    }
                });
            }
        });

        btnLossy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

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
