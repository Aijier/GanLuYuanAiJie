package com.example.test;

import com.example.benzi.BenZiActivity;
import com.example.guizi.GuiZiActivity;
import com.example.listview.ListViewDemoActicity;
import com.example.movie.MovieActivity;
import com.example.phone.PhoneActivity;
import com.example.qiche.QiCheActivity;
import com.example.testview.TestActivity;
import com.example.you.YouActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity {
private Button button1;
private Button button2;
private Button button3;
private Button button4;
private Button button5;
private Button button6;
private Button button7;
private Button button8;
private Button button9;
private Button button10;
private Button buttonB;
private Button buttonU;
private Button buttonT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//加载布局文件
         button1=(Button)this.findViewById(R.id.button1);//获取button1
         button2=(Button)this.findViewById(R.id.button2);//获取button2
         button3=(Button)this.findViewById(R.id.button3);//获取button3
         button4=(Button)this.findViewById(R.id.button4);//获取button4
         button5=(Button)this.findViewById(R.id.button5);//获取button5
         button6=(Button)this.findViewById(R.id.button6);//获取button6
         button8=(Button)this.findViewById(R.id.button8);//获取button8
         button9=(Button)this.findViewById(R.id.button9);//获取button9
         button10=(Button)this.findViewById(R.id.button10);//获取button10
         buttonB=(Button)this.findViewById(R.id.buttonB);//获取buttonB
         buttonU=(Button)this.findViewById(R.id.buttonU);//获取buttonU
         buttonT=(Button)this.findViewById(R.id.buttonT);
         
         button7=(Button)this.findViewById(R.id.button7);//获取button7
         button7.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(MainActivity.this,ListViewDemoActicity.class));
			}
		});
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
         button6.setOnClickListener(new View.OnClickListener() {//点击button事件
   			
   			@Override
   			public void onClick(View v) {
   				//创建意图
   				Intent intent=new Intent(MainActivity.this,TestActivity.class);
   				//启动意图
   				startActivity(intent);
   				
   			}
   		});
         button8.setOnClickListener(new View.OnClickListener() {//点击button事件
    			
    			@Override
    			public void onClick(View v) {
    				//创建意图
    				Intent intent=new Intent(MainActivity.this,MovieActivity.class);
    				//启动意图
    				startActivity(intent);
    				
    			}
    		});

         button9.setOnClickListener(new View.OnClickListener() {//点击button事件
 			
 			@Override
 			public void onClick(View v) {
 				//创建意图
 				Intent intent=new Intent(MainActivity.this,QiCheActivity.class);
 				//启动意图
 				startActivity(intent);
 				
 			}
 		});

         button10.setOnClickListener(new View.OnClickListener() {//点击button事件
  			
  			@Override
  			public void onClick(View v) {
  				//创建意图
  				Intent intent=new Intent(MainActivity.this,YouActivity.class);
  				//启动意图
  				startActivity(intent);
  				
  			}
  		});

         buttonB.setOnClickListener(new View.OnClickListener() {//点击button事件
   			
   			@Override
   			public void onClick(View v) {
   				//创建意图
   				Intent intent=new Intent(MainActivity.this,GuiZiActivity.class);
   				//启动意图
   				startActivity(intent);
   				
   			}
   		});
         buttonU.setOnClickListener(new View.OnClickListener() {//点击button事件
    			
    			@Override
    			public void onClick(View v) {
    				//创建意图
    				Intent intent=new Intent(MainActivity.this,BenZiActivity.class);
    				//启动意图
    				startActivity(intent);
    				
    			}
    		});
         buttonT.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent=new Intent(MainActivity.this,PhoneActivity.class);
				startActivity(intent);
			}
		});


         
        
         
    }
    


}
