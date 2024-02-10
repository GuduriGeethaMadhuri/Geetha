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
body{
		background-image: url("https://financialexpresswpcontent.s3.amazonaws.com/uploads/2017/07/Mercedes-Benz-GLA-main-larg.jpg");
		background-repeat: no-repeat;
		background-attachment: fixed;
		background-position: center bottom;
		background-size:cover;
		
		margin: 0;
		padding: 0;
		
	}
</style>
<h2> The details in your database are as follows:</h2>
<table> 
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
<td><%=c.getFuelType() %></td></tr><% } } %>
<tr><td><button><a href="Index.html">Back to homepage</button></td></tr></table>
</body>
</html>