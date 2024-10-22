package unit1;

import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class GroceryShopping2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstItem, secondItem;
		double firstCost, secondCost;
		int firstAmount, secondAmount;
		Scanner sc = new Scanner(System.in);
		
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");
		String formattedDate = date.format(dateFormat);
		
		
		System.out.println("|| $$$ \\\\\\ ========== \"Mr. Stewart's Grocery\" ========== /// $$$ ||");
		
		
		
		System.out.println("\nWhat would you like to buy?");
		firstItem = sc.nextLine();
		System.out.println("How much does it cost?");
		firstCost = sc.nextDouble();
		System.out.println("How many are you buying?");
		firstAmount = sc.nextInt();
		
		System.out.println("Good! you are buying " + firstAmount + " " + firstItem + ".");
		System.out.println("========================================================================");
		
		System.out.println("What would you like to buy?");
		secondItem = sc.nextLine();
		secondItem = sc.nextLine();
		System.out.println("How much does it cost?");
		secondCost = sc.nextDouble();
		System.out.println("How many are you buying?");
		secondAmount = sc.nextInt();
		
		System.out.println("Good! you are buying " + secondAmount + " " + secondItem + ".");
		
		System.out.println("\n Here is your reciept! \n\n");
		System.out.println("\t Mr. Lee's Grocery");
		System.out.println(formattedDate + "\n");
		
		//System.out.format("Item %6s %1s %1s", "|  Price  |", " Quant. |", "Total Price");
		
		//make a substring if the item text is too long
		//add a constant
		
		System.out.format("Item %5s %6s %2s %7s %1s %3s", "|", "Price", "|", "Quant.", "|", "Total Price");
		
		System.out.println("\n------------------------------------------");
		System.out.format("%-8s %-1s", firstItem, "|" );
		
		
	}

}
