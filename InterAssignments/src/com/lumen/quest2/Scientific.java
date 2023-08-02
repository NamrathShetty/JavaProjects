package com.lumen.quest2;

public class Scientific extends Basic implements ScientificCalculator {

	@Override
	public void square(int x) {
		System.out.println("Square "+(x*x));

	}

	@Override
	public void cube(int x) {
		System.out.println("Cube "+(x*x*x));

	}

	@Override
	public void add(int x, int y) {
		System.out.println("Add "+(x+y));

	}

	@Override
	public void difference(int x, int y) {
		System.out.println("Subtract "+(x-y));

	}

	@Override
	public void product(int x, int y) {
		System.out.println("Product "+(x*y));

	}

	@Override
	public void divide(int x, int y) {
		System.out.println("Divide "+(x/y));

	}

}
