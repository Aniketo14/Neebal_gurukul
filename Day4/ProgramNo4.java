package AssignmentDay4;

public class ProgramNo4 {
	public static void main(String[] args) {
        int[] xy = {850, 945, 1145, 1155, 1230, 1245, 1330, 1340, 1425, 1445};

        int totalTime = 0;

       
        for (int i = 0; i < xy.length; i += 2) {
            int onTime = xy[i];
            int offTime = xy[i + 1];
            
            int onHours = onTime / 100;
            int onMinutes = onTime % 100;
            
            int offHours = offTime / 100;
            int offMinutes = offTime % 100;
            
            int passHours = offHours - onHours;
            int passMinutes = offMinutes - onMinutes;

            totalTime += (passHours * 60 + passMinutes);
        }

        int hours = totalTime / 60;
        int minutes = totalTime % 60;

        System.out.println("Running Time: " + hours );
        System.out.println(" hr " + minutes + " min");
    }
   
}
