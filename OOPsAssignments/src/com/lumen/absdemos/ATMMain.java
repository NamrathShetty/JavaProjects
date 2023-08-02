package com.lumen.absdemos;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Bank acc = null;
		System.out.println("Enter the Bank Type");
		String accType=scanner.nextLine();
		if(accType.equals("Savings")) {
			acc=new Savings(10000.0);
		}
		else if(accType.equals("Current")){
			acc=new Current(10000.0);
		}
		
		System.out.println("Deposit or Withdraw?");
		String transc=scanner.nextLine();
		switch(transc) {
		case "Deposit":{
					System.out.println("Enter the amount to deposit");
					double amount=scanner.nextDouble();
					acc.deposit(amount);
					break;
		}
		case "Withdraw":{
			System.out.println("Enter the amount to withdraw");
			double amount=scanner.nextDouble();
			acc.withdraw(amount);
			break;
		}
		default: break;
		}
		scanner.close();

	}

}
