package com.example.miniprojectimageai;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class EditPhotoActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_edit_photo);

		// Get the ImageView
		ImageView ivUploadedPhoto = findViewById(R.id.imageview);

		// Get the passed URI
		String imageUriString = getIntent().getStringExtra("imageUri");
		if (imageUriString != null) {
			Uri imageUri = Uri.parse(imageUriString);
			// Set the image to the ImageView
			ivUploadedPhoto.setImageURI(imageUri);
		}
	}
}
