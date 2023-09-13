//COUNT WORDS: Write a program that counts the number of words in a given sentence.

package AssignmentDay9;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
	    String s = sc.nextLine();
	       
	    String x = "";
	    String a[]=s.split(s);
	        
	    int count=1; 
	       for(int i=1;i<s.length();i++) {  
	             if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
	             {
	            	 count++;
	             }
	          }
	       	  System.out.println(count);
	       	  sc.close();
	}
	
}  
 	
 	

