package amdocs.testing.automation.Level10DBconnection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class TestDB {

	//forName(“com.mysql.jdbc.Driver”);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		
		Statement stmnt = null;
		
		ResultSet resultset = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("I am here 1");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			conn = (Connection) DriverManager.getConnection("jdbc:mysql://PLBABP90:1521/plbdb01", "ASTAPPC", "cesdb90");
			System.out.println("I am here 2");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			resultset = (ResultSet) conn.createStatement();
			System.out.println("I am here 3");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			resultset = stmnt.executeQuery("select account_id from ar1_account where account_id = '92211339'");
			System.out.println("I am here 4");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			while (resultset.next()) {
				try {
					System.out.println(resultset.getInt(0));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
