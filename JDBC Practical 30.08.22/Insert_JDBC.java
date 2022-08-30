/*
@Author Sankhajit Roy
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

// inserting data into database

public class Insert_JDBC {                 // main class
	public static void main(String[] args) {    // main method
		// try block
		try {
			// create a connection
			Class.forName("com.mysql.cj.jdbc.Driver");
			// get connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sankha_database","root","anit@1998*07");
			// create statement
			Statement stmt = conn.createStatement();
			// inserting data into database
			stmt.executeUpdate("insert into customer values('A05','Pritha','Sen')");
			System.out.println("Inserted succesfully.");
			// close the database
			conn.close();
		// catch block
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
