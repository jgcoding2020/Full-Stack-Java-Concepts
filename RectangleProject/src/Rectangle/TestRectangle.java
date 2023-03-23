package Rectangle;

import java.util.Scanner;

public class TestRectangle {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Rectangle[] rectangles = new Rectangle[5];
		
		int length, breadth;
		for (int i = 0; i < rectangles.length; i++){
			System.out.println("Enter rectangle length: ");
			length = sc.nextInt();
			System.out.println("Enter rectangle breadth: ");
			breadth = sc.nextInt();
			Rectangle rectangle = new Rectangle(length, breadth);
			rectangles[i] = rectangle;
		}
		
		int j = 0;
		while (j < rectangles.length){
			rectangles[j].display();
			j++;
		}
	}
}
