<<<<<<< HEAD
package assessment_two;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		EmployeeDAOImpl employeeDAOImpl = new EmployeeDAOImpl();
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("**********************Menu*********************");
			System.out.println("Please enter your choice: ");
			System.out.println("1 -> Add employee");
			System.out.println("2 -> Update employee");
			System.out.println("3 -> Delete employee");
			System.out.println("4 -> Read all employees");
			System.out.println("5 -> Search employee");
			System.out.println("6 -> Sort all employees");
			System.out.println("7 -> Exit");
			choice = sc.nextInt();
			
			switch (choice){
			
			case 1:
				employeeDAOImpl.createEmployee(employees);
				break;
			case 2:
				employeeDAOImpl.updateEmployee(employees);
				break;
			case 3:
				employeeDAOImpl.deleteEmployee(employees);
				break;
			case 4:
				employeeDAOImpl.readAllEmployees(employees);
				break;
			case 5:
				employeeDAOImpl.searchEmployee(employees);
				break;
			case 6:
				employeeDAOImpl.sortEmployees(employees);
				break;
			}
		} while (choice != 7);
		System.out.println("You have successfully exited.");
		sc.close();
	}
}
=======
package assessment_two;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		EmployeeDAOImpl employeeDAOImpl = new EmployeeDAOImpl();
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("**********************Menu*********************");
			System.out.println("Please enter your choice: ");
			System.out.println("1 -> Add employee");
			System.out.println("2 -> Update employee");
			System.out.println("3 -> Delete employee");
			System.out.println("4 -> Read all employees");
			System.out.println("5 -> Search employee");
			System.out.println("6 -> Sort all employees");
			System.out.println("7 -> Exit");
			choice = sc.nextInt();
			
			switch (choice){
			
			case 1:
				employeeDAOImpl.createEmployee(employees);
				break;
			case 2:
				employeeDAOImpl.updateEmployee(employees);
				break;
			case 3:
				employeeDAOImpl.deleteEmployee(employees);
				break;
			case 4:
				employeeDAOImpl.readAllEmployees(employees);
				break;
			case 5:
				employeeDAOImpl.searchEmployee(employees);
				break;
			case 6:
				employeeDAOImpl.sortEmployees(employees);
				break;
			}
		} while (choice != 7);
		System.out.println("You have successfully exited.");
		sc.close();
	}
}
>>>>>>> 5586e7524010cc2dbc62521a27afd735e13683cd
