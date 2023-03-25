
import java.util.Scanner;

public class HW2 {
	public static void main(String[] args){
		// part 1 cmd arg length, display upper case, palindrome check
//		int length = args[0].length();
//		String argument = args[0];
//		System.out.println(length);
//		
//		System.out.println(argument.toUpperCase());
//		
//		String reverse = new String();
//	    for (int j = argument.length() - 1; j >= 0; j--)
//	    	reverse += argument.charAt(j);
//	    if (reverse.equalsIgnoreCase(argument))
//	    	System.out.println("true");
//	    else
//	        System.out.println("false");
		
		// part 2 primitive way to modified fib
		
//		int previous = Integer.parseInt(args[0]);
//		int next = Integer.parseInt(args[1]);
//		
//		System.out.println("Number 1 = " + previous);
//		System.out.println("Number 2 = " + next);
//		
//		int print;
//		for (int i = 0; i < 13; i++){
//			print = previous + next;
//			System.out.print("Number " + (i + 3) + " = ");
//			System.out.println(print);
//			previous = next;
//			next = print;
//		}
		
		// part 2 using array modified fib
//		int[] array = new int[15];
//		
//		array[0] = Integer.parseInt(args[0]);
//		array[1] = Integer.parseInt(args[1]);
//		
//		System.out.println("Number 1 = " + array[0]);
//		System.out.println("Number 1 = " + array[1]);
//		
//		for (int i = 2; i < array.length; i++){
//			array[i] = array[i - 1] + array[i - 2];
//			System.out.println("Number " + (i + 1) + " = " + array[i]);
//		}
		
		//part 3 Bingo
//		if ((Integer.parseInt(args[0]) > 40 || Integer.parseInt(args[0]) < 0) || (Integer.parseInt(args[1]) > 40 || Integer.parseInt(args[1]) < 0)){
//			System.out.println("Please enter number inbetween 0 and 40");
//		} else {
//			Scanner sc = new Scanner(System.in);
//			int num;
//			int[] array = new int[5];
//			for(int i = 0; i < array.length; i++){
//				System.out.println("Please enter number " + (i + 1) + ":");
//				num = sc.nextInt();
//				while (num < 0 || num > 40){
//					System.out.println("Please enter number inbetween 0 and 40");
//					System.out.println("Please enter number " + (i + 1) + ":");
//					num = sc.nextInt();
//				}
//				array[i] = num;
//		}
//			
//			int count = 0;
//			for(int i = 0; i < array.length; i++){
//				if(array[i] == Integer.parseInt(args[0]) || array[i] == Integer.parseInt(args[1]))
//					count++;
//			}
//			
//			if(count >= 2)
//				System.out.println("BINGO");
//			else
//				System.out.println("Not both Matching");
//		}
		
		// part 4 sum, avg, smallest int
//		int[] array = {3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};
//		int smallest = array[0];
//		for (int i = 0; i < array.length - 3; i++){
//			array[15] += array[i];
//			if (smallest > array[i]){
//				smallest = array[i];
//				array[17] = smallest;
//			}
//		}
//		
//		array[16] = (int)Math.round(array[15]/15.0);
//		
//		System.out.println("The sum :" + array[15]);
//		System.out.println("The avg :" + array[16]);
//		System.out.println("The smallest :" + array[17]);
	}
}
