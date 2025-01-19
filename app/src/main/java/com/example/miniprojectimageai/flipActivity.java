package com.example.miniprojectimageai;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class flipActivity extends AppCompatActivity {
    Button backButton,btnHorizontal,btnVertical;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_flip);
        initializeViews();
        setClickListeners();


    }
    private void initializeViews() {

        backButton = findViewById(R.id.back);
        btnHorizontal = findViewById(R.id.btnHorizontal);
        btnVertical = findViewById(R.id.btnVertical);
    }
    private void setClickListeners() {
        backButton.setOnClickListener(v -> {
            finish();
        });


        btnHorizontal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(flipActivity.this, "Horizontal Flip button is clicked", Toast.LENGTH_SHORT).show();
            }
        });


        btnVertical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(flipActivity.this, "Vertical Flip button is clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
