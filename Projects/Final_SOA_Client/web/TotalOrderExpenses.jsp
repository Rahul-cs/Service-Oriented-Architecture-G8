<%-- 
    Document   : TotalOrderExpenses
    Created on : Nov 19, 2017, 3:59:38 AM
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
        <h1>Total Order expenses - Success!</h1>
        
        <form action="TotalOrderExpenseServlet" method="post">
 <input type="submit" value="view" style="height:40px; width:350px">
 
 <div>
      ${msg9}
     
 </div>
              
      </br>
    
<input type="submit" value="Back" onclick="document.forms[0].action = 'ServiceList.jsp'; return true;" style="height:40px; width:350px">
</form>
        
    </body>
</html>
