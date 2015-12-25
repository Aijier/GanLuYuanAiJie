package com.example.movie;

public class Movie {
int length;
String style;
int price;
String actor;
String time;
public int getLength() {
	return length;
}

public void setLength(int length) {
	this.length = length;
}

public String getStyle() {
	return style;
}

public void setWidth(String style) {
	this.style = style;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}
public String getActor() {
	return actor;
}

public void setActor(String actor) {
	this.actor =actor;
}


public String getTime() {
	return time;
}

public void setTime(String time) {
	this.time =time;
}

public Movie(int length, String style, int price, String actor, String time) {
	super();
	this.length = length;
	this.style = style;
	this.price = price;
	this.actor = actor;
	this.time = time;
}
}
