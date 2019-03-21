<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Success</title>
</head>
<body>
	<div>
	<h3>Thanks for booking.Ticket Booking is Successfull.</h3>
	<h3>Booking Details:</h3>
		<table border="1">
			
			<tr>
				<td>PNR No: 8412948373</td>
				<td>Train No. ${userForm.trainnum}</td>
				<td>Class: ${userForm.classcoach}</td>
			</tr>
			<tr>
				<td>From: ${userForm.source}</td>
				<td>Date Of Journey: ${userForm.birthDate}</td>
				<td>To: ${userForm.destination}</td>
			</tr>
			<tr>
				<td>Boarding At: ${userForm.source}</td>
				<td>Date of boarding: ${userForm.birthDate}</td>
				<td>Scheduled Departure: ${userForm.birthDate}</td>
			</tr>
			<tr>
				<td>Resv. Upto: ${userForm.destination}</td>
				<td>Schedule Arrival : </td>
				<td>Adult: 1</td>
			</tr>
			<tr>
				<td>Passenger Mobile No: ${userForm.mobile}</td>
				<td>Passenger Address: ${userForm.address}</td>
			</tr>
		</table>
		<br>
		<h3>FARE DETAILS:</h3>
		<table border="1">
			<tr>
				<td>Ticket Fare **</td>
				<td> Rs. 225.0</td>
				<td> Rupees Two Hundred and Twenty Five Only</td>
			</tr>
		</table>
		<br>
		<h3>Passenger Details:</h3>
		<table border="1">
			<tr>
				<td>Passenger Name</td>
				<td>Age</td>
				<td>Sex</td>
				<td>Booking Status</td>
			</tr>
			<tr>
				<td>${userForm.passname}</td>
				<td>${userForm.age}</td>
				<td>${userForm.sex}</td>
				<td>CNF</td>
			</tr>
		</table>
			
	</div>
</body>
</html>