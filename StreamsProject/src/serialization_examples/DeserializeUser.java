package serialization_examples;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DeserializeUser implements Serializable {

	public static void main(String[] args){
		FileInputStream fis = null; 
		ObjectInputStream  ois = null;
		
		try {
			fis = new FileInputStream("C:/Users/jgard/workspace/StreamsProject/src/Streams/user.ser");
			ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();
			User user = (User)obj;
			
			System.out.println("Roll number: " + user.getRollNum());
			System.out.println("Name: " + user.getName());
			System.out.println("Age: " + user.getAge());
			System.out.println("Address: " + user.getAddress());
			fis.close();
			ois.close();
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
