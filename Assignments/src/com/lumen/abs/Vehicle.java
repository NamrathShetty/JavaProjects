package com.lumen.abs;

public abstract class Vehicle {
	String model;
	String brand;
	Double price;
	public Vehicle(String model, String brand, Double price) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
	}
	
	void printDetails() {
		System.out.println("Model is "+model);
		System.out.println("Brand is "+brand);
		System.out.println("Price is "+price);
	}
	
	abstract void getMileage();
	abstract void showType();
}
