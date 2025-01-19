package com.example.miniprojectimageai;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
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
import retrofit2.http.Part;

public class EnhanceActivity extends AppCompatActivity {
    private Button histogramButton, contrastButton, gammaButton;
    private LinearLayout backbtn;
    private ApiService apiService;
    private String currentImagePath; // To store the current image path

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enhance_image);

        // Initialize Retrofit
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://10.0.2.2:5000/") // Use your server IP/port
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apiService = retrofit.create(ApiService.class);

        // Get the image path from intent
        currentImagePath = getIntent().getStringExtra("imagePath");

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
        histogramButton.setOnClickListener(v -> processImage("histogram"));
        contrastButton.setOnClickListener(v -> processImage("contrast"));
        gammaButton.setOnClickListener(v -> processImage("gamma"));

        backbtn.setOnClickListener(v -> {
            finish();
        });
    }

    private void processImage(String operation) {
        // Create file object from image path
        if (currentImagePath == null || currentImagePath.isEmpty()) {
            Toast.makeText(this, "No image selected", Toast.LENGTH_SHORT).show();
            return;
        }

        File imageFile = new File(currentImagePath);
        if (!imageFile.exists()) {
            Toast.makeText(this, "Image file not found", Toast.LENGTH_SHORT).show();
            return;
        }
        // Create request body
        RequestBody requestFile = RequestBody.create(MediaType.parse("image/*"), imageFile);
        MultipartBody.Part imagePart = MultipartBody.Part.createFormData("image", imageFile.getName(), requestFile);

        // Create API call based on operation
        Call<ResponseBody> call;
        switch (operation) {
            case "histogram":
                call = apiService.processHistogram(imagePart);
                break;
            case "contrast":
                call = apiService.processContrast(imagePart);
                break;
            case "gamma":
                call = apiService.processGamma(imagePart);
                break;
            default:
                return;
        }

        // Execute API call
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if (response.isSuccessful()) {
                    Toast.makeText(EnhanceActivity.this,
                            operation + " processing successful", Toast.LENGTH_SHORT).show();
                    // Handle the processed image
                    saveProcessedImage(response.body(), operation);
                } else {
                    Toast.makeText(EnhanceActivity.this,
                            "Error processing image", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Toast.makeText(EnhanceActivity.this,
                        "Network error: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void saveProcessedImage(ResponseBody body, String operation) {
        if (body == null) return;

        try {
            // Create file in app's private directory
            File processedFile = new File(getExternalFilesDir(null),
                    "processed_" + operation + ".png");

            InputStream inputStream = body.byteStream();
            OutputStream outputStream = new FileOutputStream(processedFile);
            byte[] fileReader = new byte[4096];

            while (true) {
                int read = inputStream.read(fileReader);
                if (read == -1) break;
                outputStream.write(fileReader, 0, read);
            }

            outputStream.flush();
            outputStream.close();
            inputStream.close();

            // Update the current image path
            currentImagePath = processedFile.getAbsolutePath();

            // Notify user
            Toast.makeText(this, "Image saved", Toast.LENGTH_SHORT).show();

        } catch (IOException e) {
            Toast.makeText(this, "Error saving image: " + e.getMessage(),
                    Toast.LENGTH_SHORT).show();
        }
    }
}