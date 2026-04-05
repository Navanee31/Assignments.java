package javalearning;

import java.util.Scanner;

public class BankAccountCheck {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your Account Balance :");
		int balance=scanner.nextInt();
		if(balance>=1000) {
			System.out.println("Good Standing");
		}else {
			if(balance>=500&&balance<=999) {
			System.out.println("Low Balance");	
			}else {
				System.out.println("Account Overdrawn");
			}
		}

	}

}
