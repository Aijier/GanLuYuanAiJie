package com.example.test;

import android.os.Bundle;
import android.view.Window;

public class NewActivity extends ZhiFuBaoActivity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.shenghuo);
	}

}
