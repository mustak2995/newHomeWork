<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
    <%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:set var="name" value="Welcome to jstl" >
</c:set>

<h1>Length is:<c:out  value="${fn:length(name)}">
</c:out>
</h1>


<h1>Uppercser:<c:out value="${fn:toUpperCase(name)}"></c:out></h1>


<c:set var="name1" value="WELCOME">
</c:set>

<h1>Uppercser:<c:out value="${fn:toLowerCase(name1)}"></c:out></h1>

</body>
</html>