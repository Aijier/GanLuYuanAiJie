package com.example.movie;

import java.util.ArrayList;
import java.util.List;

import com.example.test.R;
import com.example.testview.Shoe;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MovieAdapter extends BaseAdapter {
private List<Movie> movielist=new ArrayList<Movie>();
	@Override
	public int getCount() {
		return movielist.size();
	}

	@Override
	public Object getItem(int position) {
		return movielist.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View view=parent.inflate(parent.getContext(),
				R.layout.activity_movie_item, null);
		TextView lengthView = (TextView) view.findViewById(R.id.lengthView);
		TextView styleView = (TextView) view.findViewById(R.id.styleView);
		TextView priceView = (TextView) view.findViewById(R.id.priceView);
		TextView actorView = (TextView) view.findViewById(R.id.actorView);
		TextView timeView = (TextView) view.findViewById(R.id.timeView);
		Movie movie=movielist.get(position);
		lengthView.setText(movie.getLength()+"");
		styleView.setText(movie.getStyle()+" ");
		priceView.setText(movie.getPrice()+" ");
		actorView.setText(movie.getActor()+" ");
		timeView.setText(movie.getTime()+" ");

		return view;
	
	}
	public List<Movie> getMovielist() {
		return movielist;
	}

	public void setMovielist(List<Movie> movielist) {
		this.movielist = movielist;
	}


}
