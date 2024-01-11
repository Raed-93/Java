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
<h1>Title: <c:out value="${books.title}"/></h1>
<p>Description: <c:out value="${books.description}"/></p>
<p>language: <c:out value="${books.language}"/></p>
<p>pages: <c:out value="${books.numberOfPages}"/></p>
</body>
</html>