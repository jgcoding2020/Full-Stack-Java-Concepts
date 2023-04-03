package student_comparator;

import java.util.ArrayList;

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
		
		students.sort(new StudentNameComparator());
		
		System.out.println("Displaying students sorted by name:");
		for (Student student: students){
			System.out.println(student.toString());
		}
	}
}
