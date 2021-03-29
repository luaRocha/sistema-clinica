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

	<spring:url value="/dono/cadastra" var="cadastra" />

	<jsp:include page="../comum/header.jsp"></jsp:include>

	<div class="container"
		style="margin-top: 3%; background-color: #e3f2fd; height: 520px; padding-top: 30px">

		<c:if test="${not empty erro}">
			<div class="alert alert-danger" role="alert">${erro}</div>
		</c:if>

		<form:form modelAttribute="dono" action="${cadastra}">

			<div class="form-group">
				<h4>Cadastro de Clientes</h4>
			</div>

			<input type="hidden" name="id" id="id" value="${dono.id}" />

			<div class="form-group">
				<label for="CPF">CPF</label>
				<form:input path="CPF" cssClass="form-control" />
			</div>

			<div class="form-group">
				<label for="nome">Nome</label>
				<form:input path="nomeDono" cssClass="form-control" />
			</div>

			<div class="form-group">
				<label for="nome">Endereço</label>
				<form:input path="endereco" cssClass="form-control" />
			</div>

			<div class="form-group">
				<label for="telefone">Telefone</label>
				<form:input path="telefone" cssClass="form-control" />
			</div>

			<c:if test="${dono.id == '0'}">
				<button type="submit" class="btn btn-primary">Cadastrar</button>
			</c:if>

			<c:if test="${dono.id != '0'}">
				<button type="submit" class="btn btn-primary">Editar</button>
			</c:if>

			<a href="/" class="btn btn-success">Voltar</a>

		</form:form>

		<br>
		
		<div class="position-relative top-50 start-50 translate-middle"></div>
		<a href="/animal/novo"
			class="btn btn-secondary btn-lg actived-grid gap-2 col-6 mx-auto"
			role="button" data-bs-toggle="button" aria-pressed="true">Cadastrar
			animal</a>
	</div>

	<footer>
		<script type="text/javascript" src="/js/jquery.js"></script>
		<script type="text/javascript" src="/js/bootstrap.min.js"></script>
	</footer>

</body>
</html>



