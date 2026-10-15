<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Page</title>
</head>
<body>
	<form action="save_registration.do" method="post">
        <input type="number" name="id" placeholder="Enter Id">
        <br><br>
		<input type="text" name="name" placeholder="Enter Name">
		<br><br>
		<input type="text" name="address" placeholder="Enter Address">
        <br><br>
        <input type="number" name="salary" placeholder="Enter Salary">
        <br><br>

        <input type="submit" value="Register"><br><br>
     </form><br>
     <h1>${message}</h1>
</body>
</html>