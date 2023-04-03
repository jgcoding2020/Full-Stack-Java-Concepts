package student_map;

public class StudentTest {

	public static void main(String[] args){
		Student student = new Student();
		
		student.setNames("1", "John");
		
		student.printNames();
		
		student.getName("1");
		
		student.printNamesKeySet();
		
		student.printSize();
		
		student.remove("1");
		student.printSize();
	}
}
