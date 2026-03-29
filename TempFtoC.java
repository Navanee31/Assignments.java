package javalearning;
import java.util.Scanner;
public class TempFtoC {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	 System.out.println("Enter temprature in FAHRENHEIT");
	 double fahrenheit=scanner.nextDouble();
	 double celsius=((fahrenheit - 32) * 5 / 9);
	 System.out.println("temp in fahrenheit to celsius is :"+celsius);
	}
}
