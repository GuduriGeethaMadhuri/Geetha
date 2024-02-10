<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
    <%@ page import="com.servlet.encapsulated.carsentity" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detailspage</title>
</head>
<body>
<style>

	table,th,td{
	border:1px solid black;
color:Black;
padding:4px;
	
	}
</style>
<h2> The details in your database are as follows:</h2>
<table style="50%" align="center"> 
<%  
Object obj =session.getAttribute("Details");
if(obj==null){
	out.print("No records found");
}else{
	List<carsentity> entity=(ArrayList<carsentity>) obj;

%>
<tr>
<th>carmodelname:</th><th> carvariants:</th><th>price:</th><th>Topspeed:</th><th>FuelType</th></tr>
<%
for(carsentity c:entity){
%>
<tr>
<tr><td><%=c.getCarmodelname() %></td><td><%=c.getCarvariants() %></td><td><%=c.getPrice() %></td><td><%=c.getTopspeed() %></td>
<td><%=c.getFuelType() %></td>
<td><img src="https://fastly-production.24c.in/hello-ar/dev/uploads/65bce7c45dd7d86edebe6e23/41537ea5-0427-45b7-b944-4eb9ffbf4f52/slot/10027085755-d98f1dbdcfc14e4fa531c5bbeb73a4ed-Exterior-7.jpg?w=500&auto=format" width="75"/></td></tr><% } } %>
<tr><td><button><a href="Index.html">Back to homepage</button></td></tr></table>
</body>
</html>