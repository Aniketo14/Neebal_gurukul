package AssignmentDay1;

import java.util.Scanner;

public class Program3 {
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter any num");
		int num = sc.nextInt();
		
		int years = num/365;
		num= num-365*2;
		int months = num/30;
		num= num-30*9;
		int weeks = num/7;
		num= num-7*2;
		int days = num;
		
		System.out.println(years+"Years :"+months+"Months :"+weeks+"Weeks :"+days+"days");
		
		
		
	}

}
