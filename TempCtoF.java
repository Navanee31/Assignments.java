package javalearning;
import java.util.Scanner;
public class TempCtoF {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter temperature in CELSIUS");
		double celsius=scanner.nextDouble();
		double fahrenheit=(celsius * 9 / 5 + 32);
		System.out.println("Temp in celsius to fahrenhiet is :"+fahrenheit);		
		}

}
