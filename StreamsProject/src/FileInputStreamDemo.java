
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args){
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(new File("C:/Users/jgard/workspace/StreamsProject/src/Streams/employee.txt"));
			System.out.println("File is opened.");
			int i;
			
			while ((i = fis.read()) != -1){
				System.out.print((char)i);
			}
			fis.close();
			
		} catch (FileNotFoundException f){
			System.out.println(f);
		} catch (IOException e){
			System.out.println(e);
		}
		
	}
}
