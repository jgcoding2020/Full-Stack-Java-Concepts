package serialization_examples;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializeUser {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos;
		File outputFile = new File("C:/Users/jgard/workspace/StreamsProject/src/Streams/user.ser");
		ObjectOutputStream oos;
		int choice = 1;
		int rollNum;
		String name;
		int age;
		String address;
		System.out.println("Enter user information: \n");
		try {
			fos = new FileOutputStream(outputFile);
			oos = new ObjectOutputStream(fos);
				
			while (choice != 2){
				System.out.println("Please enter name: ");
				name = sc.next();
				System.out.println("Please enter Address: ");
				address = sc.next();
				System.out.println("Please enter roll number: ");
				rollNum = sc.nextInt();
				System.out.println("Please enter age: ");
				age = sc.nextInt();
				System.out.println("Would you like to save this user information?");
				System.out.println("1 -> Yes");
				System.out.println("2 -> No");
				choice = sc.nextInt();
				if (choice == 1){
					oos.writeObject(new User(rollNum, name, age, address));
					System.out.println("Would you like to add a user?");
					System.out.println("1 -> Yes");
					System.out.println("2 -> No");
					choice = sc.nextInt();
				}
				else {
					System.out.println("Would you like to add a user?");
					System.out.println("1 -> Yes");
					System.out.println("2 -> No");
					choice = sc.nextInt();
				}
			}
			fos.close();
			oos.close();
		} catch (BlankFieldException b){
			System.out.println(b.getMessage());
		} catch (Exception e){
			System.out.println("An exception occurred");
		}
	sc.close();
	System.out.println("Information serialized");
	System.out.println("You have successfully exited.");
	}
}
