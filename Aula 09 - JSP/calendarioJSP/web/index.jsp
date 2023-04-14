<%-- 
    Document   : index
    Created on : 31 de out de 2022, 15:38:21
    Author     : Brian e Erik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calendário em JSP</title>
    </head>
    <body>
        <%
            String errorMessage = null;
            boolean hasParameterM = request.getParameter("m") != null;
            boolean hasParameterY = request.getParameter("y") != null;
            int m = 1;
            int y = 0;
            String months[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
            int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            try {
                m = Integer.parseInt(request.getParameter("m"));
                y = Integer.parseInt(request.getParameter("y"));
            } catch (Exception ex) {
                errorMessage = ex.getMessage();
            }
            String month = months[m - 1];
        %>
        <%@include file="WEB-INF/css.jspf"%>
        <h1>Calendário</h1>
        <div style = "width: 50%">
            <% if (errorMessage != null) {%>
            <div style="color:red"><%= errorMessage%></div>
            <% } else { %>
            <h2 style="margin-left: 41%; margin-bottom: 2px;"><%out.println(month + " de " + y);%></h2>
            <table border = '1'>
                <tr align = center>
                    <td>Domingo</td>
                    <td>Segunda-Feira</td>
                    <td>Terça-Feira</td>
                    <td>Quarta-Feira</td>
                    <td>Quinta-Feira</td>
                    <td>Sexta-Feira</td>
                    <td>Sábado</td>
                </tr>
                <tr>
                    <%
                        out.println("<td></td>");
                    %>
                </tr>
            </table>
            <% }%>
            <hr>
            <form>
                Ano:<input type="number" name="y"/>
                Mês:<input type="number" name="m"/>
                <input type="submit" name="gerar" value="Gerar"/>
            </form>
        </div>
    </body>
</html>