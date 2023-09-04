package AssignmentDay1;

import java.util.Scanner;

public class Program4 {
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the tourist");
		int num = sc.nextInt();
		
		int buses = num/50;
		int tourist = buses*50;
	
		System.out.println("No of Peoples Traveling :"+tourist);
		
	}

}
