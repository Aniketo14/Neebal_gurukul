
package AssignmentDay4;
 
import java.util.Scanner;
public class ProgramNo5 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Any Array: ");
        int num = scanner.nextInt();

        int[] arr = new int[num];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }

        
        int temp = 0;
        for (int i = 1; i < num; i++) {
            if (arr[i] < arr[temp]) {
                temp = i;
            }
        }

        System.out.println("Index Smallest Array: " + temp);

        scanner.close();
	}

}
