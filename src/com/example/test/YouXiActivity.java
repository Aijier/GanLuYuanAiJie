package com.example.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class YouXiActivity extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.you);
	}

}
