package pkg;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * MainTest Class reverses a user input integer
 * @author Joshua Gardner
 */
public class MainTest {

	/*
	 * reverseNum method
	 * @param int user input integer
	 * @return int user input integer reversed
	 */
	public static int reverseNum(int number) {
		
		int intReversed = 0;

		while (number != 0) {

			// digit assigned to remaining value (last digit of number)
			int digit = number % 10;
			// shifts number decimal place to right one ---> 10.0 then adds digit
			intReversed = intReversed * 10 + digit;
			// shifts decimal of number left <--- 0.1
			number /= 10;
		}
		
		return intReversed;
	}
	
	/*
	 * main method uses reverseNum method to reverse integer
	 * @param args unused
	 * @returns nothing
	 */
	public static void main(String[] args) throws InputMismatchException{

		int number = 0;
		// try block catches user input larger or smaller than an integer
		try (Scanner sc = new Scanner(System.in);){
			System.out.println("Please enter an integer to reverse:");
			number = sc.nextInt();
			System.out.println("integer: " + number);
			number = MainTest.reverseNum(number);
			System.out.println("reversed: " + number);
		} catch (InputMismatchException e) {
			System.out.println("The number you entered is either too large or too small.");
		}
	}
}
