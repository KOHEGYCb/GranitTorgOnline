<%-- 
    Document   : Place
    Created on : 04.02.2017, 14:07:30
    Author     : Dmitry
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div style="border: 1px solid red;">
    <h2>Add Place</h2>
    <form action="addPlace" method="post">
        <input type="text" name="place" value="${place}"/>
        <br><span>${wrongPlace}</span>
        <br><br/>

        <input type="submit" name="addPlace" value="Add Place"/>
    </form>
</div>