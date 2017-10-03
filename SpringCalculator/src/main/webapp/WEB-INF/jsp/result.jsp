<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<style type="text/css"> @import url(resources/css/main.css);
</style>
<title>Result</title>
</head>
<body>
	<div class="container">
		<h2>Result</h2>
		<hr/>
		<form >
			<input readonly type='text' size='2' name='num1' value="${calculator.num1}" /> +
			<input readonly type='text' size='2' name='num2' value="${calculator.num2}" /> =
			<input type='text' size='4' name='sum' value="${calculator.sum}"
				readonly /> <br /> 
			<input readonly type='text' size='2' name='num3'
				value="${calculator.num3}" /> *
			<input readonly type='text' size='2'
				name='num4' value="${calculator.num4}" /> =
			<input type='text'
				size='4' name='product' value="${calculator.product}" readonly /><br /><br />
			<a href="/SpringCalculator/" class="btn btn-primary">Go Back</a>
		</form>
	</div>
</body>
</html>