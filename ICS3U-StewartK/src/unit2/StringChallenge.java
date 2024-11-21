package unit2;
import java.util.Scanner;

/**
 * Description: String Challenge
 * Date: November 12, 2024
 * @author Kenny Stewart
 */

public class StringChallenge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int points = 0;
		String answer = "";
		//Initializing Variables
		
		System.out.println("Who is the best teacher?");
		answer = sc.nextLine();
		if (answer.equalsIgnoreCase("Ms. Kemp")) {
			System.out.println("Correct! 100 points!");	
			points = points + 100;
		}
		else {
			System.out.println("Wrong! minus 100 points!");
			points = points - 100;
		}
		//Asking who the best teacher is
		
		
		if (points < 0) {
			System.out.println("Ok fine, I'll give you another chance. How many points do you have?");
			answer = sc.nextLine();
			if (answer.equals("-100")) {
				System.out.println("Correct! You're back at 0 points.");
				points = 0;
			}
			else {
				System.out.println("Wrong again! Now you have -200 points..");
				points = points - 100;
			}
		}
		else {
			System.out.println("Lets see if you can go 2-2, what class does Ms. Kemp teach?");
			answer = sc.nextLine();
			if (answer.compareTo("Computer Science") == 0) {
				System.out.println("Nice job! You have 200 points now.");
				points = points + 100;
			}
			else {
				System.out.println("Wrong. You're back where you started at 0 points.");
				points = points - 100;
			}
		}
		
		//If person failed the first question they get a chance to get their points back. If they fail they lose another hundred points and if they win they get back to 0 points
		
		sc.close();
		
	}
}