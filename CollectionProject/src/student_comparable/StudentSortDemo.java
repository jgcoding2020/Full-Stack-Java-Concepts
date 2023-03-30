package student_comparable;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSortDemo {
	
	public static void main(String[] args){
		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(new Student(1, "James"));
		students.add(new Student(4, "Carrie"));
		students.add(new Student(5, "Fred"));
		students.add(new Student(2, "Andy"));
		students.add(new Student(3, "Kathy"));
		
		System.out.println("Displaying list of unsorted students:");
		for (Student student: students){
			System.out.println(student.toString());
		}
		
		Collections.sort(students);
		
		System.out.println("Displaying students sorted by name:");
		for (Student student: students){
			System.out.println(student.toString());
		}
	}
}
