package com.example.listview;

import java.util.ArrayList;
import java.util.List;

import com.example.test.R;
import com.example.test.R.drawable;
import com.example.test.R.id;
import com.example.test.R.layout;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class ListViewDemoActicity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_view_demo);
		ListView listView = (ListView)findViewById(R.id.listView);
		
		MyAdapter myAdapter = new MyAdapter();
		
		List<ItemModel> list = new ArrayList<ItemModel>();

		for (int i = 0; i < 10; i++) {
			ItemModel itemModel = new ItemModel(R.drawable.sao, "标题" + i,
					"描述木奥斯" + i, "2015-4-4" + "  " + i);
			list.add(itemModel);
		}
		
		myAdapter.setList(list);
	
		
	
		listView.setAdapter(myAdapter );
	}

}
