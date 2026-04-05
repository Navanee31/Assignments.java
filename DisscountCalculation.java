package javalearning;

import java.util.Scanner;

public class DisscountCalculation {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your total bill :");
		int bill=scanner.nextInt();
		int totalBill=0;
		if(bill>=1000) {
			totalBill=bill-(bill*20)/100;
			System.out.println("your total bill with 20% disscount is:" +totalBill);
		}else {
			if(bill>500&&bill<=999) {
				totalBill=bill-(bill*10)/100;
				System.out.println("your total bill with 10% disscount is:" +totalBill);
			}else {
				System.out.println("Make 500 or above to avail the disscount  ");
			}
		}

	}

}
