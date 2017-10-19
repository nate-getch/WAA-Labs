<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Welcome</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<p> <security:authorize access="isAuthenticated()">
  					Welcome  <security:authentication property="principal.username" />
				</security:authorize>

			</div>	 
 
				  <div class="container">
 				  <security:authorize access="isAnonymous()">
 				  <!-- WHICH ONE? depends on BASIC form OR CUSTOM -->
<%--     					<a href="<spring:url value='/spring_security_login' />" class="btn btn-default pull-right"> Login</a>
  --%>
    					<a href="<spring:url value='/login' />" class="btn btn-default pull-right"> Login</a>

				</security:authorize>
		
					 <a href="<spring:url value='/members' />" class="btn btn-default">
						<span class="glyphicon-hand-left glyphicon"></span> Members
					</a>
					<a href="<spring:url value='/employees' />" class="btn btn-default">
						<span class="glyphicon-hand-left glyphicon"></span> Employees
					</a>
				</div>	
	 			<div class="pull-left"> <h3>${SpecialBlurb}</h3> </div>
		</div>	
	</section>
	
</body>
</html>
