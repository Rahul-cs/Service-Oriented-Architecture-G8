/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author pallu
 */
@WebService(serviceName = "LoyalCustomerInfo")
public class LoyalCustomerInfo {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "LoyalCustomerInfo")
    public String LoyalCustomerInfo() {
        
        DriverConnection connect = new DriverConnection();
        //customers cust=new customers();
        String query="select CustomerTitle,ContactName,BusinessName from customers where customerType='Loyal';";
        String deatils ="Details are :\n ";
        try {
			Statement statement = connect.getConnection().createStatement();
                        ResultSet resultSet = statement.executeQuery(query);
                        while (resultSet.next()) {
                            deatils= deatils+"CustomerTitle - "+ resultSet.getString(1)+" Name- "+ resultSet.getString(2)+" Business Name- "+resultSet.getString(3);
                        }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return deatils;
    }
}
