package NeebalGurukulDay1;

import java.util.Scanner;


public class ScannerClass {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First Num :");
		int  b = sc.nextInt();
		
		System.out.println("Enter the Second Num :12");
		int h = sc.nextInt();
		
		double Hypo = Math.sqrt(Math.pow(b,2))+(Math.pow(h,2));
		
		System.out.println("Third Side Of Triangle Is :" + Hypo);
		
		sc.close();
		
	}

}
