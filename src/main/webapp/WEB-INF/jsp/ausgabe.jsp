<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


<!DOCTYPE html>
<html lang="de">
<head>
    <meta charset="UTF-8">
    <title>Todos anzeigen</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css"/>
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
                    <td>Aktion</td>
                </tr>
                </thead>
                <c:forEach items="${todos}" var="todo">
                    <tbody>
                    <tr>
                        <td><c:out value="${todo.bezeichnung}"/></td>
                        <td><c:out value="${todo.prioritaet}"/></td>
                        <td><a class="btn btn-danger" href="loeschen?id=${todo.uuid}">Löschen</a></td>
                    </tr>
                    </tbody>
                </c:forEach>
            </table>

        </c:otherwise>
    </c:choose>
    <a class="btn btn-success" href="/erstelle">Neues Todo erstellen</a>
    <a class="btn btn-success" href="/neu.html">Neues Todo via REST erstellen</a>
</div>
<script src="${pageContext.request.contextPath}/webjars/jquery/3.1.1/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/webjars/bootstrap/3.3.7-1/js/bootstrap.min.js"></script>
</body>
</html>