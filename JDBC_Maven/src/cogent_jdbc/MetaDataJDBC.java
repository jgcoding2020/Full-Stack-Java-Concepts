package cogent_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class MetaDataJDBC {

	public static void main(String[] args) {
		String query = "select * from employee";
		String connectionUrl = "jdbc:mysql://localhost:3306/cogent";
		
		try(
				Connection conn = DriverManager.getConnection(connectionUrl, "root", "Cogent@123");	
		){
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			ResultSetMetaData rsmd = rs.getMetaData();
			int numberOfColumns = rsmd.getColumnCount();
			System.out.println("Total number of columns: " + numberOfColumns);
			
			for (int i = 1; i < numberOfColumns; i++) {
				String columnName = rsmd.getColumnName(i);
				System.out.println("Column number is: " + i);
				System.out.println("Column name is: " + columnName);
			}
		} catch (Exception e){
			e.printStackTrace();
		}
	}

}
