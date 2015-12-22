package com.example.test;

import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {
private Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//加载布局文件
         button1=(Button)this.findViewById(R.id.button1);//获取button1
         button1.setOnClickListener(new View.OnClickListener() {//点击button事件
			
			@Override
			public void onClick(View v) {
				//创建意图
				Intent intent=new Intent(MainActivity.this,SecondActivity.class);
				//启动意图
				startActivity(intent);
				
			}
		});
        
        
         
    }
    


}
