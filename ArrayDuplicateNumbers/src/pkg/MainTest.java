package pkg;

import java.util.Scanner;

/*
 * MainTest class program that finds duplicate number in user input array
 * @author Joshua Gardner
 */
public class MainTest {

	/*
	 * getUserArray method takes input for user created array of numbers
	 * @param none
	 * @return nothing
	 */
	public void getUserArray() {
		
		Scanner sc = new Scanner(System.in);
		// set array element count chosen by user
		System.out.println("How many integers would you like in the array?");
		int elementCount = sc.nextInt();
		int[] numbers = new int[elementCount];
		
		// user enters number elements in array indeces
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Please enter array number " + (i + 1));
			numbers[i] = sc.nextInt();
		}
		
		sc.close();
		
		// call to method which finds duplicate numbers in number array 
		findDuplicates(numbers);
	}
	
	/*
	 * findDuplicates method identifies duplicate numbers in user input array
	 * @param numbers a user input array of numbers
	 * @return nothing
	 */
	public void findDuplicates(int[] numbers) {
		// array that stores duplicate elements from numbers array
		int[] duplicates = new int [numbers.length];
		int index = 0;
		// index represents both the array index and count of duplicate numbers found
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					duplicates[index] = numbers[j];
					index++;
					break;
				}
			}
		}
		
		// display results
		if (index == 0)
			System.out.println("There are no duplicate numbers in the array.");
		else {
			// call to method that displays duplicate elements
			displayDuplicates(index, duplicates);
		}
	}
	
	/*
	 * displayDuplicates method
	 * @param index first parameter represents number of duplicate elements
	 * @param duplicates second parameter is the array holding the duplicate elements of numbers array
	 * @return nothing
	 */
	public void displayDuplicates(int index, int[] duplicates) {
		System.out.println("The following numbers are duplicate numbers in the array:");
		// displays duplicate numbers from array
		System.out.print("[");
		for (int i = 0; i < index - 1; i++) {
			System.out.print(duplicates[i] + ", ");
		}
		System.out.print(duplicates[index - 1] + "]");
	}
	
	/*
	 * main method creates MainTest object and calls getUserArray method
	 * @param args unused
	 * return nothing
	 */
	public static void main(String[] args) {
		
		MainTest obj = new MainTest();
		obj.getUserArray();
	}
}
