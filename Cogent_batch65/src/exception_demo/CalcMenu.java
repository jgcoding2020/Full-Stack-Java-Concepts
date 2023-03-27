package exception_demo;

import java.util.Scanner;

public class CalcMenu {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Number numObj;
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
			System.out.println("Please enter 2 numbers: ");
			numOne = sc.nextInt();
			numTwo = sc.nextInt();
			numObj = new Number(numOne, numTwo);
			
			switch (choice){
			case 1:
				numObj.add();
				break;
			case 2:
				numObj.sub();
				break;
			case 3:
				numObj.mul();
				break;
			case 4:
				try {
					numObj.div();
				} catch (ArithmeticException e){
					System.out.println("Division by 0 not allowed");
				}
				break;
			case 5:
				System.out.println("Successfully exited");
				break;
			}
		} while (choice != 5);
	}
}
