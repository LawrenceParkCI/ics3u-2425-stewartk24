package FinalProject;
/**
* Description:
* Date: December 18, 2024
* @author Kenny Stewart
*/

import java.util.Scanner;

public class finalProject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//add comments to this
		//6x7 at start
		//rows are horizontal
		String choice;
		String [] modes = {"Add10", "Regular"};
		Scanner sc = new Scanner(System.in);
		int typeTime = 1; //regular is 25
		
		String[] row1 = new String[7];
		String[] row2 = new String[7];
		String[] row3 = new String[7];
		String[] row4 = new String[7];
		String[] row5 = new String[7];
		String[] row6 = new String[7];
		String[] row7 = new String[7];
		
		//making variables for each row
		
		String [][] rowList = {
				row1,
				row2,
				row3,
				row4,
				row5,
				row6,
				row7,
		};	
		
		for (int i = 0; i < 7; i++) { 
			for (int i2 = 0; i2 < 7; i2++) {
				rowList[i][i2] = " ";
			}
		}
		
		PrintSlow("Welcome to Connect4! Press <Enter> to start.", typeTime, false);
		choice = sc.nextLine();
		PrintSlow("What mode would you like to play in? Type <Add10> or <Regular>", typeTime, true);
		choice = sc.nextLine();
		choice = AutoPickTable(modes, choice);
		PrintSlow("Game starting...", 1, true);
		RowsCreate(rowList);
		
		
		
		sc.close();
	}
	
	public static void PrintSlow (String str, int pause, boolean line) throws InterruptedException {
		for (int i = 1; i < str.length() + 1; i++) { 
			System.out.print(str.substring(i - 1, i));
			Thread.sleep(pause);

		}
		if (line == true) {
			System.out.println();
		}
	};
	
	public static String AutoPickTable (String[] list, String choice) throws InterruptedException {
		//make it do a for loop and check the list if anything equals choice
		int length = list.length;
		String newChoice = choice;
		boolean pass = false;
		for (int i = 1; i < length; i++) { 
			if (choice.equalsIgnoreCase(list[i])) {
				System.out.println("equals the same");
				pass = true;
			}
		};
		if (pass == false) {
			int newPick = (int) ((Math.random() * length));
			newChoice = list[newPick];
		}
		return newChoice;
	};
	
	public static void RowsCreate (String[][] rows) throws InterruptedException {
		//make this set up a table depending on row info
		//make them horizontally
		for (int i = 1; i < rows.length; i++) {
			String Pos1 = rows[i][0];
			String Pos2 = rows[i][1];
			String Pos3 = rows[i][2];
			String Pos4 = rows[i][3];
			String Pos5 = rows[i][4];
			String Pos6 = rows[i][5];
			String Pos7 = rows[i][6];
			System.out.format("\n%-1s %-1s %-1s %-1s %-1s %-1s %-1s %-1s %-1s %-1s %-1s %-1s %-1s %-1s %-1s", "|", Pos1, "|", Pos2, "|", Pos3, "|", Pos4, "|", Pos5, "|", Pos6, "|", Pos7, "|");
		}
		System.out.println("\n-----------------------------");
		
	};
	
	

}
