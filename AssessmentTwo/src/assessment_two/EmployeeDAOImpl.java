<<<<<<< HEAD
package assessment_two;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeDAOImpl implements EmployeeDAO{

	Scanner sc = new Scanner(System.in);

	@Override
	public void createEmployee(ArrayList<Employee> employees) {
		int employeeNo;
		String employeeName;
		String employeeAddress;
		String employeeEmail;
		Double employeeSalary;
		int choice = 0;
		do {
			System.out.println("Creating new employee:");
			System.out.println("Enter employee number:");
			employeeNo = sc.nextInt();
			System.out.println("Enter employee name:");
			employeeName = sc.next();
			System.out.println("Enter employee address:");
			employeeAddress = sc.next();
			System.out.println("Enter employee email");
			employeeEmail = sc.next();
			System.out.println("Enter employee salary:");
			employeeSalary = sc.nextDouble();
			Employee employee = new Employee(employeeNo, employeeName, employeeAddress, employeeEmail, employeeSalary);
			employees.add(employee);
			System.out.println("Employee added would you like to add another?");
			System.out.println("1 -> Yes");
			System.out.println("2 -> No");
			choice = sc.nextInt();
		} while (choice != 2);
	}

	@Override
	public void updateEmployee(ArrayList<Employee> employees) {
		int employeeNo;
		String employeeName;
		String employeeAddress;
		String employeeEmail;
		Double employeeSalary;
		System.out.println("Enter employee number to update: ");
		employeeNo = sc.nextInt();
		int found = 0;
		Iterator<Employee> itr = employees.iterator();
	    while (itr.hasNext()) {
	      Employee employee = itr.next();
	      if (employee.getEmployeeNo() == employeeNo) {
	    	  System.out.println("Enter employee number:");
	    	  employeeNo = sc.nextInt();
	    	  employee.setEmployeeNo(employeeNo);
	    	  System.out.println("Enter employee name:");
	    	  employeeName = sc.next();
	    	  employee.setEmployeeName(employeeName);
	    	  System.out.println("Enter employee address:");
	    	  employeeAddress = sc.next();
	    	  employee.setEmployeeAddress(employeeAddress);
	    	  System.out.println("Enter employee email");
	    	  employeeEmail = sc.next();
	    	  employee.setEmployeeEmail(employeeEmail);
	    	  System.out.println("Enter employee salary:");
	    	  employeeSalary = sc.nextDouble();
	    	  employee.setEmployeeSalary(employeeSalary);
	    	  System.out.println("The employee has been updated.");
	    	  found++;
	    	  break;
	      }
	    }
		if (found == 0)
			System.out.println("The employee isn't in the list.");
	}

	@Override
	public void deleteEmployee(ArrayList<Employee> employees) {
		int employeeNo;
		System.out.println("Please enter employee number to delete:");
		employeeNo = sc.nextInt();
		int found = 0;
		Iterator<Employee> itr = employees.iterator();
	    while (itr.hasNext()) {
	      Employee employee = itr.next();
	      if (employee.getEmployeeNo() == employeeNo) {
	        itr.remove();
	        found++;
	        System.out.println("The employee has been removed.");
	        break;
	      }
	    }
		if (found == 0)
			System.out.println("The employee isn't in the list.");
	}

	@Override
	public void readAllEmployees(ArrayList<Employee> employees) {
		System.out.println("Here is the list of employees:");
		System.out.println();
		for (Employee employee: employees){
				System.out.println(employee.getEmployeeNo());
				System.out.println(employee.getEmployeeName());
				System.out.println(employee.getEmployeeAddress());
				System.out.println(employee.getEmployeeEmail());
				System.out.println(employee.getEmployeeSalary());
				System.out.println();
			}
	}

	@Override
	public void searchEmployee(ArrayList<Employee> employees) {
		System.out.println("Please enter the employee number to find: ");
		int employeeNo = sc.nextInt();
		int found = 0;
		Iterator<Employee> itr = employees.iterator();
	    while (itr.hasNext()) {
	    	Employee employee = itr.next();
	    	if (employee.getEmployeeNo() == employeeNo) {
	    	  	System.out.println("The employee information: ");
	    	  	System.out.println(employee.getEmployeeNo());
				System.out.println(employee.getEmployeeName());
				System.out.println(employee.getEmployeeAddress());
				System.out.println(employee.getEmployeeEmail());
				System.out.println(employee.getEmployeeSalary());
				found++;
				break;
	    	}
	    }
	    if (found == 0)
			System.out.println("The Employee isn't in the list.");
	}

	@Override
	public void sortEmployees(ArrayList<Employee> employees) {
		employees.sort(new EmployeeNameComparator());
		System.out.println("The employees have been sorted by name.");
	}
}
=======
package assessment_two;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeDAOImpl implements EmployeeDAO{

	Scanner sc = new Scanner(System.in);

	@Override
	public void createEmployee(ArrayList<Employee> employees) {
		int employeeNo;
		String employeeName;
		String employeeAddress;
		String employeeEmail;
		Double employeeSalary;
		int choice = 0;
		do {
			System.out.println("Creating new employee:");
			System.out.println("Enter employee number:");
			employeeNo = sc.nextInt();
			System.out.println("Enter employee name:");
			employeeName = sc.next();
			System.out.println("Enter employee address:");
			employeeAddress = sc.next();
			System.out.println("Enter employee email");
			employeeEmail = sc.next();
			System.out.println("Enter employee salary:");
			employeeSalary = sc.nextDouble();
			Employee employee = new Employee(employeeNo, employeeName, employeeAddress, employeeEmail, employeeSalary);
			employees.add(employee);
			System.out.println("Employee added would you like to add another?");
			System.out.println("1 -> Yes");
			System.out.println("2 -> No");
			choice = sc.nextInt();
		} while (choice != 2);
	}

	@Override
	public void updateEmployee(ArrayList<Employee> employees) {
		int employeeNo;
		String employeeName;
		String employeeAddress;
		String employeeEmail;
		Double employeeSalary;
		System.out.println("Enter employee number to update: ");
		employeeNo = sc.nextInt();
		int found = 0;
		Iterator<Employee> itr = employees.iterator();
	    while (itr.hasNext()) {
	      Employee employee = itr.next();
	      if (employee.getEmployeeNo() == employeeNo) {
	    	  System.out.println("Enter employee number:");
	    	  employeeNo = sc.nextInt();
	    	  employee.setEmployeeNo(employeeNo);
	    	  System.out.println("Enter employee name:");
	    	  employeeName = sc.next();
	    	  employee.setEmployeeName(employeeName);
	    	  System.out.println("Enter employee address:");
	    	  employeeAddress = sc.next();
	    	  employee.setEmployeeAddress(employeeAddress);
	    	  System.out.println("Enter employee email");
	    	  employeeEmail = sc.next();
	    	  employee.setEmployeeEmail(employeeEmail);
	    	  System.out.println("Enter employee salary:");
	    	  employeeSalary = sc.nextDouble();
	    	  employee.setEmployeeSalary(employeeSalary);
	    	  System.out.println("The employee has been updated.");
	    	  found++;
	    	  break;
	      }
	    }
		if (found == 0)
			System.out.println("The employee isn't in the list.");
	}

	@Override
	public void deleteEmployee(ArrayList<Employee> employees) {
		int employeeNo;
		System.out.println("Please enter employee number to delete:");
		employeeNo = sc.nextInt();
		int found = 0;
		Iterator<Employee> itr = employees.iterator();
	    while (itr.hasNext()) {
	      Employee employee = itr.next();
	      if (employee.getEmployeeNo() == employeeNo) {
	        itr.remove();
	        found++;
	        System.out.println("The employee has been removed.");
	        break;
	      }
	    }
		if (found == 0)
			System.out.println("The employee isn't in the list.");
	}

	@Override
	public void readAllEmployees(ArrayList<Employee> employees) {
		System.out.println("Here is the list of employees:");
		System.out.println();
		for (Employee employee: employees){
				System.out.println(employee.getEmployeeNo());
				System.out.println(employee.getEmployeeName());
				System.out.println(employee.getEmployeeAddress());
				System.out.println(employee.getEmployeeEmail());
				System.out.println(employee.getEmployeeSalary());
				System.out.println();
			}
	}

	@Override
	public void searchEmployee(ArrayList<Employee> employees) {
		System.out.println("Please enter the employee number to find: ");
		int employeeNo = sc.nextInt();
		int found = 0;
		Iterator<Employee> itr = employees.iterator();
	    while (itr.hasNext()) {
	    	Employee employee = itr.next();
	    	if (employee.getEmployeeNo() == employeeNo) {
	    	  	System.out.println("The employee information: ");
	    	  	System.out.println(employee.getEmployeeNo());
				System.out.println(employee.getEmployeeName());
				System.out.println(employee.getEmployeeAddress());
				System.out.println(employee.getEmployeeEmail());
				System.out.println(employee.getEmployeeSalary());
				found++;
				break;
	    	}
	    }
	    if (found == 0)
			System.out.println("The Employee isn't in the list.");
	}

	@Override
	public void sortEmployees(ArrayList<Employee> employees) {
		employees.sort(new EmployeeNameComparator());
		System.out.println("The employees have been sorted by name.");
	}
}
>>>>>>> 5586e7524010cc2dbc62521a27afd735e13683cd
