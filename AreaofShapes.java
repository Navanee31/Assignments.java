package javalearning;
import java.util.Scanner;
public class AreaofShapes {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("   ====Area Of Shapes====");
		System.out.println("1.circle");
		System.out.println("2.triangle");
		System.out.println("3.square");
		System.out.println("enter your choice :");
		int choice=scanner.nextInt();
		if(choice==1) {
			System.out.println("enter the radius if circle :");
			double radius=scanner.nextDouble();
			double area=Math.PI*radius*radius;
			System.out.println("Area of the circle is :"+area);
		}else {
			if(choice==2) {
				System.out.println("enter the base of triangle :");
				int base=scanner.nextInt();
				System.out.println("enter height of triangle :");
				int height=scanner.nextInt();
				double area=(0.5*base*height);
				System.out.println("Area of the triangle is :"+area);
			}else {
				if(choice==3) {
					System.out.println("enter the side of square :");
					int side=scanner.nextInt();
					double area=side*side;
					System.out.println("Area of the square is :"+area);
				}
			}
		}
		
	}

}
