<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset=UTF-8">
	<title>Counter</title>
	<style>
		
	</style>
</head>
<body>
	<h1>You have visited <a href="/countee">localhost:8080/counter</a> ${amt} times</h1>
	<h1><a href="/countee">Test another visit?</a></h1>
	
	<a href="/reset">Reset visits</a>
</body>
</html>