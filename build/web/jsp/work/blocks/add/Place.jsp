<%-- 
    Document   : Place
    Created on : 04.02.2017, 14:07:30
    Author     : Dmitry
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div>
    <h2>Add Place</h2>
    <form action="PlaceServlet" method="post">
        <input type="text" value="${addPlace}" name="newPlaceName"/>
        <input type="submit" value="Create" name="addPlace"/>
    </form>
</div>