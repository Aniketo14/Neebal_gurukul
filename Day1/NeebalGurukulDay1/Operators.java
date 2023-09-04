package NeebalGurukulDay1;

import java.util.Scanner;

public class Operators {
	public static void main(String [] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Three Digit Num :");
		int  num = sc.nextInt();
		
		
		
		int num1  = num/100;
		int num2 = (num%100)/10;
		int num3 = num%10;
		
		
		int sumOfdigit = num1+num2+num3;
		int reverse = num3*100 + num2*10 + num3;
		int sum = sumOfdigit + reverse ;
		
		
		System.out.println("Sum Of The Digits Is :" + sumOfdigit);
		System.out.println("Reverse The Digits :" + reverse);
		System.out.println("Sum(Num+Rev) :" + sum);
		
		sc.close();
		
	}

}
