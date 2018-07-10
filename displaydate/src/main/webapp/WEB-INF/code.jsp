<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset=UTF-8">
	<title>Secret Code</title>
	<style>
		.error{
			color:red;		
		}
	</style>
</head>
<body>
	<p class='error'>${error}</p>
	<form action="/secret" method='post'>
		<label for='code'>What is the code?</label>
		<input type='text' name='code'>
		<input type='submit' value='Try Code'>
	</form>
</body>
</html>