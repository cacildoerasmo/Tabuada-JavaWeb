<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP - Tabuada</title>

	<style>
	
	p{
	text-align: center;
	}
	
	h1{
	text-align: center;
	}
	
	</style>

</head>
<body>
   <h1>Tabuada</h1>
   

   <%
    int i = 7;
   
   for(int x = 1; x < 11; x++) {
	   
	   out.println("<p>" + x + " x " + i + " = " + i * x + "</p>");
	   
   }
   
   %>

   


</body>
</html>