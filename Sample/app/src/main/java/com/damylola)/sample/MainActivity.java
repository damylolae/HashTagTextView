package com.damylola.sample;

import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View.*;
import android.widget.TextView;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import com.damylola.view.HashTagHelper;



public class MainActivity extends Activity {
	
	private String text = "";
	
	private TextView textview1;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		textview1 = findViewById(R.id.textview1);
	}
	
	private void initializeLogic() {
		text = textview1.getText().toString();
		HashTagHelper hashTagHelper = new HashTagHelper(textview1,text);
		hashTagHelper.setUnderLineText(true);
		HashTagHelper.ClickListener listener = new HashTagHelper.ClickListener(){
				@Override
				public void onTextClicked (View v,String word){
						showMessage(word);
				}};
		hashTagHelper.setOnClickListener(listener);
		hashTagHelper.setHighlightColor(Color.parseColor("#009688"));
		hashTagHelper.highLightText(text);
	}
	
	
	
	public void showMessage(String s) {
		Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show();
	}
	
	
}
