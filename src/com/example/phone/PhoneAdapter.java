package com.example.phone;

import java.util.ArrayList;
import java.util.List;

import com.example.benzi.BenZi;
import com.example.test.R;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class PhoneAdapter extends BaseAdapter {
private List<Phone> phonelist=new ArrayList<Phone>();
	@Override
	public int getCount() {
		return phonelist.size();
	}

	@Override
	public Object getItem(int position) {
		return phonelist.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position,View convertView, ViewGroup parent) {

		View view=parent.inflate(parent.getContext(),
				R.layout.activity_phone_item, null);
		TextView colorView = (TextView) view.findViewById(R.id.colorView);
		TextView widthView = (TextView) view.findViewById(R.id.widthView);
		TextView heightView = (TextView) view.findViewById(R.id.heightView);
		TextView nameView = (TextView) view.findViewById(R.id.nameView);
		TextView lengthView= (TextView) view.findViewById(R.id.lengthView);
		
		Phone phone=phonelist.get(position);
		colorView.setText(phone.getColor()+" ");
		widthView.setText(phone.getWidth()+" ");
		heightView.setText(phone.getHeight()+" ");
		nameView.setText(phone.getName()+" ");
		lengthView.setText(phone.getLength()+" ");

		return view;
	
	}
	public List<Phone> getShowlist() {
		return phonelist;
	}

	public void setShowlist(List<Phone> phonelist) {
		this.phonelist =phonelist;
	}


}
