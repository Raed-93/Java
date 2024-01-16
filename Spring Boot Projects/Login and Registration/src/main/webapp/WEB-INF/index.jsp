<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login and Register</title>
</head>
<body>
<h1>Welcome!</h1>

<form:form action="/register" mode="post" modelAttribute="newUser">
<h1>Register</h1>
<div>
 <form:label path="userName">User Name: </form:label><br>
        <form:input path="userName"/>
</div>

<div>
 <form:label path="email">Email: </form:label><br>
        <form:input path="email"/>
</div>

<div>
 <form:label path="password">Password: </form:label><br>
        <form:input type="password" path="password"/>
</div>

<div>
 <form:label path="confirm">Confirm PW</form:label><br>
        <form:errors path="confirm"/>
        <form:input  type="password" path="confirm"/>
</div>

<div>
 <input type="submit" value="Submit"/>
</div>
<br>
<div>

		<p><form:errors path="userName"/></p>
		<p> <form:errors path="email"/></p>
		<p><form:errors path="password"/></p>
		<p><form:errors path="confirm"/></p>
</div>
</form:form>



<form:form action="/login" mode="post" modelAttribute="newLogin">
<h1>Log in</h1>
<div>
 <form:label path="email">Email: </form:label><br>
        <form:errors path="email"/>
        <form:input path="email"/>
</div>

<div>
 <form:label path="password">Password: </form:label><br>
        <form:errors path="password"/>
        <form:input  type="password" path="password"/>
</div>

<div>
 <input type="submit" value="Submit"/>
</div>
</form:form>
</body>
</html>