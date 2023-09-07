package AssignmentDay4;

public class ProgramNo6 {

	public static void main(String[] args) {
		
	        int[] profit = {12, 18, 20, 38, 53, 93, 77, 61, 59, 56};
	        int num = -1;  

	        for (int year = 1; year < profit.length; year++) {
	            if (profit[year] <= profit[year - 1]) {
	                num = year;
	                break;
	            }
	        }

	        if (num != -1) {
	            System.out.println("Decline profit bigan year :" + (2001 + num));
	        } 
	        else
	        {
	        	System.out.println("No Decline year :");
	        }
	    
	
	}
}

