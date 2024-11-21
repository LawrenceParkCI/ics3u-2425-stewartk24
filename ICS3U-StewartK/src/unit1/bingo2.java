package unit1;
/**
 * Description: This program makes a bingo game
 * Date: Sept. 27, 2024
 * @author Kenny Stewart
 */

public class bingo2 {
	/**
	 * Program for bingo game
	 * @param args unused
	 */


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bingo Card \n");
		
		System.out.println("1. The caller randomly pulls a numbered bingo card. \n");
		
		System.out.println("2. The number is placed on the bingo board and called out. \n");
		
		System.out.println("3. Players look for the called number on their bingo card. \n");
		
		System.out.println("4. If the number is located, it is marked off. \n");
		
		System.out.println("5. Steps 1 to 4 are repeated until a player matches the BINGO pattern. \n");
		
		System.out.println("6. The winning player yells BINGO. \n");
		
		System.out.format("B %8s %8s %8s %8s", "I", "N", "G", "O");
		
		System.out.format("\n2 %8s %8s %8s %8s", "20", "42", "60", "64");
		
		System.out.format("\n14 %7s %8s %8s %8s", "25", "32", "55", "70");
		
		System.out.format("\n5 %8s %9s %7s %8s", "18", "FREE", "53", "67");
		
		System.out.format("\n12 %7s %8s %8s %8s", "16", "31", "46", "75");
		
		System.out.format("\n10 %7s %8s %8s %8s", "22", "39", "59", "71");
	}

}
