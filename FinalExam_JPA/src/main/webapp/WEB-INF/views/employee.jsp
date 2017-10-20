<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Detail</title>
</head>
<body>
	<c:if test="${employee !=null}" >
	<h3>First Name - ${employee.firstName}</h3>
	<h3>Last Name - ${employee.lastName}</h3>
	<p>Age - ${employee.age}</p>
	<p>Title - ${employee.title}</p>
	<p>NUMBER - ${employee.employeeNumber}</p>
	</c:if>
	<c:if test="${employee == null }"> Employee Not Found :( </c:if>
</body>
</html>