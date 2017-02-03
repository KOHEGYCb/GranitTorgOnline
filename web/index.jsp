<%-- 
    Document   : index
    Created on : 03.02.2017, 11:53:25
    Author     : Dmitry
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%--<jsp:include flush="true" page="jsp/header.jsp"/>--%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styles/style.css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <h1 class="site_name">GranitTorg Online</h1>
        <div class="login">
            <form action="loginServlet" method="post">
                <span>Login</span>
                <input type="text" name="login" value="${login}"/>
                <span class="validationError">${loginNotFound}</span>
                <br><br>
                <span>Password</span>
                <input type="password" name="password" value=""/>
                <span class="validationError">${wrongPassword}</span>
                <br><br>
                <input type="submit" name="login" value="LogIn"/>
            </form>
        </div>
    </body>
</html>
