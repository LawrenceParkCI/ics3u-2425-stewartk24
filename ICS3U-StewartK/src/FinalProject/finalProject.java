package FinalProject;
/**
* Description:
* Date: December 18, 2024
* @author Kenny Stewart
*/

import hsa_new.Console;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;
public class finalProject {
	static Console c = new Console(50, 150);
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
		
		BufferedImage Connect4Table = null;
		
		try {
			Connect4Table = ImageIO.read(new File("src/pictures/Connect4_Empty.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		c.drawImage(Connect4Table, 275, 200 , 639, 553, c);
		
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
		choice = c.readLine();
		PrintSlow("What mode would you like to play in? Type <Add10> or <Regular>", typeTime, true);
		choice = c.readLine();
		choice = AutoPickTable(modes, choice);
		gameActive = true;
		PrintSlow("Playing in " + choice + " mode", 1, true);
		PrintSlow("Game starting...", 1, true);
		//PrintSlow("It's Reds first move. Type in what row you would you like to place your disk and press <Enter>", 1, true);
		turn = players[(int) (Math.random() * 2)];
		//turn = "Red";
		
		//int pos1 = 1;
		//int pos2 = 6;
		//rowList[pos1][pos2] = "B";
		//rowList[pos1+1][pos2-1] = "B";
		//rowList[pos1+2][pos2-2] = "B";
		//rowList[pos1+3][pos2-3] = "B";
		
		do {
			//randomized messages maybe?
			//make it so it has to be a number typed out
			c.clear();
			c.drawImage(Connect4Table, 275, 200 , 639, 553, c);
			PrintSlow("It's " + turn + "'s move. Type in what row you would like to place your disk and press <Enter>", 1, true);
			rowNum = c.readInt();
			String[][] newRow = DiskPlace(rowList, rowNum, turn);
			//rows = newRow;
			if (turn == "Red") {
				turn = "Blue";
			} else {
				turn = "Red";
			}
			//turn = "Red";
		} while (gameActive == true);
		//rowNum = c.readInt();
		//DiskPlace(rowList, rowNum);
		
		
		
		sc.close();
	}
	
	public static void PrintSlow (String str, int pause, boolean line) throws InterruptedException {
		for (int i = 1; i < str.length() + 1; i++) {
			c.print(str.substring(i - 1, i));
			Thread.sleep(pause);
		}
		if (line == true) {
			c.println();
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
	
	public static String[][] DiskPlace (String[][] rows, int num, String marker) throws InterruptedException {
		//make it so it has "gravity"
		marker = marker.substring(0, 1);
		boolean stopped = false;
		for (int i = 1; i <= 6; i++) {
			if (rows[i][num-1] != " " && stopped == false) {
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
		return rows;
	}
	
	public static void WinCheck (String[][] rows, String marker) throws InterruptedException {
		//wondering how I should go about this
		//i'll make it check vertically first, then horizontally
		//after that, make it detect diagonal wins
		
		//DONT FORGET ROWS ARE HORIZONTAL
		int streak1 = 0;
		int streak2 = 0;
		int streak3 = 0;
		int[] sides = {-1, 1};
		int[] vert = {-1, 1};
		int row = 0;
		int column = 0;
		boolean won = false;
		for (int i2 = 0; i2 < 7; i2++) {
			for (int i = 0; i < 7; i++) {
				if (rows[i][i2].equalsIgnoreCase(marker)) {
					streak1 = streak1 + 1;
					if (streak1 > 3) {
						won = true;
					}
				} else if (streak1 > 0) {
					streak1 = 0;
				}
				//checks if they won vertically^
				
				if (rows[i2][i].equalsIgnoreCase(marker)) {
					streak2 = streak2 + 1;
					if (streak2 > 3) {
						won = true;
					}
				} else if (streak2 > 0) {
					streak2 = 0;
				}
				//checks if they won horizontally^
				
				row = i;
				column = i2;
				streak3 = 0;
				if (rows[row][column].equalsIgnoreCase(marker)) {
					for (int s = 0; s < 2; s++) {
						if (won == false) {
							streak3 = 0;
							int sideDiagonal = -1; // negative is left, positive right
							int upDiagonal = 1; // negative means up, positive is down. // fix this later, make it check every box
							for (int i4 = 0; i4 < 4; i4++) {
								//c.println("ring ring");
								//c.println(rows[row + (i * upDiagonal)][column + (i * sideDiagonal)].equalsIgnoreCase(marker));
								if (row + (i4 * upDiagonal) > -1 && column + (i4 * sideDiagonal) > -1 && row + (i4 * upDiagonal) < 7 && column + (i4 * sideDiagonal) < 7) {
									if (rows[row + (i4 * upDiagonal)][column + (i4 * sideDiagonal)].equalsIgnoreCase(marker)) {
										streak3 = streak3 + 1;
										if (streak3 > 3) {
											won = true;
											c.println("won diagonally. so cool! " + streak3);
										};
									} else if (streak3 > 0) {
										streak3 = 0;
									}
								}
							}
						}
					}
				}
			}
		}
		
		//for diagonal
		//it should get to every single block and check if all the diagonal possibilities of them
		//diagonal DOWN right, down diagonal left
		//diagonal UP right, UP left
		
		if (won == true) {
			c.println("Player has 4 in a row. They win!");
		}
		
		
	}
}
