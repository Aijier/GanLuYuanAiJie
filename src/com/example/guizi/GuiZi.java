package com.example.guizi;

public class GuiZi {
	private int price;
	private String type;
	private int length;
	private String color;
	private int width;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
		this.color = color;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public GuiZi(int price, String type, int length, String color, int width) {
		super();
		this.price = price;
		this.type = type;
		this.length = length;
		this.color = color;
		this.width = width;
	}
	
}
