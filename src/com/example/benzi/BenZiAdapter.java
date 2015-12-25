package com.example.benzi;

import java.util.ArrayList;
import java.util.List;

import com.example.test.R;
import com.example.you.You;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class BenZiAdapter extends BaseAdapter {
private List<BenZi> benzilist=new ArrayList<BenZi>();

	@Override
	public int getCount() {
		return benzilist.size();
	}

	@Override
	public Object getItem(int position) {
		return benzilist.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		View view=parent.inflate(parent.getContext(),
				R.layout.activity_benzi_item, null);
		TextView priceView = (TextView) view.findViewById(R.id.priceView);
		TextView yeshuView = (TextView) view.findViewById(R.id.yeshuView);
		TextView lengthView= (TextView) view.findViewById(R.id.lengthView);
		TextView colorView = (TextView) view.findViewById(R.id.colorView);
		TextView widthView = (TextView) view.findViewById(R.id.widthView);
		
		BenZi benZi=benzilist.get(position);
		priceView.setText(benZi.getPrice()+" ");
		yeshuView.setText(benZi.getYeshu()+" ");
		lengthView.setText(benZi.getLength()+" ");
		colorView.setText(benZi.getColor()+" ");
		widthView.setText(benZi.getWidth()+" ");

		return view;
	}
	public List<BenZi> getShowlist() {
		return benzilist;
	}

	public void setShowlist(List<BenZi> benzilist) {
		this.benzilist =benzilist;
	}


}
