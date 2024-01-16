
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
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>New Ninja</h1>

<form:form action="/addNinja" mode="post" modelAttribute="ninja">

<div>
 <form:label path="dojo">Dojo</form:label><br>
  <form:select path="dojo">
 <c:forEach var="dojo"  items="${dojos}">
 <form:option value="${dojo}"> <c:out value="${dojo.name}"/> </form:option>
 </c:forEach>
 </form:select>
</div>

<div>
 <form:label path="firstName">First Name</form:label><br>
        <form:errors path="firstName"/>
        <form:input path="firstName"/>
</div>

<div>
 <form:label path="lastName">Last Name</form:label><br>
        <form:errors path="lastName"/>
        <form:input path="lastName"/>
</div>

<div>
 <form:label path="age">Age</form:label><br>
        <form:errors path="age"/>
        <form:input path="age"/>
</div>



<div>
 <input type="submit" value="Create"/>
</div>
</form:form>

</body>
</html>