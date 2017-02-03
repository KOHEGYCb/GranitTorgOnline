<%-- 
    Document   : addPlace
    Created on : 03.02.2017, 15:12:58
    Author     : Dmitry
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:include flush="true" page="../header.jsp"/>
<form action="addPlace" method="post">
    <input type="text" name="place" value="${place}"/>
    <br><span>${wrongPlace}</span>
    <br><br/>

    <input type="submit" name="addPlace" value="Add Place"/>
</form>
<jsp:include flush="true" page="../footer.jsp"/>