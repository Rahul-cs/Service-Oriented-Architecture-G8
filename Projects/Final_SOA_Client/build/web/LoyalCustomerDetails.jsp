<%-- 
    Document   : LoyalCustomerDetails
    Created on : Nov 19, 2017, 3:45:21 AM
    Author     : Rahul's
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Loyal Customer Details - Success!</h1>
                                <form action="LoyalCustomerInfoServlet" method="post">
 <input type="submit" value="view" style="height:40px; width:350px">
 
 <div>
      ${msg7}
     
 </div>
              
      </br>
    
<input type="submit" value="Back" onclick="document.forms[0].action = 'ServiceList.jsp'; return true;" style="height:40px; width:350px">
</form>
        
        
    </body>
</html>
