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
	private LinearLayout backlayout,undolayout,redolayout,checklayout, enhancelayout, filterlayout, matchinglayout,restorationlayout,mathematicallayout,basiclayout,binarylayout,compressionlayout,segmentationlayout;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.edit_photo);
		backlayout = findViewById(R.id.backlayout);
		originalimage = findViewById(R.id.originalimage);
		modifiedimage = findViewById(R.id.modifiedimage);
		segmentationlayout = findViewById(R.id.segmentationlayout);
		compressionlayout = findViewById(R.id.compressionlayout);
		binarylayout = findViewById(R.id.binarylayout);
		basiclayout = findViewById(R.id.basiclayout);
		matchinglayout = findViewById(R.id.matchinglayout);
		restorationlayout = findViewById(R.id.restorationlayout);
		mathematicallayout = findViewById(R.id.mathematicallayout);
		filterlayout = findViewById(R.id.filterlayout);
		enhancelayout = findViewById(R.id.enhancelayout);
		checklayout = findViewById(R.id.checklayout);
		redolayout = findViewById(R.id.redolayout);
		undolayout = findViewById(R.id.undolayout);




	}
}
	
	