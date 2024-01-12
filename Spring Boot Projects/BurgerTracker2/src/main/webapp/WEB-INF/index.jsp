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

  <table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">Burger Name</th>
      <th scope="col">Restaurant Name</th>
      <th scope="col">Rating</th>
       <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
  
   <c:forEach var="burger" items="${burgers}">
    <tr>
      <td><c:out value="${burger.name}"/></td>
      <td><c:out value="${burger.restaurant}"/></td>
      <td><c:out value="${burger.rating}"/></td>
      <td><a href="/eidt/${burger.id}">Eidt</a></td>
    </tr>
    </c:forEach>
    
</table>

<h1>Add Burger</h1>
<form:form action="/addBurger" mode="post" modelAttribute="burger">
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

