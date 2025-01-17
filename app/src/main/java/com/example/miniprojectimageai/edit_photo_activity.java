package com.example.miniprojectimageai;
import android.app.Activity;
import android.os.Bundle;


import android.util.Log;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class edit_photo_activity extends Activity {

	private ImageView originalimage, modifiedimage;
	private LinearLayout backlayout,undolayout,redolayout,checklayout, enhancelayout, filterlayout, croplayout,grayscalelayout,colorlayout,fliplayout,rotatelayout,borderlayout,compresslayout,segmentlayout,binarylayout;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.edit_photo);
		backlayout = findViewById(R.id.backlayout);
		originalimage = findViewById(R.id.originalimage);
		modifiedimage = findViewById(R.id.modifiedimage);
		segmentlayout = findViewById(R.id.segmentlayout);
		binarylayout = findViewById(R.id.binarylayout);
		compresslayout = findViewById(R.id.compresslayout);
		borderlayout = findViewById(R.id.borderlayout);
		rotatelayout = findViewById(R.id.rotatelayout);
		fliplayout = findViewById(R.id.fliplayout);
		colorlayout = findViewById(R.id.colorlayout);
		grayscalelayout = findViewById(R.id.grayscalelayout);
		croplayout = findViewById(R.id.croplayout);
		filterlayout = findViewById(R.id.filterlayout);
		enhancelayout = findViewById(R.id.enhancelayout);
		checklayout = findViewById(R.id.checklayout);
		redolayout = findViewById(R.id.redolayout);
		undolayout = findViewById(R.id.undolayout);




	}
}
	
	