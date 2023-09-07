package AssignmentDay4;

import java.util.Scanner;

public class ProgramNo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Any Array:");
		int num = sc.nextInt();
		
		int a[]= new int [num];
		
		for(int i = 0;i<num;i++) 
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Print The Reverse Array");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+"  ");
			
		}
		
	}

}
