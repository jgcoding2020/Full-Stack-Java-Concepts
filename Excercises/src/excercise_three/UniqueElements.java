package excercise_three;

import java.util.Scanner;

/**
 * Displays only first time occurences of element from array
 * @author jgard
 */
public class UniqueElements {
	
	/**
	 * Takes user input argument array and displays array without repeating elements
	 * @param input - user entered integer array
	 */
	public void displayUnique(int[] input) {
		int count;
		// outer loop starts from 0 index and sets count to 0
		for (int i = 0; i < input.length; i++) {
			// counts number of times each element is repeated
			count = 0;
			// inner loop decrements to 0 from current index i
			for (int j = i; j >= 0; j-- ) {
				if (input[j] == input[i])
					count++;
			}
			//displays first occurrence of each element in array
			if (count <= 1)
				System.out.println(input[i]);
		}
	}
	
	/**
	 * Takes in user input argument array
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Takes user input for number of integer elements in array
		System.out.println("How many numbers would you like to enter?");
		int num = -1;
		// loop condition ensures a positive number of elements
		while (num < 1) {
			num = sc.nextInt();
			if (num < 0)
				System.out.println("Please enter a number greater than 0.");
		} 
		int[] input = new int[num]; 
		
		System.out.println("Please enter " + num + " numbers one at a time.");
		// User enters integer values into array one at a time
		for (int i = 0; i < num; i++) {
			input[i] = sc.nextInt();
		}
		//Creates class object to call displayUnique()
		UniqueElements obj = new UniqueElements();
		obj.displayUnique(input);
		sc.close();
	} 
}
