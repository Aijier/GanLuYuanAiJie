package com.example.guizi;

import java.util.ArrayList;
import java.util.List;

import com.example.test.R;
import com.example.you.You;
import com.example.you.YouAdapter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class GuiZiActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_guizi_demo);
		ListView listView=(ListView)findViewById(R.id.guiziView);
		GuiZiAdapter guiziAdapter=new GuiZiAdapter();
		List<GuiZi> list = new ArrayList<GuiZi>();
		GuiZi guizi1=new GuiZi(120,"木柜",55,"红色",15);
		list.add(guizi1);
		GuiZi guizi2=new GuiZi(145,"折叠柜",60,"绿色",18);
		list.add(guizi2);
		GuiZi guizi3=new GuiZi(155,"木柜",55,"大红",16);
		list.add(guizi3);
		GuiZi guizi4=new GuiZi(129,"折叠柜",65,"浅紫",20);
		list.add(guizi4);
		GuiZi guizi5=new GuiZi(286,"木柜",70,"红色",22);
		list.add(guizi5);

		guiziAdapter.setShowlist(list);
		listView.setAdapter(guiziAdapter);
	}



}
