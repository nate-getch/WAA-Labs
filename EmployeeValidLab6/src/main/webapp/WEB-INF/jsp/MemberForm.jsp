<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Add Employee Form</title>
<link rel="stylesheet" type="text/css" href="<c:url value="/css/main.css"/>">
</head>
<body>

	<div id="global">
		<form:form modelAttribute="member">
			<fieldset>
				<legend>Add an employee</legend>
				<p>
					<form:errors path="*" cssStyle="color : red;" />
				</p>
				<p>
					<label for="firstName">First Name: </label>
					<form:input path="firstName" />
					<div style="text-align: center;">
						<form:errors path="firstName" cssStyle="color : red;" />
					</div>
				</p>
				<p>
					<label for="lastName">Last Name: </label>
					<form:input path="lastName" />
					<div style="text-align: center;">
						<form:errors path="lastName" cssStyle="color : red;" />
					</div>
				</p>

				<p>
					<label for="memberNumber">Member Number: </label>
					<form:input path="memberNumber" id="memberNumber" />
					<form:errors path="memberNumber" cssStyle="color : red;" />
				</p>
				<p>
					<label for="age">Age: </label>
					<form:input path="age" id="age" />
					<div style="text-align: center;">
						<form:errors path="age" cssStyle="color : red;" />
					</div>
				</p>
				<p id="buttons">
					<input id="reset" type="reset" tabindex="4"> 
					<input id="submit" type="submit" tabindex="5" value="Add Member">
				</p>
			</fieldset>
		</form:form>
	</div>
</body>
</html>
