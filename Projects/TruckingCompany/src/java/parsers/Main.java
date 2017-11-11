package parsers;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.DOMException;
import org.xml.sax.SAXException;

import services.DriverConnection;

public class Main {

public static void main(String[] args) throws ParserConfigurationException,
	
    SAXException, IOException, DOMException, ParseException {
	
	DriverConnection connect = new DriverConnection();
	String st1 = "DROP TABLE IF EXISTS COMMENTS;";
	String st2 = "DROP TABLE IF EXISTS INVOICES;";
	String st3 = "DROP TABLE IF EXISTS PAYMENTS;";
	String st4 = "DROP TABLE IF EXISTS TRANSACTIONS;";
	String st5 = "DROP TABLE IF EXISTS PRICING;";
	String st6 = "DROP TABLE IF EXISTS ORDERS;";
	String st7 = "DROP TABLE IF EXISTS LOCATIONS;";
	String st8 = "DROP TABLE IF EXISTS EXPENSES;";
	String st9 = "DROP TABLE IF EXISTS TRUCKS;";
	String st10 = "DROP TABLE IF EXISTS EMPLOYEES;";
	String st11 = "DROP TABLE IF EXISTS CUSTOMERS;";
	try {
		connect.getConnection().createStatement().execute(st1);
		connect.getConnection().createStatement().execute(st2);
		connect.getConnection().createStatement().execute(st3);
		connect.getConnection().createStatement().execute(st4);
		connect.getConnection().createStatement().execute(st5);
		connect.getConnection().createStatement().execute(st6);
		connect.getConnection().createStatement().execute(st7);
		connect.getConnection().createStatement().execute(st8);
		connect.getConnection().createStatement().execute(st9);
		connect.getConnection().createStatement().execute(st10);
		connect.getConnection().createStatement().execute(st11);

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	CustomerParserDOM cust = new CustomerParserDOM();
	cust.CustomerParser();
	
	EmployeeParserDOM emp = new EmployeeParserDOM();
	emp.EmployeeParser();
	
	TruckPraserDOM tru = new TruckPraserDOM();
	tru.TruckParser();
	
	ExpensesParserDOM exp = new ExpensesParserDOM();
	exp.ExpensesParser();
	
	LocationParserDOM loc = new LocationParserDOM();
	loc.LocationParser();
	
	OrdersParserDOM ord = new OrdersParserDOM();
	ord.OrderParser();
	
	PricingParserDOM pri = new PricingParserDOM();
	pri.PricingParser();
	
	TransactionParserDOM tran = new TransactionParserDOM();
	tran.TransactionParser();
	
	PaymentsParserDOM pay = new PaymentsParserDOM();
	pay.PaymentParser();	
	
	InvoicesParserDOM inv = new InvoicesParserDOM();
	inv.InvoicesParser();
	
	CommentsParserDOM comm = new CommentsParserDOM();
	comm.CommentParser();
	
	System.out.println("Database and tables created... Data is populated by reading the XML by DOM PARSER!!");
}
}
