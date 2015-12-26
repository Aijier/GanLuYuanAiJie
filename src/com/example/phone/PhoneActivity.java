package com.example.phone;

import java.util.ArrayList;
import java.util.List;

import com.example.test.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class PhoneActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_phone_demo);
		ListView listView=(ListView)findViewById(R.id.phoneView);
		PhoneAdapter phoneAdapter=new PhoneAdapter();
		List<Phone> list=new ArrayList<Phone>();
		Phone phone1=new Phone("绿色",1,12,"坚果",8);
		list.add(phone1);
		Phone phone2=new Phone("青色",2,13,"苹果",9);
		list.add(phone2);
		Phone phone3=new Phone("黑色",3,13,"诺基亚",7);
		list.add(phone3);
		Phone phone4=new Phone("橙色",2,12,"坚果",10);
		list.add(phone4);
		Phone phone5=new Phone("红色",1,12,"步步高",9);
		list.add(phone5);
		phoneAdapter.setShowlist(list);
		listView.setAdapter(phoneAdapter);

	}
	
}
