<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Arca de Noé</title>
<link href="/css/bootstrap.min.css" rel="stylesheet" />
<link href="pricing.css" rel="stylesheet">
</head>

<body>

	<spring:url value="/dono/edita" var="edita"></spring:url>
	<spring:url value="/dono/deleta" var="deleta"></spring:url>


	<nav class="navbar navbar-expand-lg navbar-light"
		style="background-color: #e3f2fd;">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">Clínica Arca de Noé</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="d-grid gap-2 d-md-flex justify-content-md-end">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">

					<li class="nav-item"><a class="btn btn-primary"
						href="/dono/novo">Cadastrar</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container">
	
			<c:if test="${not empty sucesso}">
				<div class="alert alert-warning" role="alert" >
					${sucesso}
				</div>
			</c:if>

		<div class="jumbotron"
			style="margin-top: 02%; background-color: #e3f2fd; height: 100px; padding-top: 40px">
			<h3 class="text-center">Clientes Cadastrados</h3>
		</div>

		<c:if test="${not empty donos}">
			<!-- verificar se a lista é nula -->
			<table class="table">
				<tr>

					<th width="15%">CPF</th>
					<th width="20%">Nome</th>
					<th width="20%">Endereço</th>
					<th width="15%">Telefone</th>
					<th width="15%">Nome Animal</th>
					<th width="15%" colspan="2">Ações</th>
				</tr>
				<c:forEach var="dono" items="${donos}">
					<tr>
						<td>${dono.CPF}</td>
						<td>${dono.nomeDono}</td>
						<td>${dono.endereco}</td>
						<td>${dono.telefone}</td>
						<td>${dono.animais}</td>
						<td><a href="${edita}/${dono.id}" class="btn btn-warning">Editar</a></td>
						<td><a href="${deleta}/${dono.id}" class="btn btn-danger">Deletar</a></td>
					</tr>

				</c:forEach>
			</table>
		</c:if>
	</div>

	<footer>
		<script type="text/javascript" src="/js/jquery.js"></script>
		<script type="text/javascript" src="/js/bootstrap.min.js"></script>
	</footer>

</body>

</html>


