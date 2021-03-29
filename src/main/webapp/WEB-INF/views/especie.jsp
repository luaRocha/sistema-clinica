<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
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

	<spring:url value="/dono/carrega/cadastra" var="dono"></spring:url>

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

					<li class="nav-item"><a class="btn btn-primary" href="${cadastra}">Cadastrar</a>
					
					</li>
				</ul>
			</div>
		</div>
	</nav>


	<div class="container-fluid"
		style="margin-top: 15%; background-color: #e3f2fd; height: 200px; padding-top: 80px">
		<h4 class="text-center">Espécies Cadastrados</h4>
	</div>

</body>
</html>