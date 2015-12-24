package com.example.listview;

public class ItemModel {

	int id;
	String title;
	String desc;
	String time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public ItemModel(int id, String title, String desc, String time) {
		super();
		this.id = id;
		this.title = title;
		this.desc = desc;
		this.time = time;
	}
	
}