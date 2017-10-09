<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello Kemosabe!!!  
</h1>

<p>

<button onclick="window.location='<spring:url value="/registration" />' ">
     Student Registration</button>

</p>
</body>
</html>
