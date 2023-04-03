package jdbc_assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DisplayAllAnalysts {

	public static void main(String[] args) {
		String query = "select * from dept where emp_title = 'analyst'";
		String connectionUrl = "jdbc:mysql://localhost:3306/cogent"; 
		
		try(
			Connection conn = DriverManager.getConnection(connectionUrl, "root", "Cogent@123");
			PreparedStatement pstmt = conn.prepareStatement(query);
		){
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println("Dept name: " + rs.getInt(1));
				System.out.println("Emp number: " + rs.getInt(2));
				System.out.println("Emp name : " + rs.getString(3));
				System.out.println("Emp salary: " + rs.getInt(4));
				System.out.println("Emp manager: " + rs.getString(5));
				System.out.println("Emp title: " + rs.getString(6));
				System.out.println();
			}
			
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
