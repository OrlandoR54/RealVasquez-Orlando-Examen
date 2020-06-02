<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/IngresoLibro" method="get">
		<label class="lbl-num" for="nombreLib">Nombre: </label> 
		<input type="text" id="nombreLib" name="nombreLib" placeholder="Nombre del Libro"> 
		<label class="lbl-num" for="isbn">ISBN: </label> 
		<input type="text" id="isbn" name="isbn" placeholder="ISBN"> 
		<label class="lbl-num" for="numPaginas"># Paginas: </label> 
		<input type="text" id="numPaginas" name="numPaginas" placeholder="# de paginas">

		<label class="lbl-num" for="numero"># Capitulo: </label> 
		<input type="text" id="numero" name="numero" placeholder="Numero de Capitulo"> 
		<label class="lbl-num" for="itulo">Titulo: </label> 
		<input type="text" id="titulo" name="titulo" placeholder="Titulo del capitulo">


		<div class="opc">
			<div class="boxOpr" id="selectorOperadora">
				<label class="lbl-num" for="autor">Autor: </label> 
				<select id="autor" name="autor">
					<option value="cod1">1</option>
					<option value="cod2">2</option>
					<option value="cod3">3</option>
					<option value="cod4">4</option>
				</select>
			</div>
		</div>

			<button type="submit">Registrar</button>
	</form>
	
	<form action="">
		<input type="search" id="search" name="busquedaLibro" placeholder="Buscar..." />
		<table>
			<thead class="thead-dark">
				<tr>
					<th>Nombre</th>
					<th>ISBN</th>
					<th>Paginas</th>
				</tr>
				</thead>
				<tbody>
				
		
				</tbody>
		</table>
	</form>

</body>
</html>