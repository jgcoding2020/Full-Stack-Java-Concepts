package excercise_six;

import java.util.*;
public class TestStudent {


	public static void main(String[] args) {
		LinkedList<Employee> employees = new LinkedList<Employee>();
		Scanner sc = new Scanner(System.in);
		
		int choice;
		
		do {
			System.out.println("**********************Menu*********************");
			System.out.println("Please enter your choice: ");
			System.out.println("1 -> Add employee");
			System.out.println("2 -> Delete employee");
			System.out.println("3 -> Read all employees");
			System.out.println("4 -> Exit");
			choice = sc.nextInt();
			switch (choice){
			
			case 1:
				sc.nextLine();
				Employee emp = new Employee();
				System.out.println("Please enter employee department:");
				emp.setDepartment(sc.nextLine());
				System.out.println("Please enter employee name:");
				emp.setName(sc.nextLine());
				System.out.println("Please enter employee age:");
				emp.setAge(sc.nextInt());
				sc.nextLine();
				System.out.println("Please enter employee email:");
				emp.setEmail(sc.nextLine());
				employees.add(emp);
				break;
			case 2:
				System.out.println("Please enter id of employee to delete: ");
				int deleteId = sc.nextInt();
				ListIterator<Employee> itr = employees.listIterator();
				Employee temp = new Employee();
				while (itr.hasNext()) {
					temp = itr.next();
					if (temp.getId() == deleteId)
						itr.remove();
				}
				break;
			case 3:
				ListIterator<Employee> itr1 = employees.listIterator();
				Employee temp1 = new Employee();
				while (itr1.hasNext()) {
					temp1 = itr1.next();
					temp1.displayDetails();
				}
				break;
			}
		} while (choice != 4);
		System.out.println("You have successfully exited.");
		sc.close();
	}
}
