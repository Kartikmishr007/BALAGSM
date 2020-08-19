<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<style>
div {
  background-color: lightgrey;
  width: 900px;
  
  border: 20px solid green;
  padding: 50px;
  margin: 30px;
}
</style>
</head>
<body background="C:\Users\hp\Desktop\payimage.jpg" >
<center><div>
<font color="BLUE"><h1><center><marquee>Firstly SignIn or Login the page</marquee></center></h1></font></div></center>
<div class="container">
  <h2>Please Click For further Process</h2>
  <button type="button" onclick="window.location.href = 'http://localhost:9009/BalaGsm/Login.jsp';" class="btn btn-default btn-lg btn-block">Press Member-LogIn</a></button>

  <button type="button" onclick="window.location.href = 'http://localhost:9009/BalaGsm/AdminLogin.html';" class="btn btn-default btn-lg btn-block">Press Admin-LogIn</a></button>
  <button type="button" onclick="window.location.href = 'http://localhost:9009/BalaGsm/Registration.jsp';" class="btn btn-default btn-lg btn-block">Press Member_Register</a></button>
  <button type="button" onclick="window.location.href = 'http://localhost:9009/BalaGsm/Home.jsp';" class="btn btn-default btn-lg btn-block">Press HOME</a></button>

</div></html>