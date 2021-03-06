<%@page import="com.trainingbasket.jeefirst.modals.UserModal"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">


<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>List of Registered Users</h2>
	<table class="table table-striped table-bordered" style="width:100%">
		<tr>
			<td>Id</td>
			<td>Name</td>
			<td>Age</td>
			<td>Contact</td>
			<td>Email</td>
			<td>Password</td>
		</tr>
		<%
			List<UserModal> users = (List<UserModal>) request.getAttribute("users");
			if (users != null) {
				for (UserModal modal : users) {
		%>
		<tr>
			<td><%=modal.getId()%></td>
			<td><%=modal.getName()%></td>
			<td><%=modal.getAge()%></td>
			<td><%=modal.getContact()%></td>
			<td><%=modal.getEmail()%></td>
			<td><%=modal.getPassword()%></td>
		</tr>
		<%
			}
			}
		%>
	</table>
	<!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</body>
</html>