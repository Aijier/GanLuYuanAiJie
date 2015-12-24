package com.example.listview;

import java.util.List;

import com.example.test.R;
import com.example.test.R.id;
import com.example.test.R.layout;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {

	private List<ItemModel> list;

	@Override
	public int getCount() {
		return list.size();
	}

	@Override
	public Object getItem(int pos) {
		return list.get(pos);
	}

	@Override
	public long getItemId(int pos) {
		return pos;
	}

	@Override
	public View getView(int pos, View paramView, ViewGroup paramViewGroup) {
		Log.d("getView", "pos:"+pos);
		View view = paramViewGroup.inflate(paramViewGroup.getContext(),
				R.layout.activity_list_item, null);
		TextView timeTv = (TextView) view.findViewById(R.id.timeTv);
		TextView titleTv = (TextView) view.findViewById(R.id.titleTv);
		ImageView iconIv = (ImageView) view.findViewById(R.id.iconIv);
		
		ItemModel itemModel = list.get(pos);
		timeTv.setText(itemModel.getTime());
		titleTv.setText(itemModel.getTitle());
		iconIv.setImageResource(itemModel.getId());
		return view;
	}

	public List<ItemModel> getList() {
		return list;
	}

	public void setList(List<ItemModel> list) {
		this.list = list;
	}

}
