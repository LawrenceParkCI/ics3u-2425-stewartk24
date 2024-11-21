package unit1;
import java.util.Scanner;

/**
 * Description: If Challenge 1
 * Date: Nov. 11, 2024
 * @author Kenny Stewart
 */

public class IfChallenge {
	public static void main(String[] args) { 
		Scanner in = new Scanner(System.in);
		int favNum;
		int onesDigit;

		System.out.println("What is your favourite number?");
		favNum = in.nextInt();
		onesDigit = favNum % 10;

		if (favNum < 0) {
			System.out.println("You need to look on the bright side of things");
		}
		
		if (favNum % 2 == 0 && favNum % 3 == 0)  {
			System.out.println("You should consider thinking about 6, otherwise you can keep the wholesome");
		}
		else {
			System.out.println("You can keep the wholesome.");
		}
		
		if (onesDigit == 8) {
			System.out.println("You are to full!");
		}
		else if (onesDigit == 9) {
			System.out.println("Canada is a nice country.");
		}
		else {
			System.out.println("Don't count on it.");
		}

		in.close();


	}
}