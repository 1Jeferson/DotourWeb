<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Clientes</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
<link rel="website icon" type="logo" href="./imagens/DT icon.png">
<link rel="stylesheet" href="./Css/style.css">
</head>

<body class="text-center">

	<nav class="navbar-expand-lg" style= "padding: 20px ">
		<div class="container-fluid">
			<a class="navbar-brand" href="index.html" style = "text-transform: uppercase; font-size: 30px;letter-spacing: 2px; font-weight: 400; " >administrador do tour</a>
		</div>
	</nav>


	<h1 class="mt-5">Clientes Listados</h1>
	<div class="container mt-5">
		<a href="./cadastro.jsp" class="btn btn-warning mb-5">Novo</a>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>ID</th>
					<th>Usuário</th>
					<th>Email</th>
					<th>Senha</th>
					<th>CPF</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${clientes}" var="cliente">
					<tr>
						<td>${cliente.id}</td>
						<td>${cliente.usuario}</td>
						<td>${cliente.email}</td>
						<td>${cliente.senha}</td>
						<td>${cliente.cpf}</td>
						<td><a href="UpdateController?id=${cliente.id}"><img
								src="./imagens/edit.png" alt="Delete"></a> <a
							href="DeleteController?id=${cliente.id}"><img
								src="./imagens/delete.png" alt="Edit"></a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>

</body>

</html>