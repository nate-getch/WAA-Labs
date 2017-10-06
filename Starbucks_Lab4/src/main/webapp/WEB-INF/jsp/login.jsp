<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%--@page errorPage="loginerror.jsp"--%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Login</title>
</head>
<body>

	<h2>Ask for advice about your favorite roast:</h2>
	<p />
	<form action="action/advice" method="get">
		<select name="roast" disabled="disabled">
			<option value="dark">Dark</option>
			<option value="medium">Medium</option>
			<option value="light">Light</option>
		</select> <br /> <br /> <input type="submit" value="Submit"
			disabled="disabled" />
	</form>

	<p />

	<form action="login" method="post">
		<p>Login:</p>
		<c:if test="${error != null}">
			<p id="errors">Error: ${error}</p>
		</c:if>
		<p>
			Name : <input type="text" id="name" name="name" />
		</p>
		<p>
			Password : <input type="password" id="password" name="password" />
		</p>
		<p>
			<input type="submit" value="login" />
		</p>
	</form>
</body>
</html>