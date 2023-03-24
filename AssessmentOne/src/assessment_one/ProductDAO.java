package assessment_one;

import java.util.Scanner;

public class ProductDAO {

	Scanner sc = new Scanner(System.in);
	public void create(Product[] products, int i){
		Product newProduct = new Product();
		System.out.println("Please enter product " + (i + 1) + " id: ");
		newProduct.setProductId(sc.nextInt());
		System.out.println("Please enter product " + (i + 1) + " name: ");
		newProduct.setProductName(sc.next());
		System.out.println("Please enter product " + (i + 1) + " price: ");
		newProduct.setProductPrice(sc.nextDouble());
		products[i] = newProduct;
		
	}
	
	public void read(Product[] products){
		for (Product i: products){
			System.out.println("Product id: " + i.getProductId());
			System.out.println("Product name: " + i.getProductName());
			System.out.println("Product price: " + i.getProductPrice());
		}
	}
	
	public void update(Product[] products){
		System.out.println("Please enter the product id to update: ");
		int productId = sc.nextInt();
		
		for (Product i: products){
			if (i.getProductId() == productId){
				System.out.println("Please update product name: ");
				i.setProductName(sc.next());
				System.out.println("Please update product price: ");
				i.setProductPrice(sc.nextDouble());
			}
		}
	}
	
	public void delete(Product[] products){
		System.out.println("Please enter the product id to delete: ");
		int productId = sc.nextInt();
		
		for (int i = 0; i < products.length; i++){
			if (products[i].getProductId() == productId){
				products[i].setProductId(0);
				products[i].setProductName(null);
				products[i].setProductPrice(0);
				System.out.println("The product has been deleted");
			}
		}
	}
}
