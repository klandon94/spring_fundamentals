<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Survey Home</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous"> 
    <!-- Optional theme --> 
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
	<style>
		.container{
            padding:30px;
            width:40%;
            border:2px solid black;
            margin-top:100px;
        }
        textarea{
            width:100%;
        }
	</style>
</head>
<body>
	<div class='container'>
        <h1>User Creation</h1>
        <br>
        <form action='/result' method='post'>
            <div class='form-group form-inline'>
                Your Name: <input class='form-control' type='text' name='name' value='' placeholder='Name'>
            </div>
            <div class='form-group'>
                Dojo Location: <select name='location'>
                    <option value='Washington, D.C.'>DC</option>
                    <option value='Seattle'>Seattle</option>
                    <option value='Silicon Valley'>Silicon Valley</option>
                    <option value='Chicago'>Chicago</option>
                </select>
            </div>
            <div class='form-group'>
                Favorite programming language: <select name='language'>
                    <option value='Python'>Python</option>
                    <option value='Java'>Java</option>
                    <option value='Ruby'>Ruby</option>
                    <option value='C++'>C++</option>
                </select>
            </div>
            <div class='form-group'>
                Comment (optional): <textarea name='comment' rows='3' value=''></textarea>
            </div>
            <br>
            <input class='btn btn-primary' type='submit' value='Submit' id="button">
        </form>
    </div>
</body>
</html>