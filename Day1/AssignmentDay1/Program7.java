package AssignmentDay1;

import java.util.Scanner;

public class Program7 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Time:-");
		int num = sc.nextInt();
		
		int hrs= num/100;
		int min = num%100;
		
		boolean bln=(hrs>12?true:false);
		if(hrs>12) {
			hrs = hrs-12;
		}else {
			hrs=12;
		}
		if(bln==false) {
			System.out.println(hrs+":"+min+"AM");
		}else {
			System.out.println(hrs+":"+min+"PM");
		}
	}
}
