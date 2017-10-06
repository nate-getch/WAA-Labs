<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<style type="text/css">@import url(resources/css/main.css);</style>
<title>Calculator</title>
</head>
<body>
	<div class="container">
	<h2>Calculator</h2>
	<hr/>
	<c:if test="${errors != null}">
     <p id="errors">
         Error(s)!
        <ul>
	        <c:forEach var="error" items="${errors}">
	            <li>${error}</li>
	        </c:forEach>
	    </ul>
 	</c:if>
 	
	<form action='calc2' method='post'>
		<input type='text' size='2' name='num1' value="${calculator.num1}" /> +
		<input type='text' size='2' name='num2' value="${calculator.num2}" /> =
		<input type='text' size='4' name='sum' value="${calculator.sum}" readonly /> <br />  
		<br />
		<input type='text' size='2' name='num3' value="${calculator.num3}" /> *
		<input type='text' size='2' name='num4' value="${calculator.num4}" /> =
		<input type='text' size='4' name='product' value="${calculator.product}" readonly /><br />  <br />
		
		<input  class="btn btn-primary" type='submit' value='Submit' />
	</form>
	</div>
</body>
</html>