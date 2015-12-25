package com.example.qiche;

import java.util.ArrayList;
import java.util.List;

import com.example.test.R;
import com.example.testview.Shoe;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class QiCheAdapter extends BaseAdapter {
	private List<QiChe> qichelist=new ArrayList<QiChe>();

	@Override
	public int getCount() {
		return qichelist.size();
	}

	@Override
	public Object getItem(int position) {
		return qichelist.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		View view=parent.inflate(parent.getContext(),
				R.layout.activity_qiche_item, null);
		TextView priceView = (TextView) view.findViewById(R.id.priceView);
		TextView colorView = (TextView) view.findViewById(R.id.colorView);
		TextView nameView = (TextView) view.findViewById(R.id.nameView);
		TextView numberView= (TextView) view.findViewById(R.id.numberView);
		TextView companyView = (TextView) view.findViewById(R.id.companyView);
		QiChe qiChe=qichelist.get(position);
		priceView.setText(qiChe.getPrice()+"");
		colorView.setText(qiChe.getColor()+" ");
		nameView.setText(qiChe.getName()+" ");
		numberView.setText(qiChe.getNumber()+" ");
		companyView.setText(qiChe.getCompany()+" ");

		return view;
	
	}
	public List<QiChe> getShowlist() {
		return qichelist;
	}

	public void setShowlist(List<QiChe> qichelist) {
		this.qichelist = qichelist;
	}


}
