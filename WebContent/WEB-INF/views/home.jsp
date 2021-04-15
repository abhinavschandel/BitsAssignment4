<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Hello BITS world!</h1>

	<P>The time on the server is ${serverTime}.</p>

	<form action="user" method="post">
 
		<input type="text" name="userName" placeholder="Enter your username"><br> 
		<input type="password" name="password" placeholder="Enter your password"><br>
	 
		<input type="submit" value="Login" style="
    margin: 14px 0px 0px 2px;
">
 
 
	</form>
</body>
</html>
