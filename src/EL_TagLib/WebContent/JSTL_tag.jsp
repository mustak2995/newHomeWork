<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:set  var="i"  value="10" scope="application"></c:set>

<h1>Value is:<c:out  value="${i}"></c:out></h1>

<c:remove var="i"></c:remove>

<h1>Value is:<c:out  value="${i}"></c:out></h1>

<c:set  var="k"  value="20" scope="application"></c:set>

<c:if test="${k==30}">

<h1>Welcome to jstl</h1>

</c:if>



<%-- <c:redirect url="https://meet.google.com/"></c:redirect> --%>


<!--  switch tag -->
<c:set  var="z"  value="3" scope="application"></c:set>

<c:choose>

		<c:when test="${z==1}">
		<h1>Sum logic</h1>
		</c:when>
		
		<c:when test="${z==2}" >
		<h1>Multipication</h1>
		</c:when>
		
		<c:otherwise>
		<h1>Wrong input</h1>
		<h2>deafult case</h2>
		</c:otherwise>

</c:choose>


<!-- for reac tag -->
<c:forEach var="t" begin="10" end="20">

Value is:<c:out value="${t}"></c:out>
<br>
</c:forEach>





</body>
</html>