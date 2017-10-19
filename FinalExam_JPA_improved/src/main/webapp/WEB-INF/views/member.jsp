<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Members</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>One of our People</h1>
				<p>An important contributor  to our Community!!!</p>
			</div>
  					<a href="<spring:url value="/members/add" />" class="btn btn-primary btn-mini pull-right">Add a new one</a>	
 				<br>
 				<spring:url value="/dologout" var="logout_url" />				
  			<form:form action="${logout_url}" class="form-horizontal" method="POST" >
  					<div class="form-group">
					<div class="col-lg-offset-2 col-lg-10">
						<input type="submit" id="btnAdd" class="btn btn-danger btn-mini  pull-right" value ="Logout"/>
					</div>
				</div>
			</form:form>
 
 			
 							<div class="pull-left"> <h3>${SpecialBlurb}</h3> </div>
 			
		</div>
	</section>

	<section class="container">
		<div class="row">
 				<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
					<div class="thumbnail">
 						<div class="caption">
							<h3>First Name - ${member.firstName}</h3>
							<h3>Last Name -  ${member.lastName}</h3>
							<p>Age -         ${member.age}</p>
							<p>Title -       ${member.title} </p>
							<p>NUMBER -      ${member.memberNumber} </p>

						</div>
					</div>
				</div>
 
		</div>
	</section>
</body>
</html>
