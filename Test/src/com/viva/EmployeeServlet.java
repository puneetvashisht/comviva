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
		
		System.out.println("test*********");
		
		String name = request.getParameter("color");
		
//		while(request.getParameterNames().hasMoreElements()){
//			System.out.println(request.getParameterNames().nextElement());
//		}
		System.out.println(name);
		
//		1. Get employees from DB
		List<Employee> employees = repo.fetchAllEmployees();
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("employees.jsp");
		request.setAttribute("emps", employees);
		request.setAttribute("color", name);
		dispatcher.forward(request, response);
//		2. response with list of employees
		
//		response.getWriter().append("Param at: ").append(name);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Integer id = Integer.valueOf(request.getParameter("id")) ;
//		String id = request.getParameter("id");
		String name = request.getParameter("name");
		Employee emp =  new Employee(id,name, 0.0d);
		
		System.out.println(emp);
		response.getWriter().append("Done");
//		repo
//		doGet(request, response);
	}

}
