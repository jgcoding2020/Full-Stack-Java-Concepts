
import java.util.Scanner;

public class HW1 {
	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number:");
		num = sc.nextInt();
		
		for (int i = 1; i <= num; i++){
			if (i % 2 == 0)
				System.out.println(i);
			
		}
	}
}
