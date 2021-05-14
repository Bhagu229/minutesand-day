package minutesandday;

import java.util.Scanner;

    public class yearday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     double minutesInyear = 60*24*365;
     Scanner input = new Scanner(System.in);
     System.out.println("input the number of minutes:");
     double min = input.nextDouble();
     long year =(long)(min/minutesInyear);
     int days =(int)(min/60/24)%365;
     System.out.println((int)min + "minutes is approximately" + "years & " + days + "days");
	}
	
}