/* Name: Elysé Ntigirishari         
 * Student ID: 040924425          
 * Course & Section: CST8132 301   
 * Assignment: Lab 2  
 * Date: Jan 22, 2019     
 */

//Program that computes the product of elements of an array
import java.text.DecimalFormat;

public class ExerciseOne {

	private int[] myArray; // declare an array of integers

	public ExerciseOne() {
		myArray = new int[10]; // create myArray of ten integers
		for (int i = 0; i < 10; i++) { // initialize myArrays
			myArray[i] = i + 1;
		}
	}

	// print out the values of the elements of myArray
	public void printArrayValues() {
		System.out.print("myArray = {");
		for (int i = 0; i < 9; i++) { // display the elements of myArray
			System.out.print(myArray[i] + ",");
			if (myArray[i] == 9)
				System.out.println(myArray[9] + "};");
		}

	}

	// compute and display the product of the elements of myArray
	public void displayArrayProduct() {
		DecimalFormat df = new DecimalFormat("#,###");
		int product = 1;
		for (int myInt : myArray) { // compute the product of the elements of myArray
			product *= myInt;
		}

		// display the sentence stating the product
		System.out.println("The product of all elements of myArray is " + df.format(product) + ".");

	}

}
