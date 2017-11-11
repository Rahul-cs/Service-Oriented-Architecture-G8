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

public class PaymentsParserDOM {
	
public void PaymentParser()
{

DriverConnection connect = new DriverConnection();
String st1 = "DROP TABLE IF EXISTS Payments;";
String st = " CREATE TABLE Payments(PaymentID varchar(10) NOT NULL, OrderID varchar(10) DEFAULT NULL, TransactionID varchar(10) DEFAULT NULL, PaymentMethodID varchar(10) DEFAULT NULL, PaymentAmount float DEFAULT NULL ,PaymentDate varchar(20) DEFAULT NULL, CheckNumber int DEFAULT NULL,CreditCard int DEFAULT NULL,CreditCardNumber int DEFAULT NULL,CardholdersName varchar(30) DEFAULT NULL,CreditCardExpDate varchar(15) DEFAULT NULL, CreditCardAuthorizationNumber int, PRIMARY KEY (PaymentID),FOREIGN KEY(OrderID) REFERENCES Orders(OrderID),FOREIGN KEY(TransactionID) REFERENCES Transactions(TransactionID));";
try {
	connect.getConnection().createStatement().execute(st1);
	connect.getConnection().createStatement().execute(st);
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
File file = new File("src/java/xmls/payments.xml");
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

NodeList nList = xmlDoc.getElementsByTagName("PaymentID");

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
			String sql = "INSERT INTO Payments VALUES('" + eElement.getAttribute("id") + "','" + eElement.getElementsByTagName("OrderID").item(0).getTextContent()+ "','" +eElement.getElementsByTagName("TransactionID").item(0).getTextContent()+ "','" + eElement.getElementsByTagName("PaymentMethodID").item(0).getTextContent()+ "'," + Float.parseFloat(eElement.getElementsByTagName("PaymentAmount").item(0).getTextContent())+ ",'" + eElement.getElementsByTagName("PaymentDate").item(0).getTextContent()+ "'," + Integer.parseInt(eElement.getElementsByTagName("CheckNumber").item(0).getTextContent())+ "," + Integer.parseInt(eElement.getElementsByTagName("CreditCard").item(0).getTextContent())+","+ Integer.parseInt(eElement.getElementsByTagName("CreditCardNumber").item(0).getTextContent())+",'"+ eElement.getElementsByTagName("CardholdersName").item(0).getTextContent()+"','"+ eElement.getElementsByTagName("CreditCardExpDate").item(0).getTextContent()+"',"+ Integer.parseInt(eElement.getElementsByTagName("CreditCardAuthorizationNumber").item(0).getTextContent())+");";
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
