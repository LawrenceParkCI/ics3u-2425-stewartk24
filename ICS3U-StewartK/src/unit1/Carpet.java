package unit1;
import java.util.Scanner;
/**
 * Description: This program calculates the carpet cost
 * Date: Sept. 26, 2024
 * @author Kenny Stewart
 */

public class Carpet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double carpetCost;
		double roomLength;
		double roomWidth;
		
		System.out.println("After each question, only answer using numbers, you can also use decimals. Then press <Enter>");
		
		System.out.println("What is the length of your room in meters?");
		roomLength = sc.nextDouble();
		
		System.out.println("What is the width of your room in meters?");
		roomWidth = sc.nextDouble();
		
		System.out.println("How much does the carpet cost per square meter?");
		carpetCost = sc.nextDouble();
		
		double finalCost = roomWidth*roomLength*carpetCost;
		System.out.println("The cost to cover your room in carpet will be $" + finalCost);
		
		
	}

}
