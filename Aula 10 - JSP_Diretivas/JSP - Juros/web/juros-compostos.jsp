<%-- 
    Document   : index
    Created on : 7 de nov de 2022, 14:49:47
    Author     : Fatec
--%>

<%@page import="java.text.DecimalFormat"%>
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
            double C = 0, i = 0;
            int n = 0;
            try {
                C = Double.parseDouble(request.getParameter("C"));
                i = Double.parseDouble(request.getParameter("i"));
                n = Integer.parseInt(request.getParameter("n"));
                C += (C * (i * 0.01) * 1);
            } catch (Exception ex) {
                errorMessage = ex.getMessage();
            }
             DecimalFormat df = new DecimalFormat();
             df.applyPattern("#,##0.00");
        %>
        <h1>Juros Compostos</h1>
        <div>
            <% if (errorMessage != null) {%>
            <div style="color:red"><%= errorMessage%></div>
            <% } %>
            <% if (hasParameterC && hasParameteri && hasParametern) {%>
            <h2>Valores Futuros:</h2>
            <table border="1">
                <tr>
                    <th>Mês</th>
                    <th>Valor</th>
                </tr>
                <tr>
                    <%for (int a = 1; a <= n; a++) {%>
                    <td><%=(a)%></td> 
                    <td>R$:<%= df.format(C)%></td>
                    <%C += C * (i * 0.01) * 1;%>
                </tr>
                <%}%>
            </table>
            <% }%>
            <h2>Calcular Juros Compostos</h2>
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