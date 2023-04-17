import java.io.FileReader;
import java.io.FileWriter;
public class FileReaderWriterDemo {

	public static void main(String[] args){
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("C:/Users/jgard/workspace/StreamsProject/src/Streams/abc.txt");
			fw = new FileWriter("C:/Users/jgard/workspace/StreamsProject/src/Streams/xyz.txt");
			int ch;
			
			while((ch = fr.read()) != -1){
				fw.write(ch);
			}
			System.out.println("File copied successfully");
			fr.close();
			fw.close();
			
		} catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
