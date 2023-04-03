package sorting_comparable;

import java.util.Set;
import java.util.TreeSet;

public class EmployeeTest {

	public static void main(String[] args){
		Set<Employee> set = new TreeSet<>();
		
		set.add(new Employee(100, "Jerry"));
		set.add(new Employee(300, "Greg"));
		set.add(new Employee(200, "Sarah"));
		
		for (Employee emp: set){
			System.out.println(emp.id);
			System.out.println(emp.name);
		}
	}
}
