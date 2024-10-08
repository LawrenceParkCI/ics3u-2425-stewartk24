package unit1;
import java.util.Scanner;
/**
 * Description: This program manipulates strings
 * Date: Oct. 8, 2024
 * @author Kenny Stewart
 */
public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s;
		
		System.out.println("Type in a sentence, and press <Enter>");
		s = sc.nextLine();
		System.out.println("This is the string normally");
		System.out.println(s);
		System.out.println("This is the string in all uppercase letters");
		System.out.println((s.toUpperCase()));
		System.out.println("This is the string in all lowercase letters");
		System.out.println(s.toLowerCase());
		System.out.println("This is the length of the string");
		System.out.println(s.length());
		System.out.println("This is character at index 5");
		System.out.println(s.charAt(5));
		
		System.out.println("This is the first word of the string");
		System.out.println(s.substring(0, s.indexOf(" ")));
		
		System.out.println("This is the last word of the string");
		System.out.println(s.substring(s.lastIndexOf(" ") + 1, s.length()));
		
	}

}
