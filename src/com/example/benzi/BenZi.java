package com.example.benzi;

public class BenZi {
	private int price;
	private int yeshu;
	private int length;
	private String color;
	private int width;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getYeshu() {
		return yeshu;
	}

	public void setYeshu(int yeshu) {
		this.yeshu = yeshu;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color =color;
	}



	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public BenZi(int price, int yeshu, int length, String color,int width) {
		super();
		this.price = price;
		this.yeshu = yeshu;
		this.length = length;
		this.color=color;
		this.width = width;
	}
	
}
