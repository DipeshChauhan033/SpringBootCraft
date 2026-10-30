<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
    
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Showing Admin Side Services</title>

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/vendors/linericon/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font-awesome.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/vendors/owl-carousel/owl.carousel.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/magnific-popup.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/vendors/nice-select/css/nice-select.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
</head>
<body>

	<div class="row feature_inner">

		<c:forEach var="service" items="${listOfServices }">
		                <div class="col-lg-4 col-md-8">
		                    <div class="feature_item">
		                        <img style="width: 100%; height:auto" src="${pageContext.request.contextPath}/img/services/${service.filename}" alt="WordPress Development">
		                        <h4>${service.title}</h4>
		                        <p>${service.description}</p>
		                    </div>
		                    <a href="#">Update</a>
		               		 <a href="#">Delete</a>
		                </div>
		                
		                
		</c:forEach>

	</div>
</body>
</html>