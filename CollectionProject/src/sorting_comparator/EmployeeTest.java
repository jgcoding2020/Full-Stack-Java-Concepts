package sorting_comparator;

import java.util.Set;
import java.util.TreeSet;

public class EmployeeTest {

	public static void main(String[] args){
		Set<Employee> set = new TreeSet<>(new EmployeeNameComparator());
		
		set.add(new Employee(100, "Jerry"));
		set.add(new Employee(300, "Greg"));
		set.add(new Employee(200, "Sarah"));
		
		System.out.println("Overridden comparator to sort by object name attributes:");
		for (Employee emp: set){
			System.out.println(emp.id);
			System.out.println(emp.name);
		}
	}
}
