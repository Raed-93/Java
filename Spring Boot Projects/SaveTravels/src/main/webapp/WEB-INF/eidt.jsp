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
    <title>Add Travel</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
<h1>Save Travels</h1>



<h1>Eidt Travel</h1>
<form:form action="/eidt/${travel.id}" mode="put" modelAttribute="travel">
<div>
 <form:label path="name">Expense Name</form:label><br>
        <form:errors path="name"/>
        <form:input path="name"/>
</div>

<div>
 <form:label path="vendor">Vendor</form:label><br>
        <form:errors path="vendor"/>
        <form:input path="vendor"/>
</div>

<div>
 <form:label path="amount">Amount</form:label><br>
        <form:errors path="amount"/>
        <form:input path="amount"/>
</div>

<div>
 <form:label path="description">Description</form:label><br>
        <form:errors path="description"/>
        <form:textarea path="description"/>
</div>

<div>
 <input type="submit" value="Submit"/>
</div>
</form:form>

</body>
</html>

