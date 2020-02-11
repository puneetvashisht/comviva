package com.viva;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 public EmployeeRepository repo = new EmployeeRepository();

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		1. Get employees from DB
		List<Employee> employees = repo.fetchAllEmployees();
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("employees.jsp");
		request.setAttribute("emps", employees);
		dispatcher.forward(request, response);
//		2. response with list of employees
		
//		response.getWriter().append("Served at: ").append(employees.toString());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
