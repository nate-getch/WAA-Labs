<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Save Product</title>
<style type="text/css">
@import url(css/main.css);
</style>
</head>
<body>
	<div id="global">
		<h4><spring:message code="product.saved" /></h4>

		<h5><spring:message code="product.details" /></h5>
		<spring:message code="product.name" /> ${product.name}<br /> 
		<spring:message code="product.category" /> ${product.category.name}<br />
		<spring:message code="product.description" /> ${product.description}<br /> 
		Price: $${product.price}

		<form action="listproducts" method="get">
			<input id="submit" type="submit" value="List products">
		</form>

	</div>
</body>
</html>