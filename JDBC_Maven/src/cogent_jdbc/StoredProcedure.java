package cogent_jdbc;

import java.sql.*;
import java.sql.CallableStatement;

public class StoredProcedure {
	
	public static void main(String[] args) {

		String sql = "call retrieve_person";
		String connectionUrl = "jdbc:mysql://localhost:3306/cogentdb";
		
		try (
			Connection conn = DriverManager.getConnection(connectionUrl, "root", "Cogent@123");
				
		){
			CallableStatement stmt = conn.prepareCall(sql);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				System.out.println("ID: " + rs.getInt(1));
				System.out.println("Name: " + rs.getString(2));
				System.out.println("Salary: " + rs.getString(3));
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}