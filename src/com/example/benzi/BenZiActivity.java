package com.example.benzi;

import java.util.ArrayList;
import java.util.List;

import com.example.test.R;
import com.example.you.You;
import com.example.you.YouAdapter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class BenZiActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_benzi_demo);
		ListView listView=(ListView)findViewById(R.id.benziView);
		BenZiAdapter benziAdapter=new BenZiAdapter();
		List<BenZi> list = new ArrayList<BenZi>();
		BenZi benZi1=new BenZi(10,45,35,"黑色",15);
		list.add(benZi1);
		BenZi benZi2=new BenZi(12,43,30,"黄色",10);
		list.add(benZi2);
		BenZi benZi3=new BenZi(16,20,35,"紫色",14);
		list.add(benZi3);

		BenZi benZi4=new BenZi(18,45,35,"粉色",18);
		list.add(benZi4);
		BenZi benZi5=new BenZi(14,33,25,"绿色",17);
		list.add(benZi5);


		benziAdapter.setShowlist(list);
		listView.setAdapter(benziAdapter);
	}



}
