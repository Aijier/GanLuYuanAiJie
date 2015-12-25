package com.example.qiche;

public class QiChe {
	int price;
	String color;
	String name;
	String number;
	String company;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public QiChe(int price, String color, String name, String numember,
			String company) {
		super();
		this.price = price;
		this.color = color;
		this.name = name;
		this.number = numember;
		this.company = company;
	}
}
