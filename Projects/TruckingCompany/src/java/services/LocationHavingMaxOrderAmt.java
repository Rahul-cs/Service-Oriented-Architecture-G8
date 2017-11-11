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
@WebService(serviceName = "LocationHavingMaxOrderAmt")
public class LocationHavingMaxOrderAmt {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "LocationHavingMaxOrderAmt")
    public String LocationHavingMaxOrderAmt() {
         DriverConnection connect = new DriverConnection();
        //customers cust=new customers();
        String query="select l.locName,l.locationCode from pricing p,orders o,locations l where p.CustomerID= o.CustomerID and l.locationId =p.locationIDFrom and o.OrderTotalAmount= (select max(OrderTotalAmount) from orders);";
        String details ="Details are :\n ";
        try {
			Statement statement = connect.getConnection().createStatement();
                        ResultSet resultSet = statement.executeQuery(query);
                        while (resultSet.next()) {
                            details= details+"Location Name - "+ resultSet.getString(1)+" Location Code- "+ resultSet.getString(2);
                        }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return details;
    
    }
}
