<%@page import="java.util.LinkedList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@page import="br.uel.produtos.Produto"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
table, th, td {
  border: 1px solid black;
}
</style>
</head>
<body>

<br />
	
	<c:if test="${not empty sessionScope.listaCarrinhosAdd}">
		Lista de produtos adicionador no carrinho:
		<table>
			<tr>
				<th>
					Produto		
				</th>
				<th>
					Operacao
				</th>
			</tr>
		<c:forEach var="produto" items="${sessionScope['listaCarrinhosAdd']}" 
															varStatus="index">
				<tr>
					<td>
						<a href="/PrjProdutos/buscar?nomeProduto=${produto}">
							${produto}</a>		
					</td>
					<td>
						<a href="/PrjProdutos/excluircarrinho?sequenciaCarrinho=${index.count-1}">
							Excluir</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
		
	<c:if test="${empty sessionScope['listaCarrinhosAdd']}">
			Nenhum produto adicinado.
	</c:if>
	
</body>
</html>