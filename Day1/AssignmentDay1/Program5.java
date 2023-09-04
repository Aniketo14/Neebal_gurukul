package AssignmentDay1;

import java.io.InputStream;
import java.util.Scanner;

public class Program5 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num1");
		int a = sc.nextInt();
		System.out.println("enter num2");
		int b = sc.nextInt();
		System.out.println("enter num3");
		int c = sc.nextInt();
		
		int d = a>b?a:b;
		int x = c>d?c:d;
		
		
		System.out.println("largest Number :"+x);
		
		sc.close();
	}


}
