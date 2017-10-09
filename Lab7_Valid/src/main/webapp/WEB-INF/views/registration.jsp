<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
<div class="container">
<h1>Registration Form</h1><br />

<form:form modelAttribute="student">
  
  <form:errors path="*" />
  
  <div class="form-group">
    <label for="id">ID</label>
    <form:input path="id" id="id" /> <br/>
    <form:errors path="id" />
  </div>
  
  <div class="form-group">
    <label for="firstName">First Name</label>
    <form:input path="firstName" id="firstName" /><br/>
    <form:errors path="firstName" />
  </div>
  
   <div class="form-group">
    <label for="lastName">Last Name</label>
    <form:input path="lastName" id="lastName" /><br/>
    <form:errors path="lastName" />
  </div>
  
  <div class="form-group">
    <label for="lastName">Email</label>
    <form:input path="email" id="email" /><br/>
    <form:errors path="email" />
  </div>
  
  <div class="form-group">
    <label for="phone">Phone</label>
    <form:input path="phone.area" id="Phone" />
    <form:input path="phone.prefix"  />
    <form:input path="phone.number" />
    <br/>
    <form:errors path="phone" />
  </div>
  
  <button type="submit" class="btn btn-default">Submit</button>
</form:form>
</div>
</body>
</html>