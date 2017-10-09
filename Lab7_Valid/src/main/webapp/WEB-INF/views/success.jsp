<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SUCCESS</title>
</head>
<body>

   <h2>Student Save successfully</h2>

  <p>
       Student Id: ${student.id}<br>
       Student FirstName: ${student.firstName}<br>
       Student LastName: ${student.lastName}<br>
       Student Email: ${student.email}<br> 
       Student Phone: ${student.phone.area}-${student.phone.prefix}-${student.phone.number}<br> 
       
  </p>
</body>
</html>