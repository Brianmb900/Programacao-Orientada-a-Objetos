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
        <%@include  file="WEB-INF/jspf/navbar.jspf"%> <!-- Aqui eu estou importando a navbar que foi criada em um JSPF -->
        <h3 style="margin-top: 10px;text-align: center;">JSPF</h3><hr>
        <p style="font-size: 20px; margin-left: 5px;">O JSPF é um fragmento/pedaço de uma página JSP que você pode chamar em qualquer uma das páginas JSP.</p>
        <p style="font-size: 20px; margin-left: 5px;">Um exemplo é a própria navbar sendo utilizada neste projeto, ele foi criada em um arquivo jspf que é chamado em todas as
            páginas para que ela possa ser exibida.</p>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
    </body>
</html>
