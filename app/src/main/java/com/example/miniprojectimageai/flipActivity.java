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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_flip);

        Button backButton = findViewById(R.id.back);
        backButton.setOnClickListener(v -> {
            Toast.makeText(flipActivity.this, "Back Button Clicked", Toast.LENGTH_SHORT).show();

            // Navigate back to the previous activity
            Intent intent = new Intent(flipActivity.this, basic_image_activity.class);
            startActivity(intent);
        });

        Button btnHorizontal = findViewById(R.id.btnHorizontal);
        btnHorizontal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Horizontal Flip button is clicked");
                Toast.makeText(flipActivity.this, "Horizontal Flip button is clicked", Toast.LENGTH_SHORT).show();
            }
        });

        Button btnVertical = findViewById(R.id.btnVertical);
        btnVertical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Vertical Flip button is clicked");
                Toast.makeText(flipActivity.this, "Vertical Flip button is clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
