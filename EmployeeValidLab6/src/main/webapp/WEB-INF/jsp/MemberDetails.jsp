<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
<head>
<title>Save Employee</title>
<link rel="stylesheet" type="text/css" href="<c:url value="/css/main.css"/>">
</head>
<body>
<div id="global">
    <h4>The Member details have been saved.</h4>
    <p>
        <h5>Details:</h5>
        First Name: ${member.firstName}<br/>
        Last Name: ${member.lastName}<br/>
        Age: ${member.age}
    </p>
</div>
</body>
</html>