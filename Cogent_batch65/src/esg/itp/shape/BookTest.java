package esg.itp.shape;

import java.util.Scanner;

public class BookTest {

	public static void createBook(Book[] books, int n){
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++){
			Book book = new Book();
			System.out.println("Enter book title: ");
			book.setBookTitle(sc.next());
			System.out.println("Enter book price: ");
			book.setBookPrice(sc.nextInt());
			books[i] = book;
		}
	}
	
	public static void showBooks(Book[] books){
		for (int i = 0; i < books.length; i++){
			System.out.println("Book title: " + books[i].getBookTitle());
			System.out.println("Book price: " + books[i].getBookPrice());
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("How many books to create?");
		int n = sc.nextInt();
		Book[] books = new Book[n];
		
		createBook(books, n);
		showBooks(books);
	}
}
