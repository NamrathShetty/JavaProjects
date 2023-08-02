package com.lumen.quest2;

public class CalcMain {

	public static void main(String[] args) {
		System.out.println("Basic Calculation");
		BasicCalculator calculator=new Basic();
		calculator.add(2,5);
		calculator.product(3, 3);
		calculator.difference(6, 3);
		calculator.divide(8, 2);
		
		System.out.println("Scientific Calculation ");
		ScientificCalculator SciCalc=new Scientific();
		SciCalc.square(3);
		SciCalc.cube(2);
		SciCalc.add(2,4);
		SciCalc.difference(5,6);
		SciCalc.product(3, 5);
		SciCalc.difference(4,3);

	}

}
