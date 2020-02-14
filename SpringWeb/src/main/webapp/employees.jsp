<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>View Employees</h2>
	
		<table>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Salary</th>
			</tr>
		<c:forEach items="${emps}" var="employee">
			
			<tr>
				<td>${employee.id}</td>
				<td>${employee.name}</td>
				<td>${employee.salary}</td>
			</tr>
			</c:forEach>
		</table>
    		<br>
</body>
</html>