<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Burgers</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
<h1>Tracker Burgers2</h1>



<h1>Eidt Burger</h1>
<form:form action="/eidt/${burger.id}" mode="put" modelAttribute="burger">
<div>
 <form:label path="name">Burger Name</form:label><br>
        <form:errors path="name"/>
        <form:input path="name"/>
</div>

<div>
 <form:label path="restaurant">Restaurant Name</form:label><br>
        <form:errors path="restaurant"/>
        <form:input path="restaurant"/>
</div>

<div>
 <form:label path="name">Rating</form:label><br>
        <form:errors path="rating"/>
        <form:input path="rating"/>
</div>

<div>
 <form:label path="notes">Notes</form:label><br>
        <form:errors path="notes"/>
        <form:textarea path="notes"/>
</div>

<div>
 <input type="submit" value="Submit"/>
</div>
</form:form>

</body>
</html>

