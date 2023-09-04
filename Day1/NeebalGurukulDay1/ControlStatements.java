package NeebalGurukulDay1;

import java.util.Scanner;

public class ControlStatements {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Salary");
		int sal = sc.nextInt();
		
		if (sal<10000) {
			sal = sal+5000;
			
		}
		System.out.println("Salary:"+sal);
	sc.close();	
	}

}
