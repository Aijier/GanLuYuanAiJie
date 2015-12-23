package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {
private Button button1;
private Button button2;
private Button button3;
private Button button4;
private Button button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//加载布局文件
         button1=(Button)this.findViewById(R.id.button1);//获取button1
         button2=(Button)this.findViewById(R.id.button2);//获取button1
         button3=(Button)this.findViewById(R.id.button3);//获取button1
         button4=(Button)this.findViewById(R.id.button4);//获取button1
         button5=(Button)this.findViewById(R.id.button5);//获取button1
         
         button1.setOnClickListener(new View.OnClickListener() {//点击button事件
			
			@Override
			public void onClick(View v) {
				//创建意图
				Intent intent=new Intent(MainActivity.this,SecondActivity.class);
				//启动意图
				startActivity(intent);
				
			}
		});
         button2.setOnClickListener(new View.OnClickListener() {//点击button事件
 			
 			@Override
 			public void onClick(View v) {
 				//创建意图
 				Intent intent=new Intent(MainActivity.this,SaoYiSaoActivity.class);
 				//启动意图
 				startActivity(intent);
 				
 			}
 		});
         button3.setOnClickListener(new View.OnClickListener() {//点击button事件
  			
  			@Override
  			public void onClick(View v) {
  				//创建意图
  				Intent intent=new Intent(MainActivity.this,YaoYiYaoActivity.class);
  				//启动意图
  				startActivity(intent);
  				
  			}
  		});
         button4.setOnClickListener(new View.OnClickListener() {//点击button事件
  			
  			@Override
  			public void onClick(View v) {
  				//创建意图
  				Intent intent=new Intent(MainActivity.this,ShoppingActivity.class);
  				//启动意图
  				startActivity(intent);
  				
  			}
  		});
         button5.setOnClickListener(new View.OnClickListener() {//点击button事件
  			
  			@Override
  			public void onClick(View v) {
  				//创建意图
  				Intent intent=new Intent(MainActivity.this,YouXiActivity.class);
  				//启动意图
  				startActivity(intent);
  				
  			}
  		});



        
         
    }
    


}
