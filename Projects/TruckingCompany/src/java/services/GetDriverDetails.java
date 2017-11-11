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
@WebService(serviceName = "GetDriverDetails")
public class GetDriverDetails {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "GetDriverDetails")
    public String GetDriverDetails() {
        DriverConnection connect = new DriverConnection();
        //customers cust=new customers();
        String query="select Firstname,LastName,Email,DriverLicenseNumber from employees where jobtitle='Driver';";
        String deatils ="Details are :\n ";
        try {
			Statement statement = connect.getConnection().createStatement();
                        ResultSet resultSet = statement.executeQuery(query);
                        while (resultSet.next()) {
                            deatils= deatils+"FirstName-"+ resultSet.getString(1)+" LastName-"+ resultSet.getString(2)+" Email-"+resultSet.getString(3)+" DriverLicenseNumber - "+resultSet.getString(4);
                        }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return deatils;
    }
}
