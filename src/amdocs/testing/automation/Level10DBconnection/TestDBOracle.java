package amdocs.testing.automation.Level10DBconnection;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDBOracle {

	public static String sUserName;
	public static String sPassword;
	public static String sConnURL;
	public static DatabaseMetaData dbmd;
	public static String dbName,dbVersion,dbUrl,uName,driverName;
	public static void main(String[] args) {
	
		Connection ret = null;
		Statement stmnt = null;
		ResultSet resultset = null;
	
		sUserName="ASTAPPC";
		sPassword="cesdb90";
		sConnURL="jdbc:oracle//10.214.201.11:1521/PLBABP90";
	
		//URL is of format jdbc:< dbtype>://ipaddress:portnumber/db_name"
			//<dbtype>- The driver for the database you are trying to connect. To connect to oracle database this value will be "oracle"

			//For connecting to database with name "emp" in MYSQL URL will bejdbc:mysql://localhost:3036/emp
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1 - I am here");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			ret  = DriverManager.getConnection(sConnURL, sUserName, sConnURL);
			System.out.println("2 - I am here");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	//	public DatabaseMetaData dbmd;
		try {
			dbmd = ret.getMetaData();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//String dbName;
		try {
			dbName = dbmd.getDatabaseProductName();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	//	String dbVersion;
		try {
			dbVersion = dbmd.getDatabaseProductVersion();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//String dbUrl;
		try {
			dbUrl = dbmd.getURL();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	//	String uName;
		try {
			uName = dbmd.getUserName();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	//	String driverName;
		try {
			driverName = dbmd.getDriverName();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Database Name is " + dbName);
		
		System.out.println("Database Version is " + dbVersion);
		
		System.out.println("Database Connection Url is " + dbUrl);
		
		System.out.println("Database User Name is " + uName);
		
		System.out.println("Database Driver Name is " + driverName);
		
	}
}
