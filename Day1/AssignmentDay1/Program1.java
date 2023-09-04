package AssignmentDay1;

import java.util.Scanner;

public class Program1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Time In Miliseconds");
		int num = sc.nextInt();
		
		int hrs = num/3600000; 
			num-=3600000*hrs;
		int min = num/60000;
	    num-=60000*min;
		int sec = num/1000;
		
		System.out.println("Time : "+ hrs +":"+ min +":"+ sec);
		
		sc.close();
		
	}

}
