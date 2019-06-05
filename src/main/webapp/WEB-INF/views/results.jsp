<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Books</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/litera/bootstrap.min.css" />
</head>
<body>

	<div class="container">

		<form action="/results">
			<input type="text" name="query" />

			<button type="submit">Search</button>
		</form>

		<table class="table">

			<tr>
				<th></th>
				<th>Title</th>
				<th>Author(s)</th>
				<th>Description</th>
				<th>Categories</th>
				<th>Publisher</th>
				<th>Date</th>
				<th>Link</th>
			</tr>

			<c:forEach var="b" items="${results}">
				<tr>
					<td><img src="${b.volumeInfo.imageLinks.thumbnail}" /></td>
					<td>${b.volumeInfo.title}</td>

					<td><c:forEach var="a" items="${b.volumeInfo.authors}">${a}</c:forEach></td>
					<td><textarea rows="4" cols="40" maxlength="140">
					${b.volumeInfo.description}
					</textarea></td>
					<td><c:forEach var="c" items="${b.volumeInfo.categories}">
					${c}</c:forEach></td>
					<td>${b.volumeInfo.publisher}</td>
					<td>${b.volumeInfo.publishedDate}</td>

					<td><a href="${b.volumeInfo.previewLink}" target="_blank">Google
							Books Link</a></td>



				</tr>

			</c:forEach>

		</table>

	</div>

</body>
</html>