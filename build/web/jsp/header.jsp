<%-- 
    Document   : header
    Created on : 03.02.2017, 14:50:08
    Author     : Dmitry
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:include flush="true" page="../styles/style.jsp"/>
    </head>
    <body>
        <div class="header">
            <span class="user">User: ${userLogin}</span>
            <span class="action">${action}</span>
        </div>
            <jsp:include flush="true" page="menu.jsp"/>