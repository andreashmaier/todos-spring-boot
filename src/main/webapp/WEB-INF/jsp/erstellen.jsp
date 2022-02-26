<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html lang="de">
<head>
    <meta charset="UTF-8">
    <title>Neues Todo erstellen</title>
    <link href="/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
<div class="container">
    <p class="text-danger"><c:out value="${message}"/></p>
    <form action="erstelleTodo" method="post">
        <div class="form-group">
            <label for="todo">Bezeichnung</label>
            <input class="form-control" id="todo" name="bezeichnung" type="test">
        </div>
        <div class="form-group">
            <label for="prio">Priorität</label>
            <input class="form-control" id="prio" name="prio" type="number">
        </div>
        <button class="btn btn-primary" type="submit">Erstellen</button>
    </form>
</div>
</body>
<script src="/webjars/jquery/3.1.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/3.3.7-1/js/bootstrap.min.js"></script>
</html>