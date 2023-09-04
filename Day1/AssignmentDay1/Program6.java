package AssignmentDay1;

import java.util.Scanner;

public class Program6 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 Digit Number :");
		int number = sc.nextInt();
		int num=number;
		int sum = 0;
		
		int x = num%10;
		int a = (int)Math.pow(x, 3);
		num = num/10;
		int y = num%10;
		int b = (int)Math.pow(y, 3);
		num = num/10;
		int z = num%10;
		int c = (int)Math.pow(z, 3);
		
		sum = (a+b+c);
		if(number==sum)
			System.out.println("This Number Is An ArmStrong Number");
		else 
			System.out.println("This Number Is-Not An ArmStrong Number");
		}
	}

