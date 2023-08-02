package com.lumen.abs;

public class Bike extends Vehicle {

	public Bike(String model, String brand, Double price) {
		super(model, brand, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	void getMileage() {
		System.out.println("Milage is moderate");

	}

	@Override
	void showType() {
		if(model.equals("X-pulse"))
			System.out.println("OffRoad");
		else
			System.out.println("OnRoad");

	}
	
	void engineType() {
		System.out.println("Petrol Engine");
	}

}
