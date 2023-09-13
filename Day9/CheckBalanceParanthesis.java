//CHAECK BALACE PARANTHESIS: Develop a program that checks whether at given string containing parenthesis is balanced or not. 

package AssignmentDay9;

import java.util.Scanner;

public class CheckBalanceParanthesis {
		
	
	

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter String :");
			String n=sc.nextLine();
			int count=0;
			boolean temp=true;
			for(int i=0;i<n.length();i++)
			{
				if(n.charAt(i)=='(')
				{
					count++;
				}
				else
				{
					count--;
					if(count<0)
					{
						temp=false;
						break;
					}
				}
			}
			if(count!=0)temp=false;
			if(temp)
			{
				System.out.println("True");
			}
			else
			{
				System.out.println("False");
			}
			sc.close();

		}

	}

