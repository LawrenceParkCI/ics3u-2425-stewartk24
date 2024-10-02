package unit1;
import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int length, width, depth;
		
		System.out.println("AREA PROGRAM");
		System.out.print("Type in the length of the rectangle and <Enter>");
		length = sc.nextInt();
		
		System.out.print("Type in the width of the rectangle and <Enter>");
		width = sc.nextInt();
		
		System.out.print("Type in the depth of the rectangle and <Enter>");
		depth = sc.nextInt();
		
		int area = length * width * depth;
		
		System.out.print("The area of your prism is " + area);
		sc.close();
		
	}

}
