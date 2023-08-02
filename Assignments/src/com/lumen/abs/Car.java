package com.lumen.abs;

public class Car extends Vehicle {

	public Car(String model, String brand, Double price) {
		super(model, brand, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	void getMileage() {
		System.out.println("Milage is Good");

	}

	@Override
	void showType() {
		if(model.equals("Innova")) {
			System.out.println("MVP");
			
		}
		else if(model.equals("Creta")) {
			System.out.println("SUV");
		}
		else {
			System.out.println("Hatchback");
		}

	}
	String[] showAccessories() {
		String []acc=new String[]{"CarCover","Mat","Air Freshner","Tyre"};
		return acc;
	}

}
