package com.test.multipleRecord;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentUpdate {
	private void getStudentDetails(String name, String city, String salary) throws SQLException {
		Connection connection = null;
		PreparedStatement pre = null;
		
		try {
		ConnectionTest connectionTest = new ConnectionTest();
		 connection = connectionTest.getConnectionTest();
         pre = connection.prepareStatement("INSERT INTO student (name, city, salary) VALUES (?,?,?)");
		pre.setString(1, name);
		pre.setString(2, city);
		pre.setString(3, salary);
		
		int in =  pre.executeUpdate();
		System.out.println("Insertion completed " + in);
		
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		} finally {
			connection.close();
			pre.close();
		}
	}
	
	public static void main(String[] args) throws SQLException {
		for (int i = 0; i<= 2; i++) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the name");
		String name = scanner.next();
		System.out.println("Enter the city");
		String city = scanner.next(); 
		System.out.println("Enter the salary");
		String salary = scanner.next();
		
		StudentUpdate studentUpdate = new StudentUpdate();
		studentUpdate.getStudentDetails(name, city, salary);
		}
		
		
		
	}

}
