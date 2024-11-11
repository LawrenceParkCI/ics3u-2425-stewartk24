package unit1;
import java.util.Scanner;

/**
 * Description: If Challenge 2
 * Date: Nov. 11, 2024
 * @author Kenny Stewart
*/

public class IfChallenge2 {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num1, num2, num3;
	
	System.out.println("Type in numbers on the next three lines.");
	num1 = sc.nextInt();
	num2 = sc.nextInt();
	num3 = sc.nextInt();
	
	if (num1 < num2 && num2 < num3 && num1 < num3) {
		System.out.println(num1 + " " + num2 + " " + num3 + " are strictly in order.");
	}
	else {
		System.out.println(num1 + " " + num2 + " " + num3 + " are not in order.");
	}

    /*Create a program that asks for three numbers.
    Tell the user if the numbers are strictly in order.
    ie.  2 5 11 or 5 6 7 are strictly in order.
    ie.  6 5 7 or 5 5 7 are not
    */
  }
}