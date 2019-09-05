<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Add Employee Details</title>
<link href='https://fonts.googleapis.com/css?family=Nunito:400,300'
	rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="CSS/AddEmployee.css">
</head>

<body style = "background-image:url('Images/i5.jpg'); position = fixed;">
<div class="navigationbar">
  	<a href="Home.jsp">Home</a>
  	<a href="EmployeeList.jsp">EmployeeList</a>
  	<a href="Attendence.jsp">Attendance</a>
  	<a href="Myaccount.html">My Account</a>
</div>


	<form method="post" action="AddEmployeeServlets" >

		<p>
			</br>
		</p>
		<h1>Add Employee Details</h1>
		<p></p>

		<fieldset>
			
			<label for="name">First Name:</label> 
			<input type="text" id="fname" name="fname"> <label for="Name">
			
			<label for="name">Last Name:</label> 
			<input type="text" id="lname" name="lname"> <label for="Name">
			
			<label for="name">Address:</label> 
			<input type="text" id="address" name="address">
			
			<label for="name">Gender:</label> 
			<input type="text" id="gender" name="gender">
			
			<label for="name">Date of Birth:</label> 
			<input type="text" id="dob" name="dob">
			
			<label for="name">Contact Number:</label> 
			<input type="text" id="contactNo" name="contactNo"> 
			
			<label for="name">Email:</label>
			<input type="text" id="email" name="email">
			
			<label for="name">Qualifications:</label> 
			<input type="text" id="qualifications" name="qualifications">
			
			<label for="name"> Employee Type: </label> 
			<input type="text" id="type" name="type"> 
			 
			

		</fieldset>

			<button type="submit">Submit</button>
			<p></p>
			<button type="reset">Reset</button>
			<p></p>

		
	</form>

	
</body>
</html>