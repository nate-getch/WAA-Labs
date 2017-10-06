<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Advice Display</title>
</head>
<body>

	<c:choose>
		<c:when test="${error != null}">
			<p id="errors">${error}</p>
		</c:when>
		<c:otherwise>
			<h2>
				Starbuck's <u>${adviceInfo.adviceTitle}</u> Roast Coffees:
			</h2>

			<table>
				<c:forEach var="adv" items="${adviceInfo.adviceContent}"
					varStatus="status">

					<c:choose>
						<c:when test="${(status.index)%2 eq 0}">
							<tr style="background-color: cyan">
						</c:when>
						<c:otherwise>
							<tr style="background-color: yellow">
						</c:otherwise>
					</c:choose>
					<td>${adv}</td>
					</tr>
				</c:forEach>
			</table>
		</c:otherwise>
	</c:choose>
	<a href="/Starbucks_Lab4/advice/list">Go Back</a>
</body>
</html>