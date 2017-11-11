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
@WebService(serviceName = "InsuranceDetailsForTruck")
public class InsuranceDetailsForTruck {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "InsuranceDetailsForTruck")
    public String InsuranceDetailsForTruck() {
         DriverConnection connect = new DriverConnection();
        //customers cust=new customers();
        String query="select t.truckNo, AmountSpent ,DatePurchased from expenses e, trucks t where e.employeeID= t.EmployeeID and t.truckNo='Truck003' and ExpenseType='Truck Insurance';";
        String details ="Details are :\n ";
        try {
			Statement statement = connect.getConnection().createStatement();
                        ResultSet resultSet = statement.executeQuery(query);
                        while (resultSet.next()) {
                            details= details+"TruckNo -"+ resultSet.getString(1)+" Insurance Amount - "+ resultSet.getString(2)+" Date Purchased- "+resultSet.getString(3);
                        }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return details;
    
    }
}
