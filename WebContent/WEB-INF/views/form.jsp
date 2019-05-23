<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%String criterio = request.getParameter("seleccionar"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Se encontraron <c:out value="${Cantidad_Libros}"></c:out> resultados para <c:out value="${buscar}"></c:out> en <%=criterio%></h1><br><br>
	<table>
		<tr>
			<th>Titulo</th>
			<th>Autor</th>
			<th>Genero</th>
			<th>ISBN</th>
			<th>Existencias</th>
		</tr>
		<!-- OBTIENE LA LISTA -->
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