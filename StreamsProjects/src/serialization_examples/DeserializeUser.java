package serialization_examples;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DeserializeUser implements Serializable {

	public static void main(String[] args){
		FileInputStream fis = null; 
		ObjectInputStream  ois = null;
		
		try {
			fis = new FileInputStream("C:/Users/jgard/workspace/StreamsProject/src/Streams/user.ser");
			ois = new ObjectInputStream(fis);
			
			for (;;){
				Object obj = ois.readObject();
				User user = (User)obj;
				System.out.println("Name: " + user.getName());
				System.out.println("Roll num: " + user.getRollNum());
				System.out.println("Age: " + user.getAge());
				System.out.println("Address: " + user.getAddress());
				System.out.println();
			}
		} catch (EOFException e){
			System.out.println("End of file.");
		} catch (Exception e){
			System.out.println("Exception occurred");
		}
		
		try {
			ois.close();
			fis.close();
		} catch (IOException e) {
			System.out.println("IOException occured");
		}
	}
}
