<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>hay <c:out value="${Total_Libros}"></c:out> libros en existencia, y <c:out value="${Cantidad_Autores}"></c:out> cantidad de autores diferentes</h1><br><br>
	<table>
		<tr>
			<th>Titulo</th>
			<th>Autor</th>
			<th>Genero</th>
			<th>ISBN</th>
			<th>Existencias</th>
		</tr>
		
		<c:forEach items="${libros}" var="libros">
		<tr>
			<td>${libros.titulo}</td>
			<td>${libros.autor}</td>
			<td>${libros.genero}</td>
			<td>${libros.isbn}</td>
			<td>${libros.cantidad}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>