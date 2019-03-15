<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body  background="images/muriva-bluff-embossed-brick-effect-wallpaper-j30309-p711-1303_image.jpg">
	<div align="center">
		<form action="/knackportal/Register" method="post">
				<table>
				<tr>
					<td>First Name</td>
					<td><input type="text" name="fname"></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="lname"></td>
				</tr>
				<tr>
					<td>Gender</td>
					<td><select name="gender">
						<option name="gender">Male</option>
						<option name="gender">Female</option>
						<option name="gender">Other</option>
					</select></td>
				</tr>
				<tr>
					<td>Role</td>
					<td><select name="role">
						<option name="role">Trainee</option>
						<option name="role">Consultant</option>
						<option name="role">Sr Consultant</option>
						<option name="role">Manager</option>
					</select></td>
				</tr>
				<tr>
					<td>Employee Code</td>
					<td><input type="text" name="empcode"></td>
				</tr>
				<tr>
					<td>Contact</td>
					<td><input type="text" name="contact"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Submit"></td>
					<td><button><a href="/loginPage">Login</a></button></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>