package com.example.testview;

import java.util.ArrayList;
import java.util.List;

import com.example.listview.ItemModel;
import com.example.test.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class TestActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test_view_demo);
		ListView listView=(ListView)findViewById(R.id.testview);
		AiJieAdapter aijieAdapter=new AiJieAdapter();
		List<Shoe> list = new ArrayList<Shoe>();
		Shoe shoe1=new Shoe(15,8,23,"太原","red","跑步鞋","2015-05-24");
		list.add(shoe1);
		Shoe shoe2=new Shoe(18,6,20,"吉林","green","高跟鞋","2011-07-24");
		list.add(shoe2);
		Shoe shoe3=new Shoe(18,6,20,"吉林","green","高跟鞋","2011-07-24");
		list.add(shoe3);
		Shoe shoe4=new Shoe(14,6,14,"赤峰","yellow","童鞋","2010-03-15");
		list.add(shoe4);
		Shoe shoe5=new Shoe(14,6,26,"抚顺","black","坡跟鞋","2011-04-24");
		list.add(shoe5);
		Shoe shoe6=new Shoe(18,6,24,"吉林","white","鱼嘴鞋","2011-09-29");
		list.add(shoe6);

//		for(int i=0;i<10;i++){
//			Shoe shoe=new Shoe(15+i,8+i,23+i,"山东", "red",
//					 "休闲","2014-12-25");
//			list.add(shoe);
//			
//		}
	aijieAdapter.setShowlist(list);
	listView.setAdapter(aijieAdapter);
	}
}
