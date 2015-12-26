package com.example.phone;

public class Phone {
	private String color;
	private int width;
	private int height;
	private String name;
	private int length;

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

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Phone(String color, int width, int height, String name, int length) {
		super();
		this.color = color;
		this.width = width;
		this.height = height;
		this.name = name;
		this.length = length;
	}
	
}
