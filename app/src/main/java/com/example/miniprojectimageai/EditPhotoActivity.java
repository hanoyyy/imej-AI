package com.example.miniprojectimageai;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class EditPhotoActivity extends AppCompatActivity {

	private LinearLayout backLayout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_edit_photo);

		// Initialize the back button layout
		backLayout = findViewById(R.id.backlayout);

		// Set click listener for the back layout
		backLayout.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Navigate back to the previous activity
				finish();
			}
		});

		// Get the ImageView
		ImageView ivUploadedPhoto = findViewById(R.id.imageview);

		// Get the passed filename
		String filename = AppState.getImageName();  // Get the filename passed from the previous activity

		if (filename != null) {
			// Construct the image URL using the filename
			String imageUrl = "http://10.0.2.2:5000/get_image/" + filename;  // Replace with your server URL

			// Use Glide to load the image into the ImageView
			Glide.with(this)
					.load(imageUrl)
					.apply(new RequestOptions().placeholder(R.drawable._bg__edit_photo_ek2_shape))  // Optional placeholder image
					.into(ivUploadedPhoto);
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
		basicLayout.setOnClickListener(v ->
				Toast.makeText(EditPhotoActivity.this, "Basic option clicked", Toast.LENGTH_SHORT).show()
		);

		mathematicalLayout.setOnClickListener(v ->
				Toast.makeText(EditPhotoActivity.this, "Mathematical option clicked", Toast.LENGTH_SHORT).show()
		);

		filterLayout.setOnClickListener(v ->
				Toast.makeText(EditPhotoActivity.this, "Filter option clicked", Toast.LENGTH_SHORT).show()
		);

		enhanceLayout.setOnClickListener(v ->
				Toast.makeText(EditPhotoActivity.this, "Enhance option clicked", Toast.LENGTH_SHORT).show()
		);

		compressionLayout.setOnClickListener(v ->
				Toast.makeText(EditPhotoActivity.this, "Compression option clicked", Toast.LENGTH_SHORT).show()
		);

		segmentationLayout.setOnClickListener(v ->
				Toast.makeText(EditPhotoActivity.this, "Segmentation option clicked", Toast.LENGTH_SHORT).show()
		);

		binaryLayout.setOnClickListener(v -> {
			// Navigate to the BinaryImageActivity
			Intent intent = new Intent(EditPhotoActivity.this, BinaryImageActivity.class);

			// Pass any data if needed
			String imageUriString = getIntent().getStringExtra("imageUri");
			if (imageUriString != null) {
				intent.putExtra("imageUri", imageUriString);
			}

			startActivity(intent);
		});

		restorationLayout.setOnClickListener(v -> {
			Intent intent = new Intent(EditPhotoActivity.this, ImageRestorationActivity.class);

			// Pass any data if needed
			String imageUriString = getIntent().getStringExtra("imageUri");
			if (imageUriString != null) {
				intent.putExtra("imageUri", imageUriString);
			}

			startActivity(intent);
		});

		matchingLayout.setOnClickListener(v -> {
			Intent intent = new Intent(EditPhotoActivity.this, ImageMatchingActivity.class);

			// Pass any data if needed
			String imageUriString = getIntent().getStringExtra("imageUri");
			if (imageUriString != null) {
				intent.putExtra("imageUri", imageUriString);
			}

			startActivity(intent);
		});
		segmentationLayout.setOnClickListener(v -> {
			// Navigate to the BinaryImageActivity
			Intent intent = new Intent(EditPhotoActivity.this, SegmentActivity.class);

			// Pass any data if needed
			String imageUriString = getIntent().getStringExtra("imageUri");
			if (imageUriString != null) {
				intent.putExtra("imageUri", imageUriString);
			}

			startActivity(intent);
		});
		compressionLayout.setOnClickListener(v -> {
			// Navigate to the BinaryImageActivity
			Intent intent = new Intent(EditPhotoActivity.this, CompressionActivity.class);

			// Pass any data if needed
			String imageUriString = getIntent().getStringExtra("imageUri");
			if (imageUriString != null) {
				intent.putExtra("imageUri", imageUriString);
			}

			startActivity(intent);
		});
		enhanceLayout.setOnClickListener(v -> {
			// Navigate to the BinaryImageActivity
			Intent intent = new Intent(EditPhotoActivity.this, EnhanceActivity.class);

			// Pass any data if needed
			String imageUriString = getIntent().getStringExtra("imageUri");
			if (imageUriString != null) {
				intent.putExtra("imageUri", imageUriString);
			}

			startActivity(intent);
		});
	}
}
