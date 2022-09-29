package com.test.multipleRecord;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDemo {
	
	public Connection getConnectionDemo() {
		Connection connection = null;
		try {
		//load the Driver class
		Class.forName("com.mysql.jdbc.Driver");
		//Establish the connection
		 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Root");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
		
	}
	

}
