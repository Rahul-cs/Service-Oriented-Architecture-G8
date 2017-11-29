<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
body {background-image: url("test.jpg");}
</style>
<body>
<h1 align="center">Chicago Trucking Company</h1>
<h2 align="center">List of Services</h2>

<form  class="styles">

<table align="center" cellpadding=4 cellspacing=2 border=0>
<tr bgcolor="#c8d8f8">
<td valign=top>
<input type="submit" value="Driver Details" onclick="document.forms[0].action = 'DriverDetails.jsp'; return true;" style="height:40px; width:350px"></td>
<td>
<input type="submit" name ="orderdetails" value="Order Details" onclick="document.forms[0].action = 'OrderDetails.jsp'; return true;" style="height:40px; width:350px"></td>
</tr>

<tr bgcolor="#c8d8f8">
<td valign=top>
<input type="submit" value="Truck Insurance Details" onclick="document.forms[0].action = 'TruckInsurance.jsp'; return true;"  style="height:40px; width:350px"></td>
<td>
<input type="submit" value="Order Locations" onclick="document.forms[0].action = 'LocationDetails.jsp'; return true;"  style="height:40px; width:350px"></td>
</tr>

<tr bgcolor="#c8d8f8">
<td valign=top>
<input type="submit" value="Employee Detail of a Truck" onclick="document.forms[0].action = 'EmployeeDetailsTruck.jsp'; return true;"  style="height:40px; width:350px"></td>
<td>
<input type="submit" value="Location - Max order amount" onclick="document.forms[0].action = 'MaxOrderLocation.jsp'; return true;"  style="height:40px; width:350px"></td>
</tr>

<tr bgcolor="#c8d8f8">
<td valign=top>
<input type="submit" value="Loyal Customer Details" onclick="document.forms[0].action = 'LoyalCustomerDetails.jsp'; return true;"  style="height:40px; width:350px"></td>
<td>
<input type="submit" value="Payment Details" onclick="document.forms[0].action = 'PaymentDetails.jsp'; return true;"  style="height:40px; width:350px"></td>
</tr>

<tr bgcolor="#c8d8f8">
<td valign=top>
<input type="submit" value="Total Order and Expenses" onclick="document.forms[0].action = 'TotalOrderExpenses.jsp'; return true;"  style="height:40px; width:350px"></td>
<td>
<input type="submit" value="Transaction Date" onclick="document.forms[0].action = 'TransactionDate.jsp'; return true;"  style="height:40px; width:350px"></td>
</tr>


</table>
<div align="center">
    <input type="submit" value="Logout" onclick="document.forms[0].action = 'login.jsp'; return true;"  style="height:40px; width:350px"></td>
</div>
</form>

</body>
</html>