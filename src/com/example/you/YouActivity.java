package com.example.you;



import java.util.ArrayList;
import java.util.List;

import com.example.test.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class YouActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_you_demo);
		ListView listView=(ListView)findViewById(R.id.youView);
		YouAdapter youAdapter=new YouAdapter();
		List<You> list = new ArrayList<You>();
		You you1=new You(88,"植物油",35,"2015-12-24",15);
		list.add(you1);
		You you2=new You(120,"花生油",34,"2015-12-23",16);
		list.add(you2);
		You you3=new You(145,"茶油",36,"2015-12-20",17);
		list.add(you3);
		You you4=new You(119,"菜籽油",38,"2015-12-13",13);
		list.add(you4);
		You you5=new You(69,"猪油",37,"2015-12-25",14);
		list.add(you5);

		youAdapter.setShowlist(list);
		listView.setAdapter(youAdapter);
	}

}
