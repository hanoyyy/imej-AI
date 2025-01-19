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

public class translationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_translation);

        EditText valueTX = findViewById(R.id.txValue);
        EditText valueTY = findViewById(R.id.tyValue);
        Button btnTranslation = findViewById(R.id.btnTranslation);
        Button backButton = findViewById(R.id.back);

        backButton.setOnClickListener(v -> {
            Toast.makeText(translationActivity.this, "Back Button Clicked", Toast.LENGTH_SHORT).show();

            // Navigate back to the previous activity
            Intent intent = new Intent(translationActivity.this, basic_image_activity.class);
            startActivity(intent);
        });

        btnTranslation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String xValue = valueTX.getText().toString();
                String yValue = valueTY.getText().toString();

                if (isInteger(xValue) && isInteger(yValue)) {
                    Toast.makeText(translationActivity.this, "Translation: X = " + xValue + ", Y = " + yValue, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(translationActivity.this, "Please enter valid integer values", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
