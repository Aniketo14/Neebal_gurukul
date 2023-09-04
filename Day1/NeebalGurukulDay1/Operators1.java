package NeebalGurukulDay1;
import java.util.Scanner;

public class Operators1 {
	public static void main(String []args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Any Number :");
		int num = sc.nextInt();
		
		int num1 = num/500;num%=500;
		int a = num1;
				
		int num2 = num/200;num%=200;
		int b = num2;
				
		int num3 = num/100;num%=100;
		int c = num3;
				
		int num4 = num/50;num%=50;
		int d = num4;
				
		int num5 = num/20;num%=20;
		int e = num5;
				
		int num6 = num/10;num%=10;
		int f = num6;
		

		System.out.println("500*"+a+ "=" + 500*a);
		System.out.println("200*"+b+ "=" + 200*b);
		System.out.println("100*"+c+ "=" + 100*c);
		System.out.println("50*"+d+ "=" + 50*d);
		System.out.println("20*"+a+ "=" + 20*e);
		System.out.println("10*"+a+ "=" + 10*f);
		
		sc.close();

		/*int x=7,y=30;
		boolean z = x>y&&y<10||x>5&&y<40;
		System.out.println();
		*/
	}

}
