package exception_demo;

import java.util.Scanner;

public class CalcMenu {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		int numOne = 0;
		int numTwo = 0;
		
		do {
			System.out.println("****************Menu*****************");
			System.out.println("Please Make A Selection:");
			System.out.println("1 -> Add");
			System.out.println("2 -> Subtract");
			System.out.println("3 -> Multiply");
			System.out.println("4 -> Divide");
			System.out.println("5 -> Exit");
			choice = sc.nextInt();
			if (choice != 5){
				System.out.println("Please enter 2 numbers ");
				numOne = sc.nextInt();
				numTwo = sc.nextInt();
			}
			
			switch (choice){
			case 1:
				System.out.println("Addition: ");
				new Number(numOne, numTwo).add();
				break;
			case 2:
				System.out.println("Difference: first - second: ");
				new Number(numOne, numTwo).sub();
				break;
			case 3:
				System.out.println("Multiplication: ");
				new Number(numOne, numTwo).mul();
				break;
			case 4:
				try {
					System.out.println("Division: first/ second: ");
					new Number(numOne, numTwo).div();
				} catch (ArithmeticException e){
					System.out.println("No Division by zero allowed");
					e.printStackTrace();
				}
				break;
			case 5:
				break;
			}
		} while (choice != 5);
		System.out.println("Successfully exited");
	}
}
