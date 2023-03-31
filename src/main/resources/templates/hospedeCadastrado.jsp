<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3>Lista de Hospedes</h3>

	<br />
	<a href="/hotel1800/formHospede">Cadastrar Hospede</a>
	<br />
	<br />
	<table>
		<tr>
			<td colspan="1">CPF</td>
			<td>Nome</td>
		</tr>

		<c:forEach var="hospede" items="${hospede}">


			<tr>
				<td><a href="/hotel1800/buscaHospede?cpf=${hospede.cpf}">${hospede.cpf}</a></td>
				<td>${hospede.nome}</td>
				<td>
					<button onclick="excluirHospede(${hospede.getCpf()})">Excluir</button>
				</td>
			</tr>
		</c:forEach>
		<script>
    		function excluirHospede(cpf) {
     			  if (confirm("Tem certeza que deseja excluir este Hospede?")) {
            	window.location.href = "/hotel1800/deletarhospede?cpf=" + cpf;
      			  }
   			 }
			</script>


	</table>
	<br />
	<a href="/hotel1800/listaSistema.jsp">Voltar</a>


</body>
</html>