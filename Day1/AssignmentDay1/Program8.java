package AssignmentDay1;

import java.util.Scanner;

public class Program8 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name :");
		String name = sc.next();
		
		System.out.println("Units :");
		int units = sc.nextInt();
		int un = units;
		
		double result;
		
		if (units<=100)
		{
			result = units*4;
		}
		if (units<=300)
		{
			result=400;
			units = units-100;
			result = result+units*5;
		}else {
			 result = 1400;
			 units = units-300;
			 result = result+units*10;
		}
		double resultWithSuperCharge = 0.05*result + result;
		double amount = 0.18*resultWithSuperCharge + resultWithSuperCharge;
		
		
		System.out.println("Name :"+name);
		System.out.println("Units :"+un);
		System.out.println("Amount :"+amount);
		
		
	}

}
