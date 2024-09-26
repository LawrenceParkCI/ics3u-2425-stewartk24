package unit1;
/**
 * Description: This program prints out hello world and hi
 * Date: Sept. 19, 2024
 * @author Kenny Stewart
 */

public class bingo {

	public static void main(String[] args) {
		
		System.out.println("Bingo Card \n");
		
		System.out.println("1. The caller randomly pulls a numbered bingo card. \n");
		
		System.out.println("2. The number is placed on the bingo board and called out. \n");
		
		System.out.println("3. Players look for the called number on their bingo card. \n");
		
		System.out.println("4. If the number is located, it is marked off. \n");
		
		System.out.println("5. Steps 1 to 4 are repeated until a player matches the BINGO pattern. \n");
		
		System.out.println("6. The winning player yells BINGO. \n");
		
		
		System.out.print("B");
		System.out.print("\t");
		System.out.print("I");
		System.out.print("\t");
		System.out.print("N");
		System.out.print("\t");
		System.out.print("G");
		System.out.print("\t");
		System.out.print("O");
		System.out.println("");
		
		int cBMin = 1;
		int cBMax = 15;
		
		int cIMin = 15;
		int cIMax = 30;
		
		int cNMin = 31;
		int cNMax = 45;
		
		int cGMin = 46;
		int cGMax = 60;
		
		int cOMin = 61;
		int cOMax = 75;

		int random_int = (int)Math.floor(Math.random() * (cBMax - cBMin + 1) + cBMin);

		for (int i = 0; i < 2; i++) {
			int CB = (int)Math.floor(Math.random() * (cBMax - cBMin + 1) + cBMin); 
			int CI =(int)Math.floor(Math.random() * (cIMax - cIMin + 1) + cIMin);
			int CN =(int)Math.floor(Math.random() * (cNMax - cNMin + 1) + cNMin);
			int CG =(int)Math.floor(Math.random() * (cGMax - cGMin + 1) + cGMin);
			int CO =(int)Math.floor(Math.random() * (cOMax - cOMin + 1) + cOMin);
			
			System.out.print(CB);
			System.out.print("\t");
			System.out.print(CI);
			System.out.print("\t");
			System.out.print(CN);
			System.out.print("\t");
			System.out.print(CG);
			System.out.print("\t");
			System.out.println(CO);
		}
		
		int CB2 = (int)Math.floor(Math.random() * (cBMax - cBMin + 1) + cBMin); 
		int CI2 =(int)Math.floor(Math.random() * (cIMax - cIMin + 1) + cIMin);
		int CN2 =(int)Math.floor(Math.random() * (cNMax - cNMin + 1) + cNMin);
		int CG2 =(int)Math.floor(Math.random() * (cGMax - cGMin + 1) + cGMin);
		int CO2 =(int)Math.floor(Math.random() * (cOMax - cOMin + 1) + cOMin);
		
		System.out.print(CB2);
		System.out.print("\t");
		System.out.print(CI2);
		System.out.print("\t");
		System.out.print("FREE");
		System.out.print("\t");
		System.out.print(CG2);
		System.out.print("\t");
		System.out.println(CO2);
		
		for (int i = 0; i < 2; i++) {
			int CB = (int)Math.floor(Math.random() * (cBMax - cBMin + 1) + cBMin); 
			int CI =(int)Math.floor(Math.random() * (cIMax - cIMin + 1) + cIMin);
			int CN =(int)Math.floor(Math.random() * (cNMax - cNMin + 1) + cNMin);
			int CG =(int)Math.floor(Math.random() * (cGMax - cGMin + 1) + cGMin);
			int CO =(int)Math.floor(Math.random() * (cOMax - cOMin + 1) + cOMin);
			
			System.out.print(CB);
			System.out.print("\t");
			System.out.print(CI);
			System.out.print("\t");
			System.out.print(CN);
			System.out.print("\t");
			System.out.print(CG);
			System.out.print("\t");
			System.out.println(CO);
		}



	}

}
