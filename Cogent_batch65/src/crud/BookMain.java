package crud;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args){
		
		Book[] book = null;
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		BookDAO bookDAO = new BookDAO();
		
		do {
			System.out.println("*********************Menu**********************");
			System.out.println("Please select a choice:");
			System.out.println("1 -> Add book");
			System.out.println("2 -> Select book");
			System.out.println("3 -> Update book");
			System.out.println("4 -> Delete book");
			System.out.println("5 -> exit");
			choice = sc.nextInt();
			
			switch (choice){
				
				case 1:
					System.out.println("How many books would you like to add?");
					int count = sc.nextInt();
					book = new Book[count];
					for (int i = 0; i < book.length; i++){
						bookDAO.create(book, i);
					}
					break;
					
				case 2:
					bookDAO.read(book);
					break;
					
				case 3:
					bookDAO.update(book);
					break;
					
				case 4:
					bookDAO.delete(book);
					break;
					
				case 5:
					System.exit(0);
			}
			
		} while (choice != 5);
	}
}
