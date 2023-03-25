package inheritance_demo;

public class Main {
	
	public static void main(String[] args){
		Book book = new Book();
		Magazine magazine = new Magazine();
		
		book.setTitle("Hamlet");
		book.setAuthor("Shapespeare");
		book.setPrice(10);
		
		magazine.setTitle("Times");
		magazine.setIssue("Feb 2, 2023");
		magazine.setPrice(10);
		
		System.out.println(book.getTitle());
		System.out.println(book.getAuthor());
		System.out.println(book.getPrice());
		
		System.out.println(magazine.getTitle());
		System.out.println(magazine.getIssue());
		System.out.println(magazine.getPrice());
	}
}
