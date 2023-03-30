package book_management;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BookDAOImpl implements BookDAO{
	
	ArrayList<Book> books; 
	
	public BookDAOImpl(){
		this.books = new ArrayList<>();
	}
	
	Scanner sc = new Scanner(System.in);
	@Override
	public void createBook() {
		int id;
		String name;
		double price;
		System.out.println("Enter book id: ");
		id = sc.nextInt();
		System.out.println("Enter book name: ");
		name = sc.next();
		System.out.println("Enter book price: ");
		price = sc.nextDouble();
		Book book = new Book(id, name, price);
		this.books.add(book);
		System.out.println("The book has been created.");
	}

	@Override
	public void updateBook() {
		System.out.println("Enter book id to update: ");
		int bookId = sc.nextInt();
		int id;
		String name;
		double price;
		int found = 0;
		Iterator<Book> itr = books.iterator();
	    while (itr.hasNext()) {
	      Book book = itr.next();
	      if (book.getBookId() == bookId) {
	    	  System.out.println("Enter book id: ");
	    	  id = sc.nextInt();
	    	  book.setBookId(id);
	    	  System.out.println("Enter book name: ");
	    	  name = sc.next();
	    	  book.setBookName(name);
	    	  System.out.println("Enter book price: ");
	    	  price = sc.nextDouble();
	    	  book.setBookPrice(price);
	    	  System.out.println("The book has been updated.");
	    	  found++;
	    	  break;
	      }
	    }
		if (found == 0)
			System.out.println("The book isn't in the list.");
	}

	@Override
	public void deleteBook() {
		System.out.println("Enter id of book to delete: ");
		int bookId = sc.nextInt();
		int found = 0;
		Iterator<Book> itr = books.iterator();
	    while (itr.hasNext()) {
	      Book book = itr.next();
	      if (book.getBookId() == bookId) {
	        itr.remove();
	        found++;
	        System.out.println("The book has been removed.");
	        break;
	      }
	    }
		if (found == 0)
			System.out.println("The book isn't in the list.");
	}

	@Override
	public void findBook() {
		System.out.println("Please enter the book id to find: ");
		int bookId = sc.nextInt();
		int found = 0;
		Iterator<Book> itr = books.iterator();
	    while (itr.hasNext()) {
	      Book book = itr.next();
	      if (book.getBookId() == bookId) {
	    	  System.out.println("The book information: ");
	    	  System.out.println(book.getBookId());
	    	  System.out.println(book.bookName);
	    	  System.out.println(book.bookPrice);
	    	  found++;
	    	  break;
	      }
	    }
		if (found == 0)
			System.out.println("The book isn't in the list.");
	}

	@Override
	public void printBook() {
		System.out.println("Here is the list of books:");
		System.out.println();
		for (Book book: books){
				System.out.println(book.getBookId());
				System.out.println(book.bookName);
				System.out.println(book.bookPrice);
				System.out.println();
			}
	}		
}

