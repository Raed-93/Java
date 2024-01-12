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
    <title>Tacos</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
   
   <h1>Save Travels</h1>

  <table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">Expense</th>
      <th scope="col">Vendor</th>
      <th scope="col">Amount</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
  
   <c:forEach var="travel" items="${travels}">
    <tr>
      <td><a href="/travel/${travel.id}"> <c:out value="${travel.name}"/> </a></td>
      <td><c:out value="${travel.vendor}"/></td>
      <td><c:out value="${travel.amount}"/></td>
      <td>
	       <a href="/edit/${travel.id}">Edit</a>
	       | 
	       <form action="/delete/${travel.id}" method="post" style="display: inline;">
	           <input type="hidden" name="_method" value="delete">
	           <input type="submit" value="Delete">
	       </form>
     </td>
      
    </tr>
    </c:forEach>
    
</table>

<h1>Add Travel</h1>
<form:form action="/addTravel" mode="post" modelAttribute="travel">
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

