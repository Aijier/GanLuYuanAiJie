package com.example.movie;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.listview.ItemModel;
import com.example.test.R;
import com.example.testview.Shoe;

public class MovieActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_movie_demo);
		ListView mView=(ListView)findViewById(R.id.movieView);
		MovieAdapter movieAdapter=new MovieAdapter();
		List<Movie> list=new ArrayList<Movie>();
		
		Movie movie1 = new Movie(123,"喜剧",88,"成龙","2015-05-19");
		list.add(movie1);
		Movie movie2 = new Movie(103,"爱情剧",30,"李怡","2012-03-22");
		list.add(movie2);
		Movie movie3 = new Movie(116,"恐怖片",46,"Herry","2015-");
		list.add(movie3);
		Movie movie4 = new Movie(131,"美剧",88,"Zebry","2015-05-19");
		list.add(movie4);
		Movie movie5 = new Movie(145,"科幻片",87,"Beth","2015-05-19");
		list.add(movie5);
		movieAdapter.setMovielist(list);
		mView.setAdapter(movieAdapter);

	}
	
}
