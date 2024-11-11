package unit1;
import java.util.Scanner;

/**
 * Description:
 * Date:
 * @author 
 */

public class IfChallenge {
	public static void main(String[] args) { 
		Scanner in = new Scanner(System.in);
		int favNum;

		System.out.println("What is your favourite number?");
		favNum = in.nextInt();

		if (favNum < 0) {
			System.out.println("You need to look on the bright side of things");
		}
		
		if (favNum % 2 == 0 && favNum % 3 == 0)  {
			System.out.println("You should consider thinking about 6, otherwise you can keep the wholesome");
		}
		else {
			System.out.println("You can keep the wholesome.");
		}
		
		int onesDigit = favNum % 10;
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
		/*

    (IF)

    ask for the user's favourite number.
    if the number is negative, say that they need to look on
    the bright side.  If their number is odd, say that it's a 
    bit strange.

    (IF, ELSE)

    If their number is divisible by 3 and by 2, 
    say that they should really consider thinking about 6, 
    otherwise say they can keep wholesome.  

    (IF, ELSE IF, ELSE)

    Finally, if the 
    ones digit of the number is 8, say that you too are full, 
    if the ones digit is 9, say Canada is a nice country, 
    and any other number should result in "don't count on 
    it". 
		 */


	}
}