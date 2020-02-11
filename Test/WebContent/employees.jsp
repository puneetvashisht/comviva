<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List, com.viva.Employee"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"/>
</head>
<body>
<h2>Display employees here</h2>
<% List<Employee> employees = (List<Employee>)request.getAttribute("emps"); %>

<ul class="list-group">
<% for(Employee e: employees){  %>
  <li class="list-group-item"><%=e.getName() %></li>
  <%} %>
</ul>
</body>
</html>