<%@page import="java.text.SimpleDateFormat"%>
<%@page import="br.uel.produtos.Produto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/fmt' prefix='fmt' %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
	table, th, td { border: 1px solid black; }
</style>
<title>Resposta da busca</title>
</head>
<body>
	<table>
		<tr>
			<th> Nome </th>
			<th> Preço </th>
			<th> Quantidade </th>
		</tr>
		
	<c:forEach var="produto" items="${requestScope['listaProdutos']}">
		<tr>
			<td> ${produto.nome} </td>
			<td> ${produto.preco} </td>
			<td> ${produto.quantidade} </td>
			
			<td>
				<a href="/PrjProdutos/alterar?id=${produto.id}">Alterar</a>
			</td>
			<td>
				<a href="/PrjProdutos/excluir?id=${produto.id}">Excluir</a>
			</td>
			<td>
				<a href="/PrjProdutos/addcarrinho?id=${produto.id}">Adicinar ao carrinho</a>
			</td>
		</tr>
	</c:forEach>	
	</table>
	
	<br />
	
	<a href="/PrjProdutos/buscar-produto.jsp">Buscar produto</a>
	
</body>
</html>