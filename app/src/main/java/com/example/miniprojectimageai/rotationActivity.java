package com.example.miniprojectimageai;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.io.File;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class rotationActivity extends AppCompatActivity {

    private ApiService apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_rotation);

        // Initialize Retrofit
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://10.0.2.2:5000") // Replace with your Flask server's URL
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apiService = retrofit.create(ApiService.class);

        Button btn45 = findViewById(R.id.btn45);
        Button btn90 = findViewById(R.id.btn90);
        Button btn135 = findViewById(R.id.btn135);
        Button btn180 = findViewById(R.id.btn180);
        Button btn225 = findViewById(R.id.btn225);
        Button btn270 = findViewById(R.id.btn270);
        Button btn315 = findViewById(R.id.btn315);
        Button backButton = findViewById(R.id.back);

        backButton.setOnClickListener(v -> {
            finish();
        });

        // Set button click listeners for rotation degrees
        btn45.setOnClickListener(v -> rotateImage(45));
        btn90.setOnClickListener(v -> rotateImage(90));
        btn135.setOnClickListener(v -> rotateImage(135));
        btn180.setOnClickListener(v -> rotateImage(180));
        btn225.setOnClickListener(v -> rotateImage(225));
        btn270.setOnClickListener(v -> rotateImage(270));
        btn315.setOnClickListener(v -> rotateImage(315));
    }

    private void rotateImage(int degrees) {
        if (AppState.getImageName().isEmpty()) {
            Toast.makeText(this, "No image selected!", Toast.LENGTH_SHORT).show();
            return;
        }

        // Create RequestBody for filename and degrees
        RequestBody filenameBody = RequestBody.create(MediaType.parse("text/plain"), AppState.getImageName());
        RequestBody degreesBody = RequestBody.create(MediaType.parse("text/plain"), String.valueOf(degrees));

        // Make the API call
        Call<RotationResponse> call = apiService.rotateImage(filenameBody, degreesBody);
        call.enqueue(new Callback<RotationResponse>() {
            @Override
            public void onResponse(Call<RotationResponse> call, Response<RotationResponse> response) {
                if (response.isSuccessful() && response.body() != null) {
                    String outputPath = response.body().getOutputUrl();
                    Toast.makeText(rotationActivity.this, "Image rotated! Output: " + outputPath, Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(rotationActivity.this, "Failed to rotate image", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<RotationResponse> call, Throwable t) {
                Log.e("RotationActivity", "API call failed", t);
                Toast.makeText(rotationActivity.this, "API call failed: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}