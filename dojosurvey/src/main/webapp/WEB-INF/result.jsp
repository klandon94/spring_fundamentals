<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous"> 
    <!-- Optional theme --> 
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
	<style>
		.container{
            padding:40px;
            width:50%;
            border:2px solid black;
            margin-top:100px;
        }
        h1{
            text-align:center;
        }
        p{
            font-size:20px;
        }
	</style>
</head>
<body>
	<div class='container'>
            <h1>Submitted information</h1>
            <br><br>
            <p>Name: ${name}</p>
            <p>Dojo location: ${location} </p>
            <p>Favorite language: ${language}</p>
            <p>Comment: ${comment}</p>
            <br>
            <a class='btn btn-primary' href="/">Go Back</a>
        </div>
</body>
</html>