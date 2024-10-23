package unit1;

import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.text.NumberFormat;

public class GroceryShopping2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberFormat money = NumberFormat.getCurrencyInstance();
		String firstItem, secondItem;
		double firstCost, secondCost;
		double firstTotal, secondTotal;
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
		
		firstItem = firstItem + "         ";
		secondItem = secondItem + "         ";
		
		//adding spaces to the string so the substring check doesn't error
		
		System.out.println(firstItem);
		
		System.out.println("\n Here is your reciept! \n\n");
		System.out.println("\t Mr. Lee's Grocery");
		System.out.println(formattedDate + "\n");
		
		firstTotal = firstCost * firstAmount;
		secondTotal = secondCost * secondAmount;
		
		final double tax = (firstTotal + secondTotal) * 0.13;
		final double realTotal = (firstTotal + secondTotal) + tax;
		
		System.out.format("Item %5s %6s %2s %7s %1s %3s", "|", "Price", "|", "Quant.", "|", "Total Price");
		
		System.out.println("\n------------------------------------------");
		System.out.format("%-8s %-1s %-7s %-2s %-6s %-2s %-3s", firstItem.substring(0, 9), "|",  " $" + firstCost, "|", firstAmount, "|", "$" + money.format(firstTotal).substring(1));
		System.out.format("\n%-8s %-1s %-7s %-2s %-6s %-2s %-3s", secondItem.substring(0, 9), "|",  " $" + secondCost, "|", secondAmount, "|", "$" + money.format(secondTotal).substring(1));
		System.out.println("\n------------------------------------------");
		System.out.format("%-19s %-8s %-3s", "", "Subtotal: $", (firstTotal + secondTotal));
		System.out.format("\n%-24s %-4s %-3s", "", "Tax: $", money.format(tax).substring(1));
		System.out.format("\n%-22s %-4s %-3s", "", "Total: $", money.format(realTotal).substring(1));
		
		System.out.println("\n\nThis is approximately $" + (int) realTotal);
		
		System.out.println("\nHave a good day!");
		System.out.println("Thank you for shopping at Mr. Stewart's Grocery! We hope to see you again!");
		
		
	}

}
