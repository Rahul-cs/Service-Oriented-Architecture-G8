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
@WebService(serviceName = "GetOrderdetails")
public class GetOrderdetails {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "GetOrderdetails")
    public String GetOrderdetails() {
        DriverConnection connect = new DriverConnection();
        //customers cust=new customers();
        String query="select Firstname,LastName,Make,Year,Model,LicensePlateNo,color,vin from employees,trucks,orders where employees.employeeID=orders.employeeid and trucks.truckno=orders.truckID and orderId='Order004';";
        String deatils ="Details are :\n ";
        try {
			Statement statement = connect.getConnection().createStatement();
                        ResultSet resultSet = statement.executeQuery(query);
                        while (resultSet.next()) {
                            deatils= deatils+"FirstName-"+ resultSet.getString(1)+" LastName-"+ resultSet.getString(2)+" Make-"+resultSet.getString(3)+" Year - "+resultSet.getString(4)+" Model - "+resultSet.getString(5)+" LicensePlateNumber - "+resultSet.getString(6)+" Color - "+resultSet.getString(7)+" vin - "+resultSet.getString(8);
                        }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return deatils;
    }
}
