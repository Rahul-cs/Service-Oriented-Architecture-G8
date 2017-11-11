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

public class InvoicesParserDOM {

public void InvoicesParser()
	{

DriverConnection connect = new DriverConnection();
String st1 = "DROP TABLE IF EXISTS Invoices;";
String st = " CREATE TABLE Invoices(Invoicenumber_ID varchar(10) NOT NULL,paymentID varchar(10) DEFAULT NULL,name varchar(10) DEFAULT NULL,company varchar(30) DEFAULT NULL, street varchar(50) DEFAULT NULL ,description varchar(50) DEFAULT NULL,price float DEFAULT NULL,quantity int DEFAULT NULL,PRIMARY KEY (Invoicenumber_ID),FOREIGN KEY(paymentID) REFERENCES payments(PaymentID));";
try {
	connect.getConnection().createStatement().execute(st1);
	connect.getConnection().createStatement().execute(st);
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
File file = new File("src/java/xmls/invoices.xml");
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

NodeList nList = xmlDoc.getElementsByTagName("Invoicenumber_ID");

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
			String sql = "INSERT INTO Invoices VALUES('" + eElement.getAttribute("id") + "','" + eElement.getElementsByTagName("paymentID").item(0).getTextContent()+ "','" +eElement.getElementsByTagName("name").item(0).getTextContent()+ "','" + eElement.getElementsByTagName("company").item(0).getTextContent()+ "','" + eElement.getElementsByTagName("street").item(0).getTextContent()+ "','" + eElement.getElementsByTagName("description").item(0).getTextContent()+ "'," + Float.parseFloat(eElement.getElementsByTagName("price").item(0).getTextContent())+ "," + Integer.parseInt(eElement.getElementsByTagName("quantity").item(0).getTextContent())+");";
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
