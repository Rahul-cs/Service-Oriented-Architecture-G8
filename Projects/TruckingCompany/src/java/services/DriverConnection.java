/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author pallu
 */
public class DriverConnection {
    
    public Connection getConnection() {

			System.out.println("-------- MySQL JDBC Connection Testing ------------");

			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				System.out.println("Where is your MySQL JDBC Driver?");
				e.printStackTrace();
				return null;
			}

			System.out.println("MySQL JDBC Driver Registered!");
			Connection connection = null;

			try {
				connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/TruckingCompany","root","root");

			} catch (SQLException e) {
				System.out.println("Connection Failed! Check output console");
				e.printStackTrace();
				return null;
			}

			if (connection != null) {
				System.out.println("You made it, take control your database now!");
				
			} else {
				System.out.println("Failed to make connection!");
			}
			
			return connection;
		  }
	  
    
}
