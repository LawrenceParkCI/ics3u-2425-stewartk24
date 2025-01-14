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
		String turn;
		String [] modes = {"Add10", "Regular"};
		String [] players = {"Red", "Blue"};
		Scanner sc = new Scanner(System.in);
		int typeTime = 1; //regular is 25
		int rowNum;
		boolean gameActive = false;
		
		//add more commenting
		
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
		gameActive = true;
		PrintSlow("Playing in " + choice + " mode", 1, true);
		PrintSlow("Game starting...", 1, true);
		//PrintSlow("It's Reds first move. Type in what row you would you like to place your disk and press <Enter>", 1, true);
		turn = players[(int) (Math.random() * 2)];
		turn = "Red";
		do {
			//randomized messages maybe?
			//make it so it has to be a number typed out
			PrintSlow("It's " + turn + "'s move. Type in what row you would like to place your disk and press <Enter>", 1, true);
			rowNum = sc.nextInt();
			DiskPlace(rowList, rowNum, turn);
			if (turn == "Red") {
				turn = "Blue";
			} else {
				turn = "Red";
			}
			turn = "Red";
		} while (gameActive == true);
		//rowNum = sc.nextInt();
		//DiskPlace(rowList, rowNum);
		
		
		
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
	
	public static void DiskPlace (String[][] rows, int num, String marker) throws InterruptedException {
		//make it so it has "gravity
		marker = marker.substring(0, 1);
		boolean stopped = false;
		for (int i = 1; i <= 6; i++) {
			if (rows[i][num-1] != " ") {
				rows[i-1][num-1] = marker;
				stopped = true;
			}
		}
		if (stopped == false) {
			rows[6][num-1] = marker;
		}
		RowsCreate(rows);
		Thread.sleep(100);
		WinCheck(rows, marker);
	}
	
	public static void WinCheck (String[][] rows, String marker) throws InterruptedException {
		//wondering how I should go about this
		//i'll make it check vertically first, then horizontally
		//after that, make it detect diagonal wins
		
		//DONT FORGET ROWS ARE HORIZONTAL
		int streak = 0;
		for (int i = 0; i < 7; i++) { 
			System.out.println(i);
			if (rows[i][0] == marker) {
				streak = streak + 1;
				//System.out.println(streak);
			} else if (i != 6) {
				streak = 0;
			}
			Thread.sleep(200);
		}
		System.out.println("streak at end: " + streak);
		
	}

}
