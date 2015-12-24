package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class ZhiFuBaoActivity extends Activity {
	private Button button7;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.listview_main);
		button7.setOnClickListener(new View.OnClickListener() {//点击button事件
   			
   			@Override
   			public void onClick(View v) {
   				//创建意图
   				Intent intent=new Intent(ZhiFuBaoActivity.this,NewActivity.class);
   				//启动意图
   				startActivity(intent);
   				
   			}
   		});

	}

}
