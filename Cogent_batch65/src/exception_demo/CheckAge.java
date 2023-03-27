package exception_demo;

import java.util.Scanner;

//creates user defined Exception
public class CheckAge {

	public void validateAge(int age) throws InvalidAgeException {
		if (age <= 100 && age > 0)
			System.out.println("Age is valid");
		else
			throw new InvalidAgeException("Age is not valid");
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter age: ");
		int age = sc.nextInt();
		CheckAge ck = new CheckAge();
		try {
			ck.validateAge(age);
		} catch (InvalidAgeException ia){
			System.out.println("Invalid age: "+ ia.getMessage());
		}
	}
}
