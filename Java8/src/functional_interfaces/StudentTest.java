package functional_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student(1,4,"John");
		Student s2 = new Student(2,5,"Tom");
		
		List<Student> students = Arrays.asList(s1, s2); 
		Predicate<Student> p = (s) -> s.getRollNum() == 2;
		
		System.out.println("Predicate test for students with rollNum == 2:");
		for (Student student: students) {
			if (p.test(student)) {
				System.out.println("Roll num: " + student.getRollNum());
				System.out.println("Class name: " + student.getClassName());
				System.out.println("Name: " + student.getName());
			}
		}
	}
}
