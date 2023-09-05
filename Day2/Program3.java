package AssignmentDay2;

import java.util.Scanner;

public class Program3 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Lower number  :");
		int low = sc.nextInt();
		
		System.out.println("Enter the Upper number  :");
		int up = sc.nextInt();
		
		boolean temp=true;
		int x=0,y=1,z;
		if(low==x) {
			System.out.println(x);
		}else if (low<=y) {
			System.out.println(y);
			
		}
		while(temp) {
			z=x+y;
			x=y;
			y=z;
			if((low<=z) && (up>z)){
				System.out.println(z);
			}else if(up<z) {
				temp=false;
			}
	    }sc.close();
			
	}
	
}
	
