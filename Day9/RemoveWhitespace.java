//REMOVE WHITESPACE :Write a program that takes a sentence as input 
//and removes all the whitespace characters from it. 

package AssignmentDay9;

import java.util.Scanner;

public class RemoveWhitespace {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s = sc.nextLine();
        String x = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                x += s.charAt(i);
            }
        }

        System.out.println("String with whitespaces removed: " + x);
        sc.close();
    }
}

