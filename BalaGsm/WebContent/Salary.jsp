<%@page import="java.io.FileInputStream"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Salary</title>
<style>
.employee{
	text-align: center;


}
</style>
</head>
<body>
Guru Downloading File<a href="Salary_Download">Download here!!!</a>
<%String a =(String) session.getAttribute("employname");
String b =(String) session.getAttribute("design");
Integer c= (Integer)session.getAttribute("Year");
Integer d= (Integer)session.getAttribute("Month");
double e =(Double) session.getAttribute("Basicda");
double  f=(Double) session.getAttribute("hra");
double  g=(Double) session.getAttribute("conveync");
double  h=(Double) session.getAttribute("providentfund");
double i =(Double) session.getAttribute("Esi");
double j =(Double) session.getAttribute("loan");
double  k=(Double) session.getAttribute("profession");
double  l=(Double) session.getAttribute("tsdit");
%>

<h1 style="text-align:center;">BALAGSM Solutions Ltd.</h1>
<h5 style="text-align:center;margin-top:5px;">[KARTIK,SOLUTIONS]</h5>
<center><font size="6" style="text-align:center;text">Salary Slip</font></center>
<p style="text-align:center;margin-top:40px"><b>Employee Name:</b>________<%out.print(a);%>___________</p4>
<p style="text-align:center;"><b>Designation:</b>______<%out.print(b); %>___________</p>
<p style="text-align:center;"><b>Month:</b>________<%out.print(d);%>__________<b> Year:</b>________<%out.print(c);%>_________</p>
<table border="2">
	<th style="background-color:gray;"><b>Earning---------------------------------------------</b></th>
	<th style="background-color:gray;">-------------------------------------------------------</th>
	<th style="background-color:gray;"><b>Deduction.---------------------------------------------</b></th>
	<th style="background-color:gray;">-------------------------------------------------------</th>
	<tr>
		<td>Basic & DA</td>
		<td><% out.println(e);%></td>
		<td>ProvidentFund</td>
		<td><% out.print(h);%></td>
	</tr>
	<tr>
		<td>HRA</td>
		<td><% out.println(f);%></td>
		<td>ESI ID</td>
		<td><% out.println(i);%></td>
	</tr>
	<tr>
		<td>Conveyance</td>
		<td><% out.println(g);%></td>
		<td>Loan</td>
		<td><% out.println(j);%></td>
	</tr>
	<tr>
		<td></td>
		<td></td>
		<td>Profession Tax</td>
		<td><% out.println(k);%></td>
	</tr>
	<tr>
		<td></td>
		<td></td>
		<td>TSD/IT</td>
		<td><% out.println(l);%></td>
	</tr>
	<tr>
		<td>.</td>
		<td></td>
		<td></td>
		<td></td>
	</tr>
	
	<tr>
		<td></td>
		<td></td>
		<td style="background-color:gray;"><b>NET Salary.</b></td>
		<td><%  double salary =(Double) session.getAttribute("sal");
		out.print(salary); 
		%> </td>
	</tr>
</table>
</body>
</html>