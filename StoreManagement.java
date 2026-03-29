package javalearning;
import java.util.Scanner;
public class StoreManagement {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("    =====YOUR BILL======");
		System.out.println("Enter the Price :");
		double price=scanner.nextDouble();
		System.out.println("Enter the Quantity :");
		int quantity=scanner.nextInt();
		double totalbill=(price*quantity);
		System.out.println("TOTAL BILL = "+totalbill);
		}

}
