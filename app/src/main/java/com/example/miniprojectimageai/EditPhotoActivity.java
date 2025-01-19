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
		basicLayout.setOnClickListener(v -> {
			// Navigate to the BasicImageActivity
			Intent intent = new Intent(EditPhotoActivity.this, basic_image_activity.class);

			// Pass the image URI to the BasicImageActivity
			String imageUriString = getIntent().getStringExtra("imageUri");
			if (imageUriString != null) {
				intent.putExtra("imageUri", imageUriString);
			}

			// Start the BasicImageActivity
			startActivity(intent);
		});


		mathematicalLayout.setOnClickListener(v -> {
			// Navigate to the MathOperationActivity
			Intent intent = new Intent(EditPhotoActivity.this, math_operation_activity.class);

			// Pass the image URI to the MathOperationActivity
			String imageUriString = getIntent().getStringExtra("imageUri");
			if (imageUriString != null) {
				intent.putExtra("imageUri", imageUriString);
			}

			// Start the MathOperationActivity
			startActivity(intent);
		});

		filterLayout.setOnClickListener(v -> {
			// Navigate to the FilterActivity
			Intent intent = new Intent(EditPhotoActivity.this, filterActivity.class);

			// Pass the image URI to the FilterActivity
			String imageUriString = getIntent().getStringExtra("imageUri");
			if (imageUriString != null) {
				intent.putExtra("imageUri", imageUriString);
			}

			// Start the FilterActivity
			startActivity(intent);
		});

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
