package jdbc_assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRecord {

	public static void main(String[] args) {
		String query = "insert into DEPT(dept_name, emp_no, emp_name, emp_sal) values (1, 2, 'Susan', 10000)";
		String connectionUrl = "jdbc:mysql://localhost:3306/cogent";
		
		try (
				Connection conn = DriverManager.getConnection(connectionUrl, "root", "Cogent@123");
				Statement stmt = conn.createStatement();
		){
			int rows = stmt.executeUpdate(query);
			System.out.println("Rows updated: " + rows);
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
