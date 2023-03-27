package exception_demo;

import java.util.Scanner;

//demonstrates try/catch arithmetic exception
public class ExceptionDemo {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 2 numbers:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		try{
			int z = x/y;
			//if y = zero arithmetic exception occurs
			System.out.println(z);
		} catch (ArithmeticException e){
			System.out.println("Division by 0 not allowed.");
		}
		
		//does not occur after exception unless handled
		System.out.println("Welcome!");
	}
}
