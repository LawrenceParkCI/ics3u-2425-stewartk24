package unit1;
import java.util.Scanner;

public class Alive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int year;
		int month;
		int day;
		
		int currentYear;
		int currentMonth;
		int currentDay;
		
		int daysAlive;
		int hoursSlept;
		
		System.out.println("In each question, answer in number form, and press <Enter>");
		System.out.println("Type in the year, month, and day you were born");
		System.out.print("Year: ");
		year=sc.nextInt();
		System.out.print("Month: ");
		month=sc.nextInt();
		System.out.print("Day: ");
		day=sc.nextInt();
		
		System.out.println("Now, type in the current year, month, and day, by pressing <Enter>");
		System.out.print("Year: ");
		currentYear=sc.nextInt();
		System.out.print("Month: ");
		currentMonth=sc.nextInt();
		System.out.print("Day: ");
		currentDay=sc.nextInt();
		
		daysAlive = 365 * (currentYear-year) + 30 * (currentMonth-month) + (currentDay-day);
		hoursSlept = daysAlive*8;
		
		System.out.println("You have been alive for " + daysAlive + " days");
		System.out.println("You have slept for " + hoursSlept + " hours");
		sc.close();
	}

}
