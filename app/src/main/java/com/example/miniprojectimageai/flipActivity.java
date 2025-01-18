package com.example.miniprojectimageai;

import android.os.Bundle;
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
