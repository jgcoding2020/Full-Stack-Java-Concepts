
import java.util.Scanner;

public class BookTest {
	
	public static void main(String[] args){
		Book one = new Book();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter book number:");
		one.setBookNo(sc.nextInt());
		System.out.println("Please enter book name:");
		one.setBookName(sc.next());
		System.out.println("Please enter book price:");
		one.setBookPrice(sc.nextDouble());
		System.out.println("Please enter book author:");
		one.setBookAuthor(sc.next());
		
		System.out.println("Book details:");
		System.out.println("number: " + one.getBookNo());
		System.out.println("name: " + one.getBookName());
		System.out.println("price: " + one.getBookPrice());
		System.out.println("author: " + one.getBookAuthor());
		
		Book[] book = new Book[5];
		
		for (int j = 0; j < book.length; j++){
			Book b1 = new Book();
			System.out.println("Please enter book number:");
			b1.setBookNo(sc.nextInt());
			System.out.println("Please enter book name:");
			b1.setBookName(sc.next());
			System.out.println("Please enter book price:");
			b1.setBookPrice(sc.nextDouble());
			System.out.println("Please enter book author:");
			b1.setBookAuthor(sc.next());
			book[j] = b1;
		}
		
		for (int k = 0; k < book.length; k++){
			System.out.println("Book " + (k + 1) + " details:");
			System.out.println("number: " + book[k].getBookNo());
			System.out.println("name: " + book[k].getBookName());
			System.out.println("price: " + book[k].getBookPrice());
			System.out.println("author: " + book[k].getBookAuthor());
		}
	}
}
