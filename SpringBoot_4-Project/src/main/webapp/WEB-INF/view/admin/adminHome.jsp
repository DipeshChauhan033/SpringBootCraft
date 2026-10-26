<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Admin Panel</h2>
	
	<a href="${pageContext.request.contextPath}/client/home">Client Home</a><br><br>
	
	<a href="${pageContext.request.contextPath}/admin/readAllContacts">Read All Contacts</a><br><br>
	
	<a href="${pageContext.request.contextPath}/admin/addService" >Add New Service</a>
</body>
</html>