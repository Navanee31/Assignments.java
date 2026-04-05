package javalearning;

import java.util.Scanner;

public class Positivenumbersornot {

	public static void main(String[] args) {
	  Scanner scanner=new Scanner(System.in);
	  System.out.println("Enter a number to check wether its a positive,negative");
	  int num=scanner.nextInt();
	  int zero=0;
	  if(num==zero) {
		  System.out.println("its 0");
	  }else {
		  if(num<0) {
			  System.out.println(+num +" is a negative number");
		  }else {
			  System.out.println(+num +" is a positive number");
		  }
 	  }

	}

}
