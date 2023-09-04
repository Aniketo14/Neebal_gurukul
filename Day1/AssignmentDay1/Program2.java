package AssignmentDay1;

import java.util.Scanner;

public class Program2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 4 Digit Number:");
		int num = sc.nextInt();
		
		int num1 = num%100;
		int num2 = num/100;
		
		int swap = num1*100+num2;
		
		System.out.println(swap);
		
		sc.close();
	}
	

}
