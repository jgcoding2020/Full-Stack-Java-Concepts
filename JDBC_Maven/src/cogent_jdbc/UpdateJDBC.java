package cogent_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateJDBC {

	public static void main(String[] args) {
		String query = "insert into employee(emp_num, emp_name, emp_sal) values (1003, 'Shiva', 1000)";
		String connectionUrl = "jdbc:mysql://localhost:3306/cogent";
		
		try (
			Connection conn = DriverManager.getConnection(connectionUrl, "root", "Cogent@123");
			Statement stmt = conn.createStatement();
				
		){
			int rows = stmt.executeUpdate(query);
			System.out.println("Rows updated: " + rows);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
