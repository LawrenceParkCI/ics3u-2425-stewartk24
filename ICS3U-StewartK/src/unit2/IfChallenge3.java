package unit2;
import java.util.Scanner;

/**
 * Description: If challenge 3
 * Date: November 13, 2024
 * @author Kenny Stewart
 */

public class IfChallenge3 {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		String answer, option;
		boolean bonus = true;
		double rights = 0, wrongs = 0, questions = 0;
		int t1 = 1; //500
		int t2 = 1; //1000
		int t3 = 1; //2000
		
		//Variables
		//Option variable is set to the right answer when doing questions to make things easier for me
		//Made Variables for timing so I don't have to keep typing out 1000 each time and can just use a variable
		//Questions variable is for how many questions there are at the end of the program questions is the rights + wrongs, I did this so if I add more questions I dont have to manually change the variable
		//Made them doubles so at the end I can do the percentage calculations
		
		System.out.println("Rules");
		System.out.println("------------------------------------------------------------------------");
		System.out.println("When you're given a multiple choice question you type the letter corresponding to the answer");
		Thread.sleep(t3);
		System.out.println("When given a true or false question, type in either true or false.");
		Thread.sleep(t3);
		System.out.println("If you don't know what a question is, you can type in " + "\"50/50\"" + " to remove 2 wrong ones, but you can only use this once and only on multiple choice questions, or it'll be counted as a wrong answer");
		Thread.sleep(t3);
		
		System.out.println("\nAre you ready to start the quiz? Press <Enter> when you're ready.");
		answer = sc.nextLine();
		System.out.print("Ok, here it comes!");
		
		Thread.sleep(t3);
		
		//Tells the player the rules and they can start once they press enter
		//Added a special thing similar to who wants to be a millionaire, where if they type 50/50, it removes two questions but can only be used once. 
		
		System.out.println("\nQ1) Who thought of the law of disuse and use?");
		
		System.out.format("%-2s %-8s", "", "A) Darwin");
		Thread.sleep(t2);
		System.out.format("\n%-2s %-8s", "", "B) Lyell & Hutton");
		Thread.sleep(t2);
		System.out.format("\n%-2s %-8s", "", "C) Lamarck");
		Thread.sleep(t2);
		System.out.format("\n%-2s %-8s \n\n", "", "D) Kenny");
		
		Thread.sleep(t1);

		option = "C";
		answer = sc.nextLine();
		if (answer.equals("50/50") && bonus == true) {
			bonus = false;
			System.out.println("Questions Removed: A & D");
			System.out.println("\nQ1) Who thought of the law of disuse and use?");
			System.out.format("%-2s %-8s", "", "B) Lyell & Hutton");
			System.out.format("\n%-2s %-8s", "", "C) Lamarck \n\n");
			answer = sc.nextLine();
			if (answer.equalsIgnoreCase(option)) {
				System.out.println("Good job, you got it right, but at the cost of using your 50/50");
				rights = rights + 1;
			} else {
				System.out.println("Oh no, you got it wrong and lost your 50/50");
				wrongs = wrongs + 1;
			}
			
		} else if (answer.equalsIgnoreCase(option)) {
			System.out.println("Good work, you're 1-1!");
			rights = rights + 1;
		} else {
			System.out.println("You got it wrong, but its only one question. You'll get the next one");
			wrongs = wrongs + 1;
		}
		
		System.out.println("Next Question! \n");
		
		System.out.println("Q2) Scientific theories are backed by scientific evidence and are not guesses.");
		
		System.out.format("%-2s %-8s", "", "A) True");
		Thread.sleep(t2);
		System.out.format("\n%-2s %-8s", "", "B) False\n\n");
		
		option = "true";
		answer = sc.nextLine();
		if (answer.equalsIgnoreCase(option)) {
			System.out.println("Nice job. Let'see if you can get the next one though");
			rights = rights + 1;
		} else {
			if (wrongs == 2) {
				System.out.println("Damn. 0-2");
			} else {
				System.out.println("Atleast you got 1 right");
			}
			wrongs = wrongs + 1;
		}
		
		
		
		
		
		System.out.println("\nQ1) What type of selection is elephants being hunted by humans for their tusks?");
		
		System.out.format("%-2s %-8s", "", "A) Natural Selection");
		Thread.sleep(t2);
		System.out.format("\n%-2s %-8s", "", "B) Artifical Selection");
		Thread.sleep(t2);
		System.out.format("\n%-2s %-8s", "", "C) Stabilizing Selection");
		Thread.sleep(t2);
		System.out.format("\n%-2s %-8s \n\n", "", "D) Disruptive Selection");
		
		Thread.sleep(t1);

		option = "B";
		answer = sc.nextLine();
		if (answer.equals("50/50") && bonus == true) {
			bonus = false;
			System.out.println("Questions Removed: A & C");
			System.out.println("\nQ1) What type of selection is elephants being hunted by humans for their tusks?");
			System.out.format("%-2s %-8s", "", "B) Artifical Selection");
			System.out.format("\n%-2s %-8s", "", "C) Stabilizing Selection \n\n");
			answer = sc.nextLine();
			if (answer.equalsIgnoreCase(option)) {
				System.out.println("Good job, you got it right, but at the cost of using your 50/50");
				rights = rights + 1;
			} else {
				System.out.println("Oh no, you got it wrong and lost your 50/50");
				wrongs = wrongs + 1;
			}
			
		} else if (answer.equalsIgnoreCase(option)) {
			System.out.println("Nice job!");
			rights = rights + 1;
		} else {
			if (wrongs == 3) {
				System.out.println("How did you mess up all 3?");
			} else {
				System.out.println("You got it next time.");
			}
			wrongs = wrongs + 1;
		}
		
		questions = wrongs + rights;
		
		System.out.println("\nLets see your score!");
		Thread.sleep(t3);
		System.out.println("You got:");
		Thread.sleep(t1);
		System.out.println((int) wrongs + " Wrongs");
		Thread.sleep(t1);
		System.out.println((int) rights + " Rights");
		Thread.sleep(t1);
		System.out.println("For a percentage of: " + (int) Math.round((rights/questions * 100)) + "%");
		
		//Converts to an int cause I don't want it to show the decimals
		
		
		sc.close();
		

		
	}
}