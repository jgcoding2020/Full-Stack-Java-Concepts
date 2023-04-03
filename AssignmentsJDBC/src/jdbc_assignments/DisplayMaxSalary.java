package jdbc_assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DisplayMaxSalary {

	public static void main(String[] args) {
		String query = "select emp_name from dept where emp_sal = (select max(emp_sal) from dept where dept_name = 30)";
		String connectionUrl = "jdbc:mysql://localhost:3306/cogent"; 
		
		try(
			Connection conn = DriverManager.getConnection(connectionUrl, "root", "Cogent@123");
			PreparedStatement pstmt = conn.prepareStatement(query);
		){
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString(1));
			}
			
		} catch (Exception e){
			e.printStackTrace();
		}

	}

}










