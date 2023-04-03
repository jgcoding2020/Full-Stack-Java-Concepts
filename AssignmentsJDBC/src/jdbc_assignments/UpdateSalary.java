package jdbc_assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateSalary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter emp number: ");
		int emp_num = sc.nextInt();
		System.out.println("Please enter new salary: ");
		int emp_sal = sc.nextInt();
		
		String query = "UPDATE dept SET emp_sal = ? WHERE emp_no = ?";
		String connectionUrl = "jdbc:mysql://localhost:3306/cogent";
		
		try (
			Connection conn = DriverManager.getConnection(connectionUrl, "root", "Cogent@123");
			PreparedStatement pstmt = conn.prepareStatement(query);
			
		){
			pstmt.setInt(1, emp_sal);
			pstmt.setInt(2, emp_num);
			int rows = pstmt.executeUpdate();
			System.out.println("Rows updated: " + rows);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		sc.close();
	}

}
