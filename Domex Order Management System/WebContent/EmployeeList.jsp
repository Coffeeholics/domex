<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Model.Employee" %>
<%@ page import="Service.IEmployeeService" %>
<%@ page import="Service.EmployeeServiceImplement"%>
<%@ page import="java.util.ArrayList"%>       
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee List</title>
</head>
<body>
<br>
	<h1><center>Employee Lists</center></h1>
	<table>
         <thead>
		                                   
			<th><b>Employee ID</b></th>
			<th><b>First Name</b></th>
			<th><b>Last Name</b></th>
			<th><b>Address</b></th>
			<th><b>Gender</b></th>
			<th><b>Date of Birth</b></th>
			<th><b>Contact Number</b></th>
			<th><b>Email</b></th>
			<th><b>Qualifications</b></th>
			<th><b>Employee Type</b></th> 
										
            </thead>
              <tbody>
                 <%IEmployeeService iEmployeeService = new EmployeeServiceImplement();
                  ArrayList<Employee> list = iEmployeeService.getEmployee();
                                      
                  for(Employee e1 : list){
                  %>
                  <tr>
                      <td> <%=e1.getEmployeeID() %> </td>
                      <td> <%=e1.getFname() %> </td>
                      <td> <%=e1.getLname() %> </td>
                      <td> <%=e1.getAddress() %> </td>
                      <td> <%=e1.getGender() %> </td>
                      <td> <%=e1.getDob() %> </td>
                      <td> <%=e1.getContactNo() %> </td>
                      <td> <%=e1.getEmail() %> </td>
                      <td> <%=e1.getQualifications() %> </td>
                      <td> <%=e1.getType() %> </td>
                      
             
					<td>
					   <form action="DeleteEmployeeServlets" method="post">
							<input type="hidden" name="deleteEmployee" value="<%=e1.getEmployeeID()%>">
							<input type="submit" name="btnDelete" value="Delete" style=" background-color: purple;border: none; color: white;padding: 10px 32px; text-decoration: none;margin: 4px 2px;cursor: pointer;border-radius: 5%;font-weight:bold;">
						</form>
											
					</td>
				   </tr>
										
					<%
					 }
										
					%>                            
            </tbody>                         
      </table>
</body>
</html>