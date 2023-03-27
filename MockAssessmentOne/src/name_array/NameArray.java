package name_array;
import java.util.Scanner;

//sort name array without use of libraries
public class NameArray {
	
	static void nextChar(char[][] array, int i, int j, int k){
		//k is character index
		if (array[i][k] == array[j][k]){
			if (array[i][k + 1] > array[j][k + 1]){
				char[] temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
			//k + 1 while passing argument
			nextChar(array, i, j, k + 1);
		}
	}

	public static void main(String[] args){
		
		//method 1 character based array
		char[][] array = new char[5][15];
		//assigning char values to 0
		for (int i = 0; i < array.length; i++){
			for (int j = 0; j < array[i].length; j++){
				array[i][j] = 0;
			}
		}
		
		//assigning names to char values
		array[0][0] = 'J';
		array[0][1] = 'a';
		array[0][2] = 'm';
		array[0][3] = 'e';
		array[0][4] = 's';
		
		array[1][0] = 'J';
		array[1][1] = 'o';
		array[1][2] = 's';
		array[1][3] = 'h'; 
		
		array[2][0] = 'J';
		array[2][1] = 'o';
		array[2][2] = 'h';
		array[2][3] = 'n';
		
		array[3][0] = 'S';
		array[3][1] = 'a';
		array[3][2] = 'l';
		array[3][3] = 'l';
		array[3][4] = 'y';
		
		array[4][0] = 'J';
		array[4][1] = 'o';
		array[4][2] = 'h';
		array[4][3] = 'n';
		array[4][5] = 'a';
		array[4][6] = 't';
		array[4][7] = 'h';
		array[4][8] = 'a';
		array[4][9] = 'n';
		
		//printing
		for (int i = 0; i < array.length; i++){
			for (int j = 0; j < array[i].length; j++){
				if (array[i][j] != 0)
					System.out.print(array[i][j]);
			}
			System.out.println();
		}
		
		//sorting recursively
		for (int i = 0; i < array.length; i++){
			for (int j = i + 1;j < array.length; j++){
				//k is character index
				int k = 0;
				if (array[i][k] > array[j][k]){
					char[] temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
				
				
				//recursive method based on array size comparing characters
				nextChar(array, i, j, k);
			}
		}
		System.out.println();
		
		// printing sorted array
		for (int i = 0; i < array.length; i++){
			for (int j = 0; j < array[i].length; j++){
				if (array[i][j] != 0)
					System.out.print(array[i][j]);
			}
			System.out.println();
		}
		
		// method 2 String based array bubble sort (uses compareTo())
//		Scanner sc = new Scanner(System.in);
//		String names = new String();
//		int numNames = 0;
//		System.out.println("How many names would you like to add?");
//		numNames = sc.nextInt();
//		String[] array = new String[numNames];
//		for (int i = 0; i < array.length; i++){
//			System.out.println("Please enter name " + (i + 1) + ":");
//			names = sc.next();
//			array[i] =  names;
//		}
//		
//		for (int i = 0; i < array.length; i++){
//			System.out.println("Name " + (i + 1) + ":\n" + array[i]);
//		}
//		
//		for(int i = 0; i < array.length; i++) {
//			for (int j = i+1; j < array.length; j++) {
//				if(array[i].compareTo(array[j]) > 0) {
//					String temp = array[i];
//					array[i] = array[j];
//					array[j] = temp;
//				}
//	        }
//		}
//		
//		for (int i = 0; i < array.length; i++){
//			System.out.println("Name sorted " + (i + 1) + ":\n" + array[i]);
//		}
		
		//method 3 String based array insert sort (uses compareTo())
//		int j, k;
//		String key = new String();
//		for (j = 1; j < array.length; j++) {
//		        
//			key = array[j];
//	        k = j - 1;
//		
//	        while (k >= 0 && array[k].compareTo(key) > key.compareTo(array[k])) {
//	        	array[k + 1] = array[k];
//	        	k = k - 1;
//		    }
//		    array[k + 1] = key;
//		}
//		
//		for (int i = 0; i < array.length; i++){
//			System.out.println("Name " + (i + 1) + ":\n" + array[i]);
//		}
	}
}