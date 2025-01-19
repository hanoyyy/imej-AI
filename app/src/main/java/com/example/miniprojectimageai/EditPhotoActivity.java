package com.example.miniprojectimageai;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

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

		// Initialize the horizontal scroll view options
		initializeScrollViewOptions();
	}

	private void initializeScrollViewOptions() {
		// Define LinearLayout variables for each option in the horizontal scroll view
		LinearLayout basicLayout = findViewById(R.id.basiclayout);
		LinearLayout mathematicalLayout = findViewById(R.id.mathematicallayout);
		LinearLayout filterLayout = findViewById(R.id.filterlayout);
		LinearLayout enhanceLayout = findViewById(R.id.enhancelayout);
		LinearLayout compressionLayout = findViewById(R.id.compressionlayout);
		LinearLayout segmentationLayout = findViewById(R.id.segmentationlayout);
		LinearLayout binaryLayout = findViewById(R.id.binarylayout);
		LinearLayout restorationLayout = findViewById(R.id.restorationlayout);
		LinearLayout matchingLayout = findViewById(R.id.matchinglayout);

		// Set click listeners for each layout
		basicLayout.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(EditPhotoActivity.this, "Basic option clicked", Toast.LENGTH_SHORT).show();
				// Add logic for Basic option
			}
		});

		mathematicalLayout.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(EditPhotoActivity.this, "Mathematical option clicked", Toast.LENGTH_SHORT).show();
				// Add logic for Mathematical option
			}
		});

		filterLayout.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(EditPhotoActivity.this, "Filter option clicked", Toast.LENGTH_SHORT).show();
				// Add logic for Filter option
			}
		});

		enhanceLayout.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(EditPhotoActivity.this, "Enhance option clicked", Toast.LENGTH_SHORT).show();
				// Add logic for Enhance option
			}
		});

		compressionLayout.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(EditPhotoActivity.this, "Compression option clicked", Toast.LENGTH_SHORT).show();
				// Add logic for Compression option
			}
		});

		segmentationLayout.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(EditPhotoActivity.this, "Segmentation option clicked", Toast.LENGTH_SHORT).show();
				// Add logic for Segmentation option
			}
		});

		binaryLayout.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Navigate to the BinaryImageActivity
				Intent intent = new Intent(EditPhotoActivity.this, BinaryImageActivity.class);

				// Pass any data if needed
				String imageUriString = getIntent().getStringExtra("imageUri");
				if (imageUriString != null) {
					intent.putExtra("imageUri", imageUriString);
				}

				startActivity(intent);
			}
		});


		restorationLayout.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(EditPhotoActivity.this, "Restoration option clicked", Toast.LENGTH_SHORT).show();
				// Add logic for Restoration option
			}
		});

		matchingLayout.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(EditPhotoActivity.this, "Matching option clicked", Toast.LENGTH_SHORT).show();
				// Add logic for Matching option
			}
		});
	}
}
