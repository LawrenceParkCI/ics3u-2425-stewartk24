package unit2;

/**

https://www.geeksforgeeks.org/java-math-random-method-examples/

Description: Math.random testing
Date: November 28, 2024
@author: Kenny Stewart
*/


public class Randomness {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.println(Math.random());
    }

    //Run the program a few times. What do you think is the 
    //range of the numbers generated?
    //0 to 0.9

    //Read the demo program. Write the code so that the program 
    //will produce a random number between 100 and 1000.
    
    for (int i = 0; i < 10; i++) {
        System.out.println((Math.random() * 901) + 100);
      }
    
  }
}