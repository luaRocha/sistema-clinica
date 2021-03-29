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
	<spring:url value="/dono/carrega" var="dono"></spring:url>
	<spring:url value="/veterinario/carrega" var="veterinario"></spring:url>
	<spring:url value="/especialidade/carrega" var="especialidade"></spring:url>
	<spring:url value="/atendimento/carrega" var="atendimento"></spring:url>
	<spring:url value="/animal/carrega" var="animal"></spring:url>
	<spring:url value="/especie/carrega" var="especie"></spring:url>
	<spring:url value="/tratamento/carrega" var="tratamento"></spring:url>
	<spring:url value="/exame/carrega" var="exame"></spring:url>
	<spring:url value="/medicamento/carrega" var="medicamento"></spring:url>

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
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">

					<li class="nav-item"><a class="nav-link" href="${dono}">Clientes</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="${veterinario}">Veterinários</a>
					</li>
					<li class="nav-item"><a class="nav-link"
						href="${especialidade}">Especialidade</a></li>
					<li class="nav-item"><a class="nav-link" href="${atendimento}">Atendimento</a>
					</li>

					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="${animal}"
						id="navbarDropdown" role="button" data-bs-toggle="dropdown"
						aria-expanded="false"> Animal </a>
						<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
							<li><a class="dropdown-item" href="${especie}">Animais</a></li>
							<li><a class="dropdown-item" href="${especie}">Espécie</a></li>
						</ul></li>

					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="${tratamento}"
						id="navbarDropdown" role="button" data-bs-toggle="dropdown"
						aria-expanded="false"> Tratamento </a>
						<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
							<li><a class="dropdown-item" href="${tratamento}">Tratamentos</a></li>
							<li><a class="dropdown-item" href="${exame}">Exames</a></li>
							<li><a class="dropdown-item" href="${medicamento}">Medicamentos</a></li>
						</ul></li>

				</ul>
			</div>
		</div>
	</nav>


	<div class="container-fluid"
		style="margin-top: 15%; background-color: #e3f2fd; height: 200px; padding-top: 50px">
		<h4 class="text-center">Bem vindo ao Sistema da Clínica Arca de
			Noé!</h4>
		<h6 class="text-center">Funcionamento - Segunda a Sábado</h6>
		<h6 class="text-center">Horário de funcionamento - 8h ás 22h</h6>

	</div>

</body>
</html>