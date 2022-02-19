<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


<!DOCTYPE html>
<html lang="de">
<head>
    <meta charset="UTF-8">
    <title>Todos anzeigen</title>
    <link rel="stylesheet" href="/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css"/>
</head>
<body>
<div class="container">
    <h1>Alle Todos</h1>
    <c:choose>
        <c:when test="${empty todos}">
            Keine Todos gefunden.
        </c:when>
        <c:otherwise>
            <table class="table table-striped">
                <caption>Ihre Todos sind:</caption>
                <thead>
                <tr>
                    <td>Name</td>
                    <td>Priorität</td>
                </tr>
                </thead>
                <c:forEach items="${todos}" var="todo">
                    <tbody>
                    <tr>
                        <td><c:out value="${todo.name}"/></td>
                        <td><c:out value="${todo.prioritaet}"/></td>
                    </tr>
                    </tbody>
                </c:forEach>
            </table>
        </c:otherwise>
    </c:choose>

</div>
<script src="/webjars/jquery/3.1.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/3.3.7-1/js/bootstrap.min.js"></script>
</body>
</html>