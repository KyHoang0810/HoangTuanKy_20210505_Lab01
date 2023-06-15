package lab_week1;
import java.util.Scanner;

public class code6_4 {
	public static void main(String args[]) {
		Scanner lb= new Scanner(System.in);
		
		int monthtype=0;
		while(monthtype==0) {
			System.out.println("Enter the month");
			String inputmonth=lb.nextLine();
		switch (inputmonth) {
		case "1","3","5","7","8","10","12","January","Jan","Jan.","March","Mar","Mar.","May","July","Jul","August","Aug.","Aug","October","Oct","Oct.","December","Dec","Dec.":
			monthtype=1;break;
		case "2","February","Feb","Feb.":
			monthtype=2;break;
		case "4","6","9","11","April","Apr.","Apr","June","Jun","September","Sep.","Sep","November","Nov.","Nov":
			monthtype=3;break;
		default: System.out.println("Error. Please enter again.");
		}
		
	}
	   int year=0;
	   while(year==0) {
		   System.out.println("Enter the year");
		   int inputyear=lb.nextInt();
		   if(inputyear>0) year=inputyear;
		   
		   if(year==0) System.out.println("Error. Please enter again.");
	   }
	   if(monthtype==1) System.out.println("Number of days: 31");
	   else if(monthtype==3) System.out.println("Number of days: 30");
	   else if(monthtype==2) {
		   if(year%4!=0)
			   System.out.println("Number of days: 28");
		   else {
			   if(year%100!=0) System.out.println("Number of days: 29");
			   else {
				   if(year%400==0)System.out.println("Number of days: 29");
				   else System.out.println("Number of days: 28");
			   }
		   }
	   }
	   
	   
	   }

}

