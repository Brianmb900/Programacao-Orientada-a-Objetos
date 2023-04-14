<%-- 
    Document   : index
    Created on : 17 de out de 2022, 13:52:03
    Author     : Brian e Erik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Projetoi JSP</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    </head>
    <body>
        <%@include  file="WEB-INF/jspf/navbar.jspf"%>
        <h3 style="margin-top: 10px;text-align: center;">JSP</h3><hr>
        <p style="font-size: 20px; margin-left: 5px;">O JSP é uma página web que utiliza a estrutura HTML,
            capaz de suportar trechos de código java para gerar as páginas dinâmicamente.</p>
        <%@ page import="java.util.*" %> <!-- Aqui estou usando um script jsp para importar a classe java.util -->
        <%
            Date date = new Date();
            out.println("Eu sou um script jsp que mostra a hora: " + date.toString()); // Aqui estou usando um scriptlet para exibir a data e hora ao usuário

        %>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
    </body>
</html>
