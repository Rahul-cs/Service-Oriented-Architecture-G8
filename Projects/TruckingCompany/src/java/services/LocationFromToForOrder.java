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
@WebService(serviceName = "LocationFromToForOrder")
public class LocationFromToForOrder {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "LocationFromToForOrder")
    public String LocationFromToForOrder() {
        DriverConnection connect = new DriverConnection();
        //customers cust=new customers();
        String query="select locationNameFrom, locationNameto from pricing p, orders o where p.CustomerID=o.CustomerID and o.OrderID='Order003';";
        String details ="Details are :\n ";
        try {
			Statement statement = connect.getConnection().createStatement();
                        ResultSet resultSet = statement.executeQuery(query);
                        while (resultSet.next()) {
                            details= details+"LocationName From - "+ resultSet.getString(1)+" LocationName To- "+ resultSet.getString(2);
                        }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return details;
    }
}
