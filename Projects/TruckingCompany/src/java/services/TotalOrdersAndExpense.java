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
@WebService(serviceName = "TotalOrdersAndExpense")
public class TotalOrdersAndExpense {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "TotalOrdersAndExpense")
    public String TotalOrdersAndExpense() {
        DriverConnection connect = new DriverConnection();
        //customers cust=new customers();
        String query="select customerId, count(orderId), sum(ordertotalamount) from orders  where customerid='103'group by customerId;";
        String details ="Details are :\n ";
        try {
			Statement statement = connect.getConnection().createStatement();
                        ResultSet resultSet = statement.executeQuery(query);
                        while (resultSet.next()) {
                            details= details+"customerId -"+ resultSet.getString(1)+" Total number of orders- "+ resultSet.getString(2)+" Total order amount- "+resultSet.getString(3);
                        }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return details;
    }
}
