package com.cogent.spring_jdbc.employee.test;

import java.util.List;

import java.util.ListIterator;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.cogent.spring.spring_jdbc.employee.dao_impl.EmployeeDAOImpl;
import com.cogent.spring.spring_jdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/cogent/spring_jdbc/employee/test/config.xml");
		EmployeeDAOImpl empDAO = (EmployeeDAOImpl)ctx.getBean("employeeDAOImpl");
		
		int choice = 0;
		
		try (
			Scanner sc = new Scanner(System.in);
		){
			do {
				System.out.println("***************Menu***************");
				System.out.println("Please enter a number:");
				System.out.println("1 -> Add employee");
				System.out.println("2 -> Read single employee");
				System.out.println("3 -> Read all employees");
				System.out.println("4 -> Update employee");
				System.out.println("5 -> Delete employee");
				System.out.println("6 -> Exit");
				choice = sc.nextInt();
				sc.nextLine();
				
				switch (choice) {
				case 1:
					Employee emp = new Employee();
					System.out.println("Enter employee number:");
					emp.setId(sc.nextInt());
					sc.nextLine();
					System.out.println("Enter employee first name:");
					emp.setfName(sc.nextLine());
					System.out.println("Enter employee last name:");
					emp.setlName(sc.nextLine());
					System.out.println("Would you like to save this employee?");
					System.out.println("1 -> Yes");
					System.out.println("2 -> No");
					choice = sc.nextInt();
					if (choice == 1) {
						int result = empDAO.create(emp);
						if (result != 0)
							System.out.println("Employee details have been saved.");
						else
							System.out.println("The employee details were not saved.");
					}
					else
						System.out.println("The employee details were not saved.");
					break;
				case 2:
					System.out.println("Enter id of employee to view:");
					int id = sc.nextInt();
					sc.nextLine();
					Employee result = empDAO.read(id);
					System.out.println(result);
					break;
				case 3:
					System.out.println("List of all employees:");
					List<Employee> resultList = empDAO.read();
					ListIterator<Employee> empList = resultList.listIterator();
					
					while (empList.hasNext()) {
						System.out.println(empList.next());
					}
					break;
				case 4:
					Employee empToUpdate = new Employee();
					System.out.println("Enter employee number:");
					empToUpdate.setId(sc.nextInt());
					sc.nextLine();
					System.out.println("Enter employee first name:");
					empToUpdate.setfName(sc.nextLine());
					System.out.println("Enter employee last name:");
					empToUpdate.setlName(sc.nextLine());
					System.out.println("Would you like to save this employee?");
					System.out.println("1 -> Yes");
					System.out.println("2 -> No");
					choice = sc.nextInt();
					sc.nextLine();
					if (choice == 1) {
						int updateResult = empDAO.update(empToUpdate);
						if (updateResult != 0)
							System.out.println("Employee details have been saved.");
						else
							System.out.println("The employee details were not saved.");
					}
					else
						System.out.println("The employee details were not saved.");
					break;
				case 5:
					System.out.println("Enter id of employee to delete:");
					int id2 = sc.nextInt();
					Employee empToDelete = empDAO.read(id2);
					int deleteResult = empDAO.delete(empToDelete);
					if (deleteResult != 0)
						System.out.println("Employee details were deleted.");
					else
						System.out.println("The employee details were not deleted.");
					break;
				}
			} while (choice != 6);
			((ClassPathXmlApplicationContext) ctx).close();
			System.out.println("You have successfully exited!!!");
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
