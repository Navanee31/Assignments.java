package javalearning;

import java.util.Scanner;

public class AgeGroup {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your Age :");
		int age=scanner.nextInt();
		if(age==12||age<=19) {
			System.out.println("Teenager");
		}else {
			if(age==20||age<=64) {
				System.out.println("Adult");
			}else {
				if(age>=65) {
					System.out.println("Senior");
				}
			}
		}
	}

}
