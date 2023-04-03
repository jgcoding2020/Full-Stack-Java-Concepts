package callable_statements;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class DepartmentName {

	public static void main(String[] args) {
		String sql = "call proc_dname(?)";
		String connectionUrl = "jdbc:mysql://localhost:3306/cogent";

		try (
			Scanner sc = new Scanner(System.in);
			Connection conn = DriverManager.getConnection(connectionUrl, "root", "Cogent@123");
		){
			System.out.println("Please enter employee number: ");
			int emp_no = sc.nextInt();
			CallableStatement stmt = conn.prepareCall(sql);
			stmt.setInt(1, emp_no);
			ResultSet rs = stmt.executeQuery();
				
			while(rs.next()) {
				System.out.println("Department name: " + rs.getInt("dept_name"));
			}
				
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
