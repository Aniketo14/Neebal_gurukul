package AssignmentDay2;

public class PatternNo4 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==i) 
				{
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
			}
			if(i==1||i==5)
			{
				for(int x=1;x<=8;x++)
				{
					System.out.print(" *");
				}
			}
			else {
				for(int x=1;x<=8;x++)
				{
					System.out.print("  ");
				}
			}
			System.out.print(" *");
			System.out.println();
		}

	}

}
