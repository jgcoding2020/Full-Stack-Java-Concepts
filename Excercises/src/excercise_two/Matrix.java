package excercise_two;

import java.util.*;

/**
 * Class has main method that allows a user to create a matrix
 * The number returned is largest in its row and smallest in its column
 * if no value is found matching the above mentioned criteria -1 is returned
 * @author jgard
 */
public class Matrix {
	/**
	 * Checks for largest value in a row of user created matrix
	 * @param matrix - user created matrix with values inserted 
	 * @param rows - number of rows in matrix
	 * @param columns - number of columns in matrix
	 * @return int num - largest number in a row that is smallest in its column or -1 if none
	 */
	public static int valueChecker(int[][] matrix, int rows, int columns) {
		// value to be returned if no other value is found
		int num = -1;
		// largest value in matrix row
		int largest = 0;
		// index of column where largest number in row is found
		int columnIndex = 0;
		// outer loops through matrix rows
		for (int i = 0; i < rows; i++) {
			largest = matrix[i][0];
			columnIndex = 0;
			//inner loop checks for largest value in row and labels column index
			for (int j = 0; j < columns; j++) {
				if (largest < matrix[i][j]) {
					largest = matrix[i][j];
					columnIndex = j;
				}
			}
			// creates column array and calls to columnChecker method
			if (largest > 0) {
				int[] tempColumn = new int[rows];
				for (int k = 0; k < tempColumn.length; k++)
					tempColumn[k] = matrix[k][columnIndex];
				num = Matrix.columnChecker(largest, tempColumn);
			}
			// valid number has been found break out of loop
			if (num != -1)
				break;
		}
		return num;
	}
	
	/**
	 * columnChecker method checks to see if largest is smallest in column
	 * @param largest - largest number in matrix row
	 * @param columnArray - largest number column array
	 * @return int num - either -1 or number meeting condition from matrix
	 */
	public static int columnChecker(int largest, int[] columnArray) {
		
		int num = -1;
		int smallest = largest;
		// comparing column array numbers against largest
		for (int i = 0; i < columnArray.length; i++) {
			if (smallest > columnArray[i]) {
				break;
			}
			else if (smallest == largest && i  == columnArray.length - 1)
				return smallest;
			else
				continue;
		}
		return num;
	}
	/**
	 * Displays test results to user
	 * @param num - result of matrix test
	 */
	public static void result(int num) {
		if (num == -1)
			System.out.println("There were no numbers meeting the condition " + num);
		else
			System.out.println("The number " + num + " met the condition");
	}

	/**
	 * Matrix method takes in user entered array information 
	 * and passes data into Class methods to be evaluated 
	 * and display results
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// User enters number of rows must be >= 1 and <= 1000
		System.out.println("Please enter the number of rows in your matrix: ");
		int rows = 0;
		while (rows > 1000 || rows < 1) {
			rows = sc.nextInt();
			if (rows > 1000 || rows < 1)
				System.out.println("Please enter a number of rows greater than 0 and less than 1001");
		}
		// User enters number of columns must be >= 1 and <= 1000
		System.out.println("Please enter the number of columns in your matrix: ");
		int columns = 0;
		while (columns > 1000 || columns < 1) {
			columns = sc.nextInt();
			if (columns > 1000 || columns < 1)
				System.out.println("Please enter a number of columns greater than 0 and less than 1001");
		}
		// create matrix array based on user entered sizes
		int[][] matrix = new int[rows][columns];
		// User enters numbers into array positions
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.println("Enter row " + (i + 1) + " position " + (j + 1));
				matrix[i][j] = sc.nextInt();
			}
		}
		// Calls to valueChecker() method to find existence of condition 
		int num = Matrix.valueChecker(matrix, rows, columns);
		// Calls to result() method to display results
		Matrix.result(num);
		sc.close();
	}
}
