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
@WebService(serviceName = "PayementDetailsofInvoice")
public class PayementDetailsofInvoice {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "PayementDetailsofInvoice")
    public String PayementDetailsofInvoice() {
        DriverConnection connect = new DriverConnection();
        //customers cust=new customers();
        String query="select PaymentMethodID,PaymentAmount,PaymentDate,CardholdersName from payments p, invoices v where p.paymentID=v.paymentID and Invoicenumber_ID='IN002';";
        String deatils ="Details are :\n ";
        try {
			Statement statement = connect.getConnection().createStatement();
                        ResultSet resultSet = statement.executeQuery(query);
                        while (resultSet.next()) {
                            deatils= deatils+"Payment Method - "+ resultSet.getString(1)+" Amount- "+ resultSet.getString(2)+" Payment Date- "+resultSet.getString(3)+" Name - "+resultSet.getString(4);;
                        }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return deatils;
    }
}
