package cogent_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CogentJDBCTest {
	
	public static void main(String[] args) {
		String query = "select * from employee";
		String connectionUrl = "jdbc:mysql://localhost:3306/cogent";
		try (
			Connection conn = DriverManager.getConnection(connectionUrl, "root", "Cogent@123");
			PreparedStatement pstmt =  conn.prepareStatement(query);
				
		){
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println("Employee id: " + rs.getInt("emp_num"));
				System.out.println("Employee name: " + rs.getString("emp_name"));
				System.out.println("Employee salary: " + rs.getInt("emp_sal"));
			}

			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}