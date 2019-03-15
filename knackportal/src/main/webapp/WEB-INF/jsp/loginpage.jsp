<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="images/muriva-bluff-embossed-brick-effect-wallpaper-j30309-p711-1303_image.jpg">
	<h3>${error}</h3>
	<div align="center" >
		<form action="/knackportal/Login"  method="post">
			<table>
				<tr>
					<td>Employee code :</td>
					<td><input type="text" name="empcode"></td>
				</tr>
				<tr>
					<td>Password :</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Login"></td>
				</tr>
			</table>
		</form>
		<form action="/knacksprings6march2019/Register" method="get">
			<input type="submit" value="Register">
		</form>
	</div>
</body>
</html>