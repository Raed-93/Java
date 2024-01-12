<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Title: <c:out value="${travel.name}"/></h1>
<p>Description: <c:out value="${travel.vendor}"/></p>
<p>language: <c:out value="${travel.amount}"/></p>
<p>pages: <c:out value="${travel.description}"/></p>
</body>
</html>