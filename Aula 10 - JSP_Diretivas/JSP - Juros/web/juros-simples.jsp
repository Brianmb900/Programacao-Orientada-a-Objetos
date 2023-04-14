<%-- 
    Document   : index
    Created on : 7 de nov de 2022, 14:49:47
    Author     : Fatec
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="WEB-INF/jspf/menu.jspf" %>
        <%
            String errorMessage = null;
            boolean hasParameterC = request.getParameter("C") != null;
            boolean hasParameteri = request.getParameter("i") != null;
            boolean hasParametern = request.getParameter("n") != null;
            double C = 0, i = 0, J = 0, total = 0;
            int n = 0;
            try {
                C = Double.parseDouble(request.getParameter("C"));
                i = Double.parseDouble(request.getParameter("i"));
                n = Integer.parseInt(request.getParameter("n"));
                J = C * (i * 0.01) * n;
                total = J + C;
            } catch (Exception ex) {
                errorMessage = ex.getMessage();
            }
        %>
        <h1>Juros Simples</h1>
        <div>
            <% if (errorMessage != null) {%>
            <div style="color:red"><%= errorMessage%></div>
            <% } %>
            <% if (hasParameterC && hasParameteri && hasParametern) {%>
            <b>Juros:</b> <%= C%> * <%= i%> * <%= n%> = <%= J%><br>
            <b>Total:</b> R$:<%= total%>
            <% }%>
            <h2>Calcular Juros Simples</h2>
            <form>
                <h3 style="margin-bottom: 10px; margin-top: 5px;">Valores:</h3>
                <b>Capital:</b><input type="number" min="1" name="C" placeholder="Digite o Capital"/>
                <b> Taxa:</b><input type="number" min="1" max="100" step="1" name="i" placeholder="Digite a Taxa"/>
                <b> Tempo:</b><input type="number" min="1" name="n" placeholder="Digite o Tempo"/>
                <input type="submit" value="Calcular"/>
            </form>
        </div>
    </body>
</html>