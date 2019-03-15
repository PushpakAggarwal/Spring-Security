<%@page import="com.knack.models.Employe"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body  background="images/muriva-bluff-embossed-brick-effect-wallpaper-j30309-p711-1303_image.jpg">
	<form action="/knackportal/Welcome" method="post">
		<h1><button>HOME</button></h1>
	</form>
	<div align="left">
		<form action="/knackportal/Search" method="post">
  			<input type="text" placeholder="Search employee.." name="search">
  			<button type="submit">SEARCH</button>
    	</form>
    </div><br>
    <span style="font-size:25px">${message}</span>
    <br>
    <div align="left">
    <table border="1">
    	<tr>
    		<th>First Name</th>
    		<th>Last Name</th>
    		<th>Gender</th>
    		<th>Role</th>
    		<th>Employee Code</th>
    		<th>Contact</th>
    	</tr>
    	<% ArrayList<Employe> result  = (ArrayList<Employe>) request.getAttribute("employe");
    	for(Employe results:result)
    	{
    	%>
    	<tr>
    			<td><%=results.getFname() %></td>
    			<td><%=results.getLname() %></td>
    			<td><%=results.getGender() %></td>
    			<td><%=results.getRole() %></td>
    			<td><%=results.getEmpcode() %></td>
    			<td><%=results.getContact() %></td>
    		</tr>
    	
    	<%} %>
    	
    </table>
    </div>
</body>
</html>