package com.example.miniprojectimageai;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class blendingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_blending);

        Button btnBlend = findViewById(R.id.btnBlend);
        btnBlend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Button is clicked");
                Toast.makeText(blendingActivity.this, "Button is clicked", Toast.LENGTH_SHORT).show();
            }
        });



    }
}