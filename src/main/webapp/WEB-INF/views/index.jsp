<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/litera/bootstrap.min.css" />
</head>
<body>
<div class="container">

<h2>Google Volumes</h2>

<form action="/results">
<input type="text" name="query" required pattern="[A-Za-z]*" value="mccarthy" title="using only letters A-Z"/>

<button type="submit">Search</button>
</form>

</div>


</body>
</html>