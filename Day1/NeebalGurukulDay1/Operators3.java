package NeebalGurukulDay1;

import java.util.Scanner;

public class Operators3 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num1");
		int a = sc.nextInt();
		System.out.println("enter num1");
		int b = sc.nextInt();
		System.out.println("enter num1");
		int c = sc.nextInt();
		
		int d = a>b?a:b;
		int x = c>d?c:d;
		
		
		System.out.println(x);
		
		sc.close();
	}

}
