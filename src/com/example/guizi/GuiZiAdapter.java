package com.example.guizi;

import java.util.ArrayList;
import java.util.List;

import com.example.test.R;
import com.example.you.You;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class GuiZiAdapter extends BaseAdapter {
private List<GuiZi> guizilist=new ArrayList<GuiZi>();

	@Override
	public int getCount() {
		return guizilist.size();
	}

	@Override
	public Object getItem(int position) {
		return guizilist.get(position);
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {


		View view=parent.inflate(parent.getContext(),
				R.layout.activity_guizi_item, null);
		TextView priceView = (TextView) view.findViewById(R.id.priceView);
		TextView typeView = (TextView) view.findViewById(R.id.typeView);
		TextView lengthView= (TextView) view.findViewById(R.id.lengthView);
		TextView colorView = (TextView) view.findViewById(R.id.colorView);
		TextView widthView = (TextView) view.findViewById(R.id.widthView);
		
		GuiZi guiZi=guizilist.get(position);
		priceView.setText(guiZi.getPrice()+" ");
		typeView.setText(guiZi.getType()+" ");
		lengthView.setText(guiZi.getLength()+" ");
		colorView.setText(guiZi.getColor()+" ");
		widthView.setText(guiZi.getWidth()+" ");

		return view;
	
	}
	public List<GuiZi> getShowlist() {
		return guizilist;
	}

	public void setShowlist(List<GuiZi> guizilist) {
		this.guizilist = guizilist;
	}


}
