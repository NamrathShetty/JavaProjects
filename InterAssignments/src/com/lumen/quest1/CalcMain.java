package com.lumen.quest1;


public class CalcMain {

	public static void main(String[] args) {
		ICalculator add=(int a,int b)->System.out.println("Add "+(a+b));
		ICalculator sub=(int a,int b)->System.out.println("Sub "+(a-b));
		ICalculator product=(int a,int b)->System.out.println("Product "+(a*b));
		ICalculator division=(int a,int b)->System.out.println("Division "+(a/b));
		
		add.calculate(12,2);
		sub.calculate(2,4);
		product.calculate(3, 5);
		division.calculate(8, 2);
	}

}
