<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Restful Employee</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<style type="text/css">
		@import url("<spring:url value="/resource/css/rest.css"/>");
	</style>
	
</head>

<body>
	<div class="container">
		<h1>Add Employee</h1>

		<form id="employeeForm" method="post">
			<table cellpadding="0" cellspacing="0" border="1" class="GridOne">
				<tr>
					<td>First Name</td>
					<td><input type="text" name="firstName" id="firstName"
						value=""></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="lastName" id="lastName" value=""></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="text" name="email" id="email" value=""></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="button"
						value="Ajax Submit" onclick="makeAjaxCall();return false;" />
						</td>
				</tr>
			</table>
		</form>
		<!-- Success - or Validation errors -->
		<div id="errors" style="display: none"></div>

		<div id="formInput" style="display: none"></div>
	</div>
	
	<!-- Modal -->
	<div id="myModal" class="modal fade" role="dialog">
	  <div class="modal-dialog">
	
	    <!-- Modal content-->
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal">&times;</button>
	        <h4 class="modal-title">New Employee Information <H3></h4>
	      </div>
	      <div class="modal-body">
	        
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
	      </div>
	    </div>
	
	  </div>
	</div>

	<script type="text/javascript"
	src="<spring:url value="/resource/js/ajax.js"/>"></script>
</body>
</html>