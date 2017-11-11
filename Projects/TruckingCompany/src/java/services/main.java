/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;
import java.sql.*;

/**
 *
 * @author pallu
 */
public class main {
    
    public static void main(String[] args){
        DriverConnection connect = new DriverConnection();
        //customers cust=new customers();
        String query="select Firstname,lastname,cellphone,jobtitle,DriverLicenseNumber from employees, trucks where employees.employeeid= trucks.employeeid and truckno='Truck002';";
        try {
			Statement statement = connect.getConnection().createStatement();
                        ResultSet resultSet = statement.executeQuery(query);
                        while (resultSet.next()) {
                            System.out.println("name-"+resultSet.getString("Firstname"));
                            System.out.println("name-"+resultSet.getString("lastname"));
                        }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }
        
    }
    

