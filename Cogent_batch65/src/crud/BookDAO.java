package crud;

import java.util.Scanner;

public class BookDAO {

	Scanner sc = new Scanner(System.in);
	
	public void create(Book[] book, int i){
		
		Book newBook = new Book();
		System.out.println("Please enter book " + (i + 1) + " id: ");
		newBook.setBookId(sc.nextInt());
		System.out.println("Please enter book " + (i + 1) + " name: ");
		newBook.setBookName(sc.next());
		System.out.println("Please enter book " + (i + 1) + " price: ");
		newBook.setBookPrice(sc.nextDouble());
		book[i] = newBook;
	}
	
	public void read(Book[] book){
		
		for (Book i: book){
			System.out.println("Book id: " + i.getBookId());
			System.out.println("Book name: " + i.getBookName());
			System.out.println("Book price: " + i.getBookPrice());
		}
	}
	
	public void update(Book[] book){
		
		System.out.println("Please enter the book id to update: ");
		int bookId = sc.nextInt();
		
		for (Book i: book){
			if (i.getBookId() == bookId){
				System.out.println("Please update book name: ");
				i.setBookName(sc.next());
				System.out.println("Please update book price: ");
				i.setBookPrice(sc.nextDouble());
			}
		}
	}
	
	public void delete(Book[] book){
		
		System.out.println("Please enter the book id to delete: ");
		int bookId = sc.nextInt();
		
		for (int i = 0; i < book.length; i++){
			if (book[i].getBookId() == bookId){
				book[i].setBookId(0);
				book[i].setBookName(null);
				book[i].setBookPrice(0);
				System.out.println("The book has been deleted");
			}
		}
	}
}
