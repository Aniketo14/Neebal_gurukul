package AssignmentDay4;

public class ProgramNo2 {
	public static void main(String [] args) {
		int[] num = {1,1,1,0,1,1,1,1,1,1,0,0,1,1,1,0,1,1,1,0,1};
		int total = num.length;
		int temp=0;
		for (int x=0 ;x<num.length;x++) {
			if(num[x]==1) {
				temp+=num[x];
			}
		}
		double percentage=(double)temp/num.length*100;
		
		System.out.println("Total :"+total);
		System.out.println(+temp);
		System.out.println("Attendence Percentage:"+percentage);
	}
}
