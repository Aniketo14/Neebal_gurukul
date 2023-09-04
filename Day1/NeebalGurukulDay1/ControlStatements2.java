package NeebalGurukulDay1;

import java.util.Scanner;

public class ControlStatements2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Salary:");
		int sal = sc.nextInt();
		
		
		int deduct = 0;
		int netpay = 0;
		
		
		if(sal>1500000) {
			deduct = (sal*25)/100;
			netpay = (sal-deduct);
			
		}else if(sal>=1000000) {
			deduct = (sal*20)/100;
			netpay = (sal-deduct);
			
		}else if(sal>=750000) {
			deduct = (sal*10)/100;
			netpay = (sal-deduct);
			
		}else {
			deduct=0;
			netpay=0;
		}
		System.out.println("Salary: "+sal);
		System.out.println("Tax Deduction: "+deduct);
		System.out.println("In Hand Salary"+netpay);
	}

}
