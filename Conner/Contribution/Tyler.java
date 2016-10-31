// Declaring package name.
package practice;

// Importing necessary utilities for this program.
import java.util.*;

public class practice {
	
	// Pre-Defining necessary variables.
	static int[] integers;

		public static void main(String[] args) {
			
			// Asking the user for 10 integers.
			System.out.println("Enter ten integers: ");
			
			// Calling method that gathers user input for integers.
			combo(integers);
			
		}

		// This method gathers user input.
		public static int combo(int[]array){
			
			// Gathers 10 integers from the user and puts them into an array. (integers).
			integers = new int[10];
			Scanner input = new Scanner(System.in);
			for (int i = 0; i < 10; i++){
				integers[i] = input.nextInt();
			}
			input.close();
			// Informing the user of all possible combinations of the provided numbers.
			System.out.println("All combinations of picking two numbers from the list are: ");
			
			// Calling method to calculate combinations of provded numbers.
			comboGen();
			
			// Satisfying required return type.
			return 0;
		}
	
		// This method calculates all possible combinations of the provided numbers.
		public static int comboGen() {
			
			// first number is the ten ints.
			// second number is the ten ints, for each of the first ten ints.
			
			for (int i = 0; i < 10; i++){
				for (int j = 0; j < 10; j++){
					System.out.print(integers[i] + " and " + integers[j] + ", ");
				}
				System.out.println();
			}
			
			// Satisfying required return type.
			return 0;
		}
	}