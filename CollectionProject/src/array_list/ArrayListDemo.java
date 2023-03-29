package array_list;

public class ArrayListDemo {

	public static void main(String[] args){
		
		Student student = new Student();
		
		student.setName("James");
		student.setName("Sarah");
		student.setName("Bob");
		student.setName("Matt");
		
		student.searchName("Bob");
		student.searchName(3);
		student.printNames();
		student.removeName("James");
		student.printNames();
	}
}
