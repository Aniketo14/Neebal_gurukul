package NeebalGurukulDay1;

import java.util.Scanner;

public class ControlStatements1 {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Year :");
		int num = sc.nextInt();
		
		if( num%4==0 && num%100!=0 || num%400==0) {
			System.out.println("This year is Leap year:");
		}else{
			System.out.println("This year is Not Leap year:");
		}
		sc.close();
	}
}
