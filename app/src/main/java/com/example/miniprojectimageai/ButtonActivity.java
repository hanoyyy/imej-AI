package com.example.miniprojectimageai;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class ButtonActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        Button myButton = findViewById(R.id.myButton);
        TextView myTextView = findViewById(R.id.myTextView);
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url("http://10.0.2.2:5000").build();


        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                okHttpClient.newCall(request).enqueue(new Callback() {
                    @Override
                    public void onFailure(@NonNull Call call, @NonNull IOException e) {
                        Log.e("ButtonActivity", "Network error: ", e);
                        runOnUiThread(() ->
                                Toast.makeText(ButtonActivity.this, "Network not found", Toast.LENGTH_SHORT).show()
                        );
                    }


                    @Override
                    public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                        if (!response.isSuccessful()) {
                            runOnUiThread(() ->
                                    Toast.makeText(ButtonActivity.this, "Error: " + response.code(), Toast.LENGTH_SHORT).show()
                            );
                            return;
                        }

                        String responseBody = response.body() != null ? response.body().string() : "No response";
                        runOnUiThread(() ->
                                myTextView.setText(responseBody)
                        );
                    }
                });
            }
        });
    }
}
