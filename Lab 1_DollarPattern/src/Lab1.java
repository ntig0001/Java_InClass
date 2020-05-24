/* Name: Elysé Ntigirishari         
 * Student ID: 040924425          
 * Course & Section: CST8132 301   
 * Assignment: Lab 1  
 * Date: Jan 09, 2019     
 */

/*This is a program which displays different patterns of the dollar sign ($). 
The patterns are created by rearranging the character-displaying for loops.*/

public class Lab1 {

	public static void main(String[] args) { // creates the different triangle-shaped patterns

		int width = 5; // determines the width of the characters

		// first triangle
		for (int i = 1; i <= width; i++) { // loops to display the signs ($) forming the triangle

			for (int k = width; k > i; k--) { // loops to create the empty spaces
				System.out.print(" ");
			}

			for (int k = 0; k < i; k++) { // loops to create the signs
				System.out.print("$");
			}
			System.out.println(); // shapes the $ characters as a triangle
		}

		// second triangle
		for (int i = 0; i <= width; i++) {

			for (int k = 0; k < i; k++) {
				System.out.print("$");
			}

			for (int k = width; k > i; k--) {
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println(); // creates an empty space between the second and the third

		// third triangle
		for (int i = 0; i <= width; i++) {

			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}

			for (int k = width; k > i; k--) {
				System.out.print("$");
			}
			System.out.println();
		}

		// fourth triangle
		for (int i = 1; i <= width; i++) {

			for (int k = 0; k <= width - i; k++) {
				System.out.print("$");
			}
			System.out.println();
		}

	}

}
