package Servlets;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Employee;
import Service.EmployeeServiceImplement;
import Service.IEmployeeService;


public class AddEmployeeServlets extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddEmployeeServlets() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		
		Employee employee = new Employee();
		
		Date dob = null;
		
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String address = request.getParameter("address");
		String gender = request.getParameter("gender");
		try {
		dob = (Date) new SimpleDateFormat("yyyy-mm-dd").parse(request.getParameter("dob"));
		}catch(ParseException e) {
			e.printStackTrace();
		}
		String contactNo = request.getParameter("contactNo");
		String email = request.getParameter("email");
		String qualification = request.getParameter("qualification");
		String type = request.getParameter("type");
	
		if(fname.equals("") ||lname.equals("") || address.equals("") || gender.equals("") || contactNo.equals("") || email.equals("") ||qualification.equals("") || type.equals("")) {
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('Fill all Details')");
			out.println("</script>");
			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/AddEmployee.jsp");
			dispatcher.include(request, response);
		}	
		else if(!fname.matches("^[a-zA-Z]+$")) {
			PrintWriter writer = response.getWriter();
			
			writer.println("<script>");
			writer.println("alert('First name must be letters only')");
			writer.println("</script>");
			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/AddEmployee.jsp");
			dispatcher.include(request, response);
			
		}else if(!lname.matches("^[a-zA-Z]+$")) {
			PrintWriter writer = response.getWriter();
			
			writer.println("<script>");
			writer.println("alert('Last name must be letters only')");
			writer.println("</script>");
			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/AddEmployee.jsp");
			dispatcher.include(request, response);
			
		}
		else if(!address.matches("^[a-zA-Z]+$")) {
			PrintWriter writer = response.getWriter();
			
			writer.println("<script>");
			writer.println("alert('Address must be letters only')");
			writer.println("</script>");
			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/AddEmployee.jsp");
			dispatcher.include(request, response);
			
		}
		else if(!gender.matches("^[a-zA-Z]+$")) {
			PrintWriter writer = response.getWriter();
			
			writer.println("<script>");
			writer.println("alert('Gender must be letters only')");
			writer.println("</script>");
			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/AddEmployee.jsp");
			dispatcher.include(request, response);
	
			
		}
		else if(!contactNo.matches("^[0-9]+$")) {
			PrintWriter writer = response.getWriter();
			
			writer.println("<script>");
			writer.println("alert('Contact number must be numbers only')");
			writer.println("</script>");
			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/AddEmployee.jsp");
			dispatcher.include(request, response);
			
		}
		else if(!type.matches("^[a-zA-Z]+$")) {
			PrintWriter writer = response.getWriter();
			
			writer.println("<script>");
			writer.println("alert('Type must be letters only')");
			writer.println("</script>");
			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("AddEmployee.jsp");
			dispatcher.include(request, response);
		}
		else {
			employee.setFname(fname);
			employee.setLname(lname);
			employee.setAddress(address);
			employee.setGender(gender);
			employee.setDob(dob);
			employee.setContactNo(contactNo);
			employee.setEmail(email);
			employee.setQualifications(qualification);
			employee.setType(type);
			
		}
		
		IEmployeeService iEmployeeService = new EmployeeServiceImplement();

		try {
			boolean isadded = iEmployeeService.addNewEmployee(employee);
			
			if(isadded == true) {	
					System.out.println("Success");
					
					PrintWriter writer = response.getWriter();
					
					writer.println("<script>");
					writer.println("alert('Added Successfully')");
					writer.println("</script>");
					
					
					RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/AddEmployee.jsp");
					dispatcher.include(request, response);
			}
			else
				System.out.println("Error");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
