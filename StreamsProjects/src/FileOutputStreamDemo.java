import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileOutputStreamDemo {

	public static void main(String[] args){
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("C:/Users/jgard/workspace/StreamsProject/src/Streams/employee.txt");
			System.out.println("File input stream is opened.");
			fos = new FileOutputStream(new File("C:/Users/jgard/workspace/StreamsProject/src/Streams/newEmployee.txt"));
			int data;
			
			while ((data = fis.read()) != -1){
				fos.write(data);
				System.out.print((char)data);
			}
			fis.close();
			fos.close();
			
		} catch (FileNotFoundException f){
			System.out.println(f);
		} catch (IOException e){
			System.out.println(e);
		}
	}
}
