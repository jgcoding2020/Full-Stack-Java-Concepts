package jdbc_assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DisplayNameManager {

	public static void main(String[] args) {
		String query = "select emp_name, emp_manager from dept where emp_name = 'Harry'";
		String connectionUrl = "jdbc:mysql://localhost:3306/cogent"; 
		
		try(
			Connection conn = DriverManager.getConnection(connectionUrl, "root", "Cogent@123");
			PreparedStatement pstmt = conn.prepareStatement(query);
		){
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println("Employee name: " + rs.getString(1));
				System.out.println("Employee manager: " + rs.getString(2));
			}
			
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
