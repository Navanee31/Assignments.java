package javalearning;

import java.util.Scanner;

public class ElectricityBillCalculator {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of units consumed :");
		int units=scanner.nextInt();
		if(units<=0) {
			System.out.println("INVALID....Enter valid units");
		}else {
			if(units<=100) {
				System.out.println("your bill : rs 1.50");
			}else {
				if(units<=200) {
					System.out.println("your bill : rs 2.00");
				}else {
					if(units<=300) {
						System.out.println("your bill : rs 3.00");
					}else {
						System.out.println("your bill : rs 5.00");
					}
				}
			}
		}
	}

}
