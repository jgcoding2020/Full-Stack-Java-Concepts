package assessment_two;
import java.util.ArrayList;

public interface EmployeeDAO {

	public void createEmployee(ArrayList<Employee> employees);
	public void updateEmployee(ArrayList<Employee> employees);
	public void deleteEmployee(ArrayList<Employee> employees);
	public void readAllEmployees(ArrayList<Employee> employees);
	public void searchEmployee(ArrayList<Employee> employees);
	public void sortEmployees(ArrayList<Employee> employees);
	
}
