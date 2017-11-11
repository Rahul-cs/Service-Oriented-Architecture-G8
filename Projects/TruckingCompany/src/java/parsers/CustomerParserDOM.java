package parsers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import services.DriverConnection;
import java.util.Date;


public class CustomerParserDOM {

	public void CustomerParser()
	{
		
		DriverConnection connect = new DriverConnection();
		String st1 = "DROP TABLE IF EXISTS Customers;";
		String st = " CREATE TABLE Customers(CustomerID varchar(10) NOT NULL,CustomerTitle varchar(10) DEFAULT NULL,BusinessName varchar(20) DEFAULT NULL,City varchar(20) DEFAULT NULL, State varchar(10) DEFAULT NULL,PostalCode int DEFAULT NULL,Country varchar(10) DEFAULT NULL,PhoneNumber double DEFAULT NULL,CellNumber double DEFAULT NULL,OtherNumber double DEFAULT NULL,FaxNumber varchar(20) DEFAULT NULL,EmailAddress varchar(30) DEFAULT NULL,CustomerType varchar(15) DEFAULT NULL,CompanyName varchar(20) DEFAULT NULL,ContactName varchar(20) DEFAULT NULL,AlternateContactName varchar(20) DEFAULT NULL,DateEntere VARCHAR(20) DEFAULT NULL,  PRIMARY KEY (CustomerID));";
		try {
			connect.getConnection().createStatement().execute(st1);
			connect.getConnection().createStatement().execute(st);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File file = new File("src/java/xmls/Customers.xml");
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null;
		try {
			builder = factory.newDocumentBuilder();
		} catch (ParserConfigurationException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
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

		NodeList nList = xmlDoc.getElementsByTagName("CustomerID");

		System.out.println("----------------------------");

		for (int temp = 0; temp < nList.getLength(); temp++)
		{
			Node nNode = nList.item(temp);

			System.out.println("\nCurrent Element :" + nNode.getNodeName());

			if (nNode.getNodeType() == Node.ELEMENT_NODE) 
			{
				Element eElement = (Element) nNode;
				
				
				

			/*	System.out.println("Customer id : " + eElement.getAttribute("id"));
				System.out.println("Title : " + eElement.getElementsByTagName("CustomerTitle").item(0).getTextContent());
				System.out.println("BusinessName : " + eElement.getElementsByTagName("BusinessName").item(0).getTextContent());
				System.out.println("City: " + eElement.getElementsByTagName("City").item(0).getTextContent());
				System.out.println("state : " + eElement.getElementsByTagName("State").item(0).getTextContent());
				System.out.println("City: " + eElement.getElementsByTagName("PostalCode").item(0).getTextContent());
				System.out.println("state : " + eElement.getElementsByTagName("Country").item(0).getTextContent());
				System.out.println("City: " + eElement.getElementsByTagName("PhoneNumber").item(0).getTextContent());
				System.out.println("state : " + eElement.getElementsByTagName("CellNumber").item(0).getTextContent());
				System.out.println("City: " + eElement.getElementsByTagName("OtherNumber").item(0).getTextContent());
				System.out.println("state : " + eElement.getElementsByTagName("FaxNumber").item(0).getTextContent());
				System.out.println("City: " + eElement.getElementsByTagName("EmailAddress").item(0).getTextContent());
				System.out.println("City: " + eElement.getElementsByTagName("Type").item(0).getTextContent());
				System.out.println("state : " + eElement.getElementsByTagName("CompanyName").item(0).getTextContent());
				System.out.println("City: " + eElement.getElementsByTagName("ContactName").item(0).getTextContent());
				System.out.println("state : " + eElement.getElementsByTagName("AlternateContactName").item(0).getTextContent());
				System.out.println("date: " + eElement.getElementsByTagName("DateEntered").item(0).getTextContent());
				*/
				//SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
				String start_dt = eElement.getElementsByTagName("DateEntered").item(0).getTextContent();
				
		//		DateFormat format = new SimpleDateFormat("DD/MM/YYYY"); 
			//	Date date = format.parse(start_dt);
			//	DateFormat format2 = new SimpleDateFormat("mm/dd/yyyy");
			//	String newdate = format2.format(date);
			//	SimpleDateFormat f = new SimpleDateFormat("mm/dd/yyyy");
			//	Date fd = f.parse(newdate);
				//SimpleDateFormat newFormat = new SimpleDateFormat("DD-MM-YYYY");
			//	String finalString = newFormat.format(date);
//				if(eElement.getElementsByTagName("PhoneNumber").item(0).getTextContent().length() >10 || eElement.getElementsByTagName("CellNumber").item(0).getTextContent().length() >10 || eElement.getElementsByTagName("OtherNumber").item(0).getTextContent().length() >10)
//					{
//					System.out.println("Phone number cannot exceed greater than 10 digits....Run the program again with valid values!!!!!!!");
//					System.exit(0);
//					}
				try {
					
					String sql = "INSERT INTO Customers VALUES('" + eElement.getAttribute("id") + "','" + eElement.getElementsByTagName("CustomerTitle").item(0).getTextContent()+ "','" +eElement.getElementsByTagName("BusinessName").item(0).getTextContent()+ "','" + eElement.getElementsByTagName("City").item(0).getTextContent()+ "','" + eElement.getElementsByTagName("State").item(0).getTextContent()+ "'," + Integer.parseInt(eElement.getElementsByTagName("PostalCode").item(0).getTextContent())+ ",'" + eElement.getElementsByTagName("Country").item(0).getTextContent()+ "'," + Double.parseDouble(eElement.getElementsByTagName("PhoneNumber").item(0).getTextContent())+ ","+Double.parseDouble(eElement.getElementsByTagName("CellNumber").item(0).getTextContent())+ ","+ Double.parseDouble(eElement.getElementsByTagName("OtherNumber").item(0).getTextContent())+",'"+eElement.getElementsByTagName("FaxNumber").item(0).getTextContent()+"','"+ eElement.getElementsByTagName("EmailAddress").item(0).getTextContent()+"','" + eElement.getElementsByTagName("Type").item(0).getTextContent()+"','"+ eElement.getElementsByTagName("CompanyName").item(0).getTextContent()+"','"+eElement.getElementsByTagName("ContactName").item(0).getTextContent()+"','"+eElement.getElementsByTagName("AlternateContactName").item(0).getTextContent()+"','"+ start_dt +"');";
					PreparedStatement stmt = connect.getConnection().prepareStatement(sql);
					stmt.executeUpdate();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				String test = eElement.getElementsByTagName("PhoneNumber").item(0).getTextContent();
				
			}
		}
	    
	//	String test = eElement.getElementsByTagName("PhoneNumber").item(0).getTestContent();
		
	}

}
