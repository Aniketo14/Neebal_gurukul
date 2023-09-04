package NeebalGurukulDay1;

import java.util.Scanner;

public class Operators2 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num1");
		int a = sc.nextInt();
		System.out.println("enter num2");
		int b = sc.nextInt();
		
		int c = a>b?a/b:b/a;
		System.out.println(c);
		
		sc.close();
	}

}
