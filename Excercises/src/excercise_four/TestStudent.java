package excercise_four;

public class TestStudent {

	public static void main(String[] args) {
		
		Student s1 = new Student(1,"Josh","NY","Josh@yahoo.com");
		Student s2 = new Student(1,"Steph","MN","Steph@gmail.com");
		Student s3 = new Student(1,"Mustafa","FL","Josh@outlook.com");
		s1.displayDetails();
		s2.displayDetails();
		s3.displayDetails();
	}
}
