<%-- 
    Document   : Listar
    Created on : 27/06/2017, 13:20:37
    Author     : Luiz Eduardo
--%>

<%@page import="ConexaoDAO.JDBCproduto"%>
<%@page import="java.util.List"%>
<%@page import="Model.Produto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ConexaoDAO.ProdutoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Resultado</title>
    </head>
    <body>
        <table align = "center">
            <tr>
                <th>Id</th>
                <th>Nome</th>
                <th>Preço</th>
                <th>Unidade de Medida</th>
                <th>Quantidade</th>
            </tr> 
            <%
                JDBCproduto pdt = new JDBCproduto();
                ArrayList <Produto> lista = pdt.listar();
                for(Produto p: lista){
            %>
            <tr>
                <th><=%p.getID()%></th>
                <th><=%p.getNOME()%></th>
                <th><=%p.getPRECO()%></th>
                <th><=%p.getUNIDADE()%></th>
                <th><=%p.getQUANTIDADE()%></th>
            </tr>
        </table>
    </body>
</html>
