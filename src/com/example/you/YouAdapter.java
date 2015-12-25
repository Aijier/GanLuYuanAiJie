package com.example.you;

import java.util.ArrayList;
import java.util.List;

import com.example.test.R;
import com.example.testview.Shoe;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class YouAdapter extends BaseAdapter {
private List<You> youlist=new ArrayList<You>();
	@Override
	public int getCount() {
		return youlist.size();
	}

	@Override
	public Object getItem(int position) {
		return youlist.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		View view=parent.inflate(parent.getContext(),
				R.layout.activity_you_item, null);
		TextView priceView = (TextView) view.findViewById(R.id.priceView);
		TextView typeView = (TextView) view.findViewById(R.id.typeView);
		TextView lengthView= (TextView) view.findViewById(R.id.lengthView);
		TextView birthView = (TextView) view.findViewById(R.id.birthView);
		TextView widthView = (TextView) view.findViewById(R.id.widthView);
		
		You you=youlist.get(position);
		priceView.setText(you.getPrice()+" ");
		typeView.setText(you.getType()+" ");
		lengthView.setText(you.getLength()+" ");
		birthView.setText(you.getBirth()+" ");
		widthView.setText(you.getWidth()+" ");

		return view;
	}
	public List<You> getShowlist() {
		return youlist;
	}

	public void setShowlist(List<You> youlist) {
		this.youlist = youlist;
	}


}
