<%-- 
    Document   : TransactionDate
    Created on : Nov 19, 2017, 4:05:41 AM
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
        <h1>Transaction date - Success!</h1>
        
               <form action="TransactionDateServlet" method="post">
 <input type="submit" value="view" style="height:40px; width:350px">
 
 <div>
      ${msg10}
     
 </div>
              
      </br>
    
<input type="submit" value="Back" onclick="document.forms[0].action = 'ServiceList.jsp'; return true;" style="height:40px; width:350px">
</form>
        
    </body>
</html>
