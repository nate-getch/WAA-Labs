<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<head>
<title>Starbuck's</title>
</head>
<body>
	<h2>Ask for advice about your favorite roast:</h2>
	<p />
	<form action="display" method="post">
		<label for="advice">Advice </label> 
		<select id="advice" name="adviceTitle">
			<option value="-"> --Select Advice -- </option>
			<c:forEach var="advice" items="${adviceList}">
				<option value="${advice.adviceTitle}">${advice.adviceTitle}</option>
			</c:forEach>
		</select>
		<button type="submit">GO</button>
	</form>

</body>
</html>