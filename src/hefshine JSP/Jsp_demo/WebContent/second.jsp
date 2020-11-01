<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<%
	
	String uname=request.getParameter("username");
	
 	String password=request.getParameter("pasword"); 
 	
 	if(uname.equals("Ravi"))
 		response.sendRedirect("https://www.javatpoint.com/");

%>

Username is:<%= uname %>




</body>
</html>