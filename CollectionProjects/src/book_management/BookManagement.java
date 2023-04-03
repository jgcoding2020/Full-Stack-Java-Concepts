package book_management;

import java.util.Scanner;

public class BookManagement {
 
	public static void main(String[] args){
		BookDAOImpl bookDAO = new BookDAOImpl();
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("**********************Menu*********************");
			System.out.println("Please enter your choice: ");
			System.out.println("1 -> Add book");
			System.out.println("2 -> Update book");
			System.out.println("3 -> Find book");
			System.out.println("4 -> Delete book");
			System.out.println("5 -> Print Books");
			System.out.println("0 -> exit");
			choice = sc .nextInt();
			
			switch (choice){
			
			case 1:
				bookDAO.createBook();
				break;
			case 2:
				bookDAO.updateBook();
				break;
			case 3:
				bookDAO.findBook();
				break;
			case 4:
				bookDAO.deleteBook();
			case 5:
				bookDAO.printBook();
				break;
			}
		} while (choice != 0);
		System.out.println("You have successfully exited.");
	}
}
