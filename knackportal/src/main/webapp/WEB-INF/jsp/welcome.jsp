<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body  background="images/muriva-bluff-embossed-brick-effect-wallpaper-j30309-p711-1303_image.jpg">
	<div>
	<div align="left" style="font-size:40px"><span><b>Welcome ${fname}!!!</b></span></div>
	<div align="right">
		<table>
			<tr>
				<td><b>Name :</b></td>
				<td>${fname}</td>
			</tr>
			<tr>
				<td><b>Role :</b></td>
				<td>${role}</td>
			</tr>
			<tr>
				<td><b>Employee code :</b></td>
				<td>${empid}</td>
			</tr>
		</table>
	</div>
	</div>
	<div align="left">
		<form action="/knackportal/Search" method="post">
  			<input type="text" placeholder="Search Employee.." name="search">
  			<button type="submit">SEARCH</button>
    	</form>
    </div><br>
    <form action="/knackportal/Login">
		<button>Logout</button>
	</form>
</body>
</html>