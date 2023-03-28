package serialization_examples;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializeUser {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos;
		ObjectOutputStream oos;
		User user;
		int choice = 0;
		int rollNum;
		String name;
		int age;
		String address;
		do {
			try {
			
				System.out.println("Please enter name: ");
				name = sc.next();
				System.out.println("Please enter Address: ");
				address = sc.next();
				System.out.println("Please enter roll number: ");
				rollNum = sc.nextInt();
				System.out.println("Please enter age: ");
				age = sc.nextInt();
				
				user = new User(rollNum, name, age, address);
				System.out.println("Would you like to save this user information?");
				System.out.println("1 -> Yes");
				System.out.println("2 -> No");
				choice = sc.nextInt();
				switch (choice){
				case 1:
					fos = new FileOutputStream("C:/Users/jgard/workspace/StreamsProject/src/Streams/user.ser");
					oos = new ObjectOutputStream(fos);
					oos.writeObject(user);
					System.out.println("Information serialized successfully");
					fos.close();
					oos.close();
					break;
				case 2:
					System.out.println("you have successfully exited.");
					break;
				default:
					break;
				}	 
			
			} catch (BlankFieldException b){
			System.out.println(b.getMessage());
			} catch (Exception e){
			e.printStackTrace();
			}
		} while (choice != 2);
	}
}
