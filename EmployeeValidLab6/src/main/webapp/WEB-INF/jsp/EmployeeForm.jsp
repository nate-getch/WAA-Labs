<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<div id="global">
	
	<form:form commandName="employee" action="employee_save" method="post"
		enctype="multipart/form-data">
		<fieldset>
			<legend><spring:message code="addEmployee.form.addEmpLegend" /></legend>
			<p>
				<form:errors path="*" cssStyle="color : red;" />
			</p>
			<p>
				<label for="id"><spring:message code="addEmployee.form.id" />
				</label>
				<form:input path="id" id="id" />
			<div style="text-align: center;">
				<form:errors path="id" cssStyle="color : red;" />
			</div>
			</p>
			<p>
				<label for="firstName"><spring:message
						code="addEmployee.form.firstName" /> </label>
				<form:input path="firstName" />
			<div style="text-align: center;">
				<form:errors path="firstName" cssStyle="color : red;" />
			</div>
			</p>
			<p>
				<label for="lastName"><spring:message
						code="addEmployee.form.lastName" /> </label>
				<form:input path="lastName" />
			<div style="text-align: center;">
				<form:errors path="lastName" cssStyle="color : red;" />
			</div>
			</p>

			<p>
				<label for="birthDate"><spring:message
						code="addEmployee.form.birthDate" /> </label>
				<form:input path="birthDate" id="birthDate" />
				<form:errors path="birthDate" cssStyle="color : red;" />
			</p>
			<p>
				<label for="salaryLevel"><spring:message
						code="addEmployee.form.salaryLevel" /> </label>
				<form:input path="salaryLevel" id="salaryLevel" />
			<div style="text-align: center;">
				<form:errors path="salaryLevel" cssStyle="color : red;" />
			</div>
			</p>
			<h4><spring:message code="addEmployee.form.addressTitle" /></h4>
			<p>
				<label for="street"><spring:message
						code="addEmployee.form.street" /> </label>
				<form:input path="address.street" id="street" />
			<div style="text-align: center;">
				<form:errors path="address.street" cssStyle="color : red;" />
			</div>
			</p>
			<p>
				<label for="state"><spring:message
						code="addEmployee.form.state" /> </label>
				<form:input path="address.state" id="state" />
			<div style="text-align: center;">
				<form:errors path="address.state" cssStyle="color : red; " />
			</div>
			</p>
			<p>
				<label for="zipCode"><spring:message
						code="addEmployee.form.zipCode" /> </label>
				<form:input path="address.zipCode" id="zipCode" />
			<div style="text-align: center;">
				<form:errors path="address.zipCode" cssStyle="color : red; " />
			</div>
			</p>

			<div class="">
				<label class="" for="userImage"> <spring:message
						code="addEmployee.form.userImage.label" /></label>
				<div class="">
					<form:input id="userImage" path="userImage" type="file" />
				</div>
			</div>

			<p id="buttons">
				<button id="reset" type="reset" tabindex="4">
					<spring:message code="addEmployee.form.reset" />
				</button>
				<button id="submit" type="submit" tabindex="5">
					<spring:message code="addEmployee.form.submit" />
				</button>
			</p>
		</fieldset>
	</form:form>
</div>
