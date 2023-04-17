package assessment_one;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		Product[] products = new Product[10];
		ProductDAO productDAO = new ProductDAO();
		do {
			System.out.println("****************Menu****************");
			System.out.println("1 -> Add");
			System.out.println("2 -> Select");
			System.out.println("3 -> Update");
			System.out.println("4 -> Delete");
			System.out.println("5 -> Exit");
			System.out.println("Please enter your choice: ");
			choice = sc.nextInt();
			
			switch (choice){
			
			case 1:
				System.out.println("Please add 10 products: ");
				for (int i = 0; i < products.length; i++){
					productDAO.create(products, i);
				}
				break;
			case 2:
				productDAO.read(products);
				break;
			case 3:
				productDAO.update(products);
				break;
			case 4:
				productDAO.delete(products);
				break;
			case 5:
				break;
			}
			
		} while (choice != 5);
		sc.close();
	}
}
