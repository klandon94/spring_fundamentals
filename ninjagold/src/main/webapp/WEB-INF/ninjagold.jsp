<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Ninja Gold | Java Version</title>
	<link rel="stylesheet" type="text/css" href="resources/css/styles.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous"> 
    <!-- Optional theme --> 
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
</head>
<body>
<div id='container'>
        Your Gold: <input type = 'text' name='gold' value='${gold}'>
        <div id='goldmines'>
            <div class='places'>
                <h1>Farm</h1>
                <br>
                <h4>(earns 10-20 golds)</h4>
                <br>
                <form action="/process_money" method='post'>
                    <input type='hidden' name='property' value='farm'>
                    <input class='btn btn-primary center-block' type='submit' value='find gold!'>
                </form>
            </div>
            <div class='places'>
                <h1>Cave</h1>
                <br>
                <h4>(earns 5-10 golds)</h4>
                <br>
                <form action="/process_money" method='post'>
                    <input type='hidden' name='property' value='cave'>
                    <input class='btn btn-primary center-block' type='submit' value='find gold!'>
                </form>
            </div>
            <div class='places'>
                <h1>House</h1>
                <br>
                <h4>(earns 2-5 golds)</h4>
                <br>
                <form action="/process_money" method='post'>
                    <input type='hidden' name='property' value='house'>
                    <input class='btn btn-primary center-block' type='submit' value='find gold!'>
                </form>
            </div>
            <div class='places'>
                <h1>Casino</h1>
                <br>
                <h4>(earns/takes 0-50 golds)</h4>
                <br>
                <form action="/process_money" method='post'>
                    <input type='hidden' name='property' value='casino'>
                    <input class='btn btn-primary center-block' type='submit' value='find gold!'>
                </form>
            </div>
        </div>
        <div id = 'activities'>
            Activities:
            <div class='form-group'>
                <div id="textbox">
                	<c:forEach items="${activities}" var="x">
                		<p class="<c:out value='${x.get("color")}'/>"> <c:out value='${x.get("activity")}'/> </p>
                	</c:forEach>
                </div>
            </div>
        </div>
        <br><br>
        <a class='btn btn-primary' href='/reset'>Click to reset game</a>
    </div>
</body>
</html>