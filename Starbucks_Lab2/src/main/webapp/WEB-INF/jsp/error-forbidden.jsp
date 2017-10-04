<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true" %>
  
<% response.setStatus(403); %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
 "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>403 error</title>
  </head>
  <body>

<center>

<img src= "resources/images/403-forbidden-error.jpg"   alt="Page not found  JSP!!!"  />
 
<H2>${requestScope['javax.servlet.error.message']}</H2>
 
 <form  action="login.do">
	<input type="submit" value="Back">
</form>
</center> 
  </body>
</html>