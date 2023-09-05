package AssignmentDay2;

import java.util.Scanner;

public class Program4 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int x=0,y=1,z=0;
		int temp=0;
		
		System.out.println("Even 10 Numbers:");
		for(;temp<10;) 
		{
		 z=x+y;
		 x=y;
		 y=z;
		 	if(z%2==0) {
		    System.out.println(z+" ");
		    temp++;
		 	}
		}
		sc.close();
	
	}
}
