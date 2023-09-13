package AssignmentDay9;


import java.util.*;

public class ReplaceCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Create a Scanner object to read user input
		        Scanner sc = new Scanner(System.in);
		        
		        // Prompt the user to enter the original string
		        System.out.print("Enter the original string: ");
		        String originalString = sc.nextLine();
		        
		        char targetChar = 'o';
		       
		        char replacementChar = 'x';
		        
		        // Replace 'o' with 'x' in the string
		        String modifiedString = originalString.replace(targetChar, replacementChar);
		        
		        // Print the modified string
		        System.out.println("Modified string: " + modifiedString);
		        
		        // Close the scanner
		        sc.close();
		    }
	}

	


