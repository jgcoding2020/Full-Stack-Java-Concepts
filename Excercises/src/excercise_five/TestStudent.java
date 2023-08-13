package excercise_five;

public class TestStudent {


	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Electrics","Josh",25,"Josh@gmail.com");
		Employee emp2 = new Employee("Software Development","Sarah",32,"Sarah@gmail.com");
		
		emp1.displayDetails();
		emp2.displayDetails();
	}
}
