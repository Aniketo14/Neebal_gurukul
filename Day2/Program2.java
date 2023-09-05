package AssignmentDay2;

/*Write a Program to accept a co-ordinate point in a XY Co-ordinate system

*/

import java.util.Scanner;
public class Program2 {
	public static void main(String []args) {
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter X  :");
	  int x = sc.nextInt();
	    
	  System.out.println("Enter Y  :");
	  int y = sc.nextInt();
	    
	    if(x==0 && y==0) {
	    	System.out.println("Origin");
	    }
	    if(x==0 && y!=0) {
	    	System.out.println("Y-Axis");
	    }
	    else if(y==0 && x!=0) {
	    	System.out.println("X-Axis");
	    }
	    else if(x>0 && y>0) {
	    	System.out.println("1st Quaderant");
	    }
	    else if(x<0 && y<0) {
	    	System.out.println("3rd Quaderant");
	    }
	    else if(x<0 && y>0) {
	    	System.out.println("2nd Quaderant");
	    }
	    else if(x>0 && y<0){
	    	System.out.println("4th Quadrant");
	    }
	    sc.close();
		}

}
