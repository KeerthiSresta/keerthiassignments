<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>
</head>
<body>
	<div align="center">
		<form:form action="register" method="post" commandName="userForm">
			<table border="0">
				<tr>
					<td colspan="2" align="center"><h2>Book Train Ticket</h2></td>
				</tr>
				<tr>
					<td>Source:</td>
					<td><form:input path="source" /></td>
				</tr>
				<tr>
					<td>Destination:</td>
					<td><form:input path="destination" /></td>
				</tr>
				<tr>
					<td>Train Number:</td>
					<td><form:input path="trainnum"/></td>
				</tr>
				<tr>
					<td>E-mail:</td>
					<td><form:input path="email" /></td>
				</tr>
				<tr>
					<td>Date-Of-Journey (mm/dd/yyyy):</td>
					<td><form:input path="birthDate" /></td>
				</tr>
				<tr>
					<td>Class:</td>
					<td><form:select path="classcoach" items="${classcoachList}" /></td>
				</tr>
				<tr>
					<td>Passenger Name:</td>
					<td><form:input path="passname" /></td>
				</tr>
				<tr>
					<td>Age:</td>
					<td><form:input path="age" /></td>
				</tr>
				<tr>
					<td>Sex:</td>
					<td><form:input path="sex" /></td>
				</tr>
				<tr>
					<td>Mobile:</td>
					<td><form:input path="mobile" /></td>
				</tr>
				<tr>
					<td>Address:</td>
					<td><form:input path="address" /></td>
				</tr>
				<tr>
					<td>Berth Preference:</td>
					<td><form:input path="berthpref" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="Book" /></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>