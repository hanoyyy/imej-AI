package com.example.miniprojectimageai;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class padding_border_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_padding_border);

        EditText valueTop = findViewById(R.id.value_top);
        EditText valueRight = findViewById(R.id.value_right);
        EditText valueBottom = findViewById(R.id.value_bottom);
        EditText valueLeft = findViewById(R.id.value_left);

        Button btnPadding = findViewById(R.id.btnPadding);
        Button btnBorder = findViewById(R.id.btnBorder);
        Button backButton = findViewById(R.id.back);

        backButton.setOnClickListener(v -> {
            Toast.makeText(padding_border_activity.this, "Back Button Clicked", Toast.LENGTH_SHORT).show();

            // Navigate back to the previous activity
            Intent intent = new Intent(padding_border_activity.this, basic_image_activity.class);
            startActivity(intent);
        });

        btnPadding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String top = valueTop.getText().toString();
                String right = valueRight.getText().toString();
                String bottom = valueBottom.getText().toString();
                String left = valueLeft.getText().toString();

                if (top.isEmpty() || right.isEmpty() || bottom.isEmpty() || left.isEmpty()) {
                    Toast.makeText(padding_border_activity.this, "Please enter values for all fields", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(padding_border_activity.this, "Padding Button Clicked: Top " + top + ", Right " + right + ", Bottom " + bottom + ", Left " + left, Toast.LENGTH_SHORT).show();
                }

                // Disable Border button so the user only can select one
                btnBorder.setEnabled(false);
            }
        });

        btnBorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String top = valueTop.getText().toString();
                String right = valueRight.getText().toString();
                String bottom = valueBottom.getText().toString();
                String left = valueLeft.getText().toString();

                if (top.isEmpty() || right.isEmpty() || bottom.isEmpty() || left.isEmpty()) {
                    Toast.makeText(padding_border_activity.this, "Please enter values for all fields", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(padding_border_activity.this, "Border Button Clicked: Top " + top + ", Right " + right + ", Bottom " + bottom + ", Left " + left, Toast.LENGTH_SHORT).show();
                }

                // Disable Padding button so the user only can select one
                btnPadding.setEnabled(false);
            }
        });
    }
}
