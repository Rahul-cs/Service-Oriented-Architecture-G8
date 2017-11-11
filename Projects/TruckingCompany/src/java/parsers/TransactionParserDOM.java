package parsers;
import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import services.DriverConnection;

public class TransactionParserDOM {
	
public void TransactionParser()
{

DriverConnection connect = new DriverConnection();
String st1 = "DROP TABLE IF EXISTS Transactions;";
String st = " CREATE TABLE Transactions(transactionID varchar(10) NOT NULL,OrderID varchar(10) DEFAULT NULL,priceID varchar(10) DEFAULT NULL,transactionDate varchar(15) DEFAULT NULL,transactionDescription varchar(30) DEFAULT NULL ,transactionAmount float DEFAULT NULL,make varchar(20), model varchar(15), year int, employeeID varchar(10), truckNo varchar(10), discount float, quantity int, unitPrice float, driverPrice float, vin varchar(10), runNumber varchar(15), special varchar(10), rate float, surcharge float ,PRIMARY KEY (transactionID),FOREIGN KEY(OrderID) REFERENCES Orders(OrderID),FOREIGN KEY(priceID) REFERENCES pricing(priceID),FOREIGN KEY(employeeID) REFERENCES employees(EmployeeId),FOREIGN KEY(truckNo) REFERENCES trucks(TruckNo));";
try {
	connect.getConnection().createStatement().execute(st1);
	connect.getConnection().createStatement().execute(st);
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
File file = new File("src/java/xmls/transactions.xml");
DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
DocumentBuilder builder = null;
try {
	builder = factory.newDocumentBuilder();
} catch (ParserConfigurationException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
Document xmlDoc = null;
try {
	xmlDoc = builder.parse(file);
} catch (SAXException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}


xmlDoc.getDocumentElement().normalize();

System.out.println("Root element :" + xmlDoc.getDocumentElement().getNodeName());

NodeList nList = xmlDoc.getElementsByTagName("transactionID");

System.out.println("----------------------------");

for (int temp = 0; temp < nList.getLength(); temp++)
{
	Node nNode = nList.item(temp);

	System.out.println("\nCurrent Element :" + nNode.getNodeName());

	if (nNode.getNodeType() == Node.ELEMENT_NODE) 
	{
		Element eElement = (Element) nNode;
		
		
		

		//System.out.println("Customer id : " + eElement.getAttribute("id"));
		//System.out.println("Title : " + eElement.getElementsByTagName("TruckNo").item(0).getTextContent());
		//System.out.println("BusinessName : " + eElement.getElementsByTagName("BusinessName").item(0).getTextContent());
		//System.out.println("City: " + eElement.getElementsByTagName("City").item(0).getTextContent());
		//System.out.println("state : " + eElement.getElementsByTagName("State").item(0).getTextContent());
		//System.out.println("City: " + eElement.getElementsByTagName("PostalCode").item(0).getTextContent());
		//System.out.println("state : " + eElement.getElementsByTagName("Country").item(0).getTextContent());
		//System.out.println("City: " + eElement.getElementsByTagName("PhoneNumber").item(0).getTextContent());
		//System.out.println("state : " + eElement.getElementsByTagName("CellNumber").item(0).getTextContent());
		//System.out.println("City: " + eElement.getElementsByTagName("OtherNumber").item(0).getTextContent());
		//System.out.println("state : " + eElement.getElementsByTagName("FaxNumber").item(0).getTextContent());
		//System.out.println("City: " + eElement.getElementsByTagName("EmailAddress").item(0).getTextContent());
		//System.out.println("City: " + eElement.getElementsByTagName("Type").item(0).getTextContent());
		//System.out.println("state : " + eElement.getElementsByTagName("CompanyName").item(0).getTextContent());
		//System.out.println("City: " + eElement.getElementsByTagName("ContactName").item(0).getTextContent());
		//System.out.println("state : " + eElement.getElementsByTagName("AlternateContactName").item(0).getTextContent());
		//System.out.println("date: " + eElement.getElementsByTagName("DateEntered").item(0).getTextContent());
		
		//SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
		//String start_dt = eElement.getElementsByTagName("DateEntered").item(0).getTextContent();
		
//		DateFormat format = new SimpleDateFormat("DD/MM/YYYY"); 
	//	Date date = format.parse(start_dt);
	//	DateFormat format2 = new SimpleDateFormat("mm/dd/yyyy");
	//	String newdate = format2.format(date);
	//	SimpleDateFormat f = new SimpleDateFormat("mm/dd/yyyy");
	//	Date fd = f.parse(newdate);
		//SimpleDateFormat newFormat = new SimpleDateFormat("DD-MM-YYYY");
	//	String finalString = newFormat.format(date);
		
		
		try {
			String sql = "INSERT INTO Transactions VALUES('" + eElement.getAttribute("id") + "','" + eElement.getElementsByTagName("OrderID").item(0).getTextContent()+ "','" +eElement.getElementsByTagName("priceID").item(0).getTextContent()+ "','" + eElement.getElementsByTagName("transactionDate").item(0).getTextContent()+ "','" + eElement.getElementsByTagName("transactionDescription").item(0).getTextContent()+ "'," + Float.parseFloat(eElement.getElementsByTagName("transactionAmount").item(0).getTextContent())+ ",'" + eElement.getElementsByTagName("make").item(0).getTextContent()+ "','" + eElement.getElementsByTagName("model").item(0).getTextContent()+"','"+ eElement.getElementsByTagName("year").item(0).getTextContent()+"','"+ eElement.getElementsByTagName("employeeID").item(0).getTextContent()+"','"+ eElement.getElementsByTagName("truckNo").item(0).getTextContent()+"',"+ Float.parseFloat(eElement.getElementsByTagName("discount").item(0).getTextContent())+","+ Integer.parseInt(eElement.getElementsByTagName("quantity").item(0).getTextContent())+","+ Float.parseFloat(eElement.getElementsByTagName("unitPrice").item(0).getTextContent())+","+ Float.parseFloat(eElement.getElementsByTagName("driverPrice").item(0).getTextContent())+",'"+ eElement.getElementsByTagName("vin").item(0).getTextContent()+"','"+ eElement.getElementsByTagName("runNumber").item(0).getTextContent()+"','"+ eElement.getElementsByTagName("special").item(0).getTextContent()+"',"+ Float.parseFloat(eElement.getElementsByTagName("rate").item(0).getTextContent())+","+ Float.parseFloat(eElement.getElementsByTagName("surcharge").item(0).getTextContent())+");";
			PreparedStatement stmt = connect.getConnection().prepareStatement(sql);
			stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		
		//String test = eElement.getElementsByTagName("PhoneNumber").item(0).getTextContent();
		
	}
}

//	String test = eElement.getElementsByTagName("PhoneNumber").item(0).getTestContent();
}

}



}
