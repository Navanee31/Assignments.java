package javalearning;
import java.util.Scanner;
public class Schoolmanagement {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("========Student Marks Info======");
		System.out.println("enter maths marks :");
		int maths=scanner.nextInt();
		System.out.println("enter science marks :");
		int science=scanner.nextInt();
		System.out.println("enter hindi marks :");
		int hindi=scanner.nextInt();
		int total=maths+science+hindi;
		System.out.println("Total marks ==>"+total);
		if(total<0||total>300) {
			System.out.println("ERROR:: Entered wrong marks");
			return;
		}
		float avg=(maths+science+hindi)/3;
		System.out.println("Average = "+avg);
	    if(avg>=90) {
	    	System.out.println("Grade A");
	    } else {
	    	if(avg>=80) {
	    		System.out.println("Grade B");
	    	}else {
	    		if(avg>=70) {
	    			System.out.println("Grade C");
	    		}else {
	    			if(avg>=50) {
	    				System.out.println("Grade D");
	    			}else {
	    				System.out.println("Your avg is less than 50");
	    				System.out.println("FAIL");
	    			}
	    		}
	    	}
	    }
	}

}
