import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;


public class CopyFilesFromCommandLine {

	public static void main(String[] args){
		FileInputStream fis = null;
		FileOutputStream fos = null;
		File existingFile = new File(args[0]);
		File destinationFile = new File(args[1]);
		Scanner sc = new Scanner(System.in);
		int ch;
		
		try {
			
			fis = new FileInputStream(existingFile);
			
			if (destinationFile.exists()){
				System.out.println("The file " + destinationFile + " exists, would you like to overwrite it?: ");
				System.out.println("1 -> Yes");
				System.out.println("2 -> No");
				int choice = sc.nextInt();
				
				
				switch (choice){
				case 1:
					fos = new FileOutputStream(destinationFile);
					System.out.println("File successfully overwritten");
					while ((ch = fis.read()) != -1){
						fos.write(ch);
					}
					break;
				case 2:
					System.out.println("File will not be overwritten.");
					break;
				default:
					break;
					
				}
			}
			else {
				fos = new FileOutputStream(destinationFile);
				while ((ch = fis.read()) != -1){
					fos.write(ch);
				}
			}
				
			fis.close();
			fos.close();
			sc.close();
			
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
