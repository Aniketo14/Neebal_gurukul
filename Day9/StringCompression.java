//STRING COMPRESSION: Implement a program that compresses a string by replacing consecutive repeated
//characters with a single occurrence and count.

package AssignmentDay9;

import java.util.Scanner;

public class StringCompression {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s = sc.nextLine();
        
        // Initialize the result as the first character
        String compressed = s.substring(0,1);
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            char previousChar = s.charAt(i - 1);

            if (currentChar == previousChar) {
                count++;
            } else {
                if (count > 1) {
                    compressed += count; 
                }
                compressed += currentChar; 
                count = 1; 
            }
        }

        if (count > 1) {
            compressed += count;
        }

        System.out.println("Compressed String: " + compressed);
        sc.close();
    }
}
