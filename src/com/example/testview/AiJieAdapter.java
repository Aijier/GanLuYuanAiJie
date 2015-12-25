package com.example.testview;

import java.util.ArrayList;
import java.util.List;

import com.example.listview.ItemModel;
import com.example.test.R;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AiJieAdapter extends BaseAdapter {
private List<Shoe> showlist=new ArrayList<Shoe>();
	@Override
	public int getCount() {
		return showlist.size();
	}

	@Override
	public Object getItem(int position) {
		return showlist.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View view=parent.inflate(parent.getContext(),
				R.layout.activity_test_item, null);
		TextView lengthView = (TextView) view.findViewById(R.id.lengthView);
		TextView widthView = (TextView) view.findViewById(R.id.widthView);
		TextView priceView = (TextView) view.findViewById(R.id.priceView);
		TextView placeView = (TextView) view.findViewById(R.id.placeView);
		TextView colorView= (TextView) view.findViewById(R.id.colorView);
		TextView styleView = (TextView) view.findViewById(R.id.styleView);
		TextView birthView = (TextView) view.findViewById(R.id.birthView);
		Shoe shoe=showlist.get(position);
		lengthView.setText(shoe.getLength()+"");
		widthView.setText(shoe.getWidth()+" ");
		priceView.setText(shoe.getPrice()+" ");
		colorView.setText(shoe.getColor()+" ");
		placeView.setText(shoe.getPlace()+" ");
		styleView.setText(shoe.getStyle()+" ");
		birthView.setText(shoe.getBirth()+" ");

		return view;
	}

	public List<Shoe> getShowlist() {
		return showlist;
	}

	public void setShowlist(List<Shoe> showlist) {
		this.showlist = showlist;
	}

}
