package unit2;

/**
Description: For Loop Practice
Date: November 25, 2024
@author Kenny Stewart
*/

public class For {
  public static void main(String[] args) {
    
    /*
    A for loop is also usually considered a counting loop. It typically has three parts.

    //this entire line is called the *header*
    for (int i = 0; i < 10; i++) { 
      <code body>
    }

    (int i = 0) - the initializer: declaring and initializing a variable to help count; the variable is typically called a counter or incrementer;
      -its scope is only within the loop

    (i < 10) - the test expression: determining whether we should repeat the code or not

    (i++) - the increment: at the end of a run through the body of the code, how should the counter change?
      recall - what is the meaning of i++? Can we write it a different way?

    (body) - the code that is to be repeated
    */
    System.out.println("Counting up");
    for (int i = 0; i < 10; i++) {
      System.out.println(i);
    }
    System.out.println("\n");

    System.out.println("Counting from 10 to 20");
    //write the for loop for this
    for (int i = 10; i < 21; i++) {
        System.out.println(i);
      }
    System.out.println("\n");

    System.out.println("Counting from 10 to 0");
    //write the for loop for this
    for (int i = 10; i >= 0; i--) {
        System.out.println(i);
      }
    System.out.println("\n");


    System.out.println("Counting from 10 to 30 by 2s");
    for (int i = 10; i < 31; i+= 2) {
        System.out.println(i);
      }
    //write the for loop for this
    //do it by changing the increment
    System.out.println("\n");

  }
}