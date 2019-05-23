<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tarea</title>
</head>
<body>
	<br><h1>Bienvenido</h1><br><br>
	<h1>Buscar por</h1>
	<form:form action="${pageContext.request.contextPath}/Buscar" method="POST">
		<select name="seleccionar">
			<option value="Seleccione">Seleccione</option>
			<option value="Autor">Autor</option>
			<option value="ISBN">ISBN</option>
			<option value="Genero">Genero</option>
		</select>
		<input type="text" name="buscar">
		<input type="submit" name="Buscar"><br><br>
	</form:form>
	<br>
	<form:form action="${pageContext.request.contextPath}/Todos" method="POST">
		<input type="submit" value="Todos los libros">
	</form:form>
</body>
</html>