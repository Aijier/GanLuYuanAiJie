package com.example.testview;

public class Shoe {
	int length;
	int width;
	int price;
	String place;
	String color;
	String style;
	String birth;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public Shoe(int length, int width, int price, String place, String color,
			String style, String birth) {
		super();
		this.length = length;
		this.width = width;
		this.price = price;
		this.place = place;
		this.color = color;
		this.style = style;
		this.birth = birth;
	}

}
