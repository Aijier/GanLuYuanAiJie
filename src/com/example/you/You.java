package com.example.you;

public class You {
	int price;
	String type;
	int length;
	String birth;
	int width;

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

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width =width;
	}

	public You(int price, String type, int length, String birth, int width) {
		super();
		this.price = price;
		this.type = type;
		this.length = length;
		this.birth = birth;
		this.width=width;
	}

}
