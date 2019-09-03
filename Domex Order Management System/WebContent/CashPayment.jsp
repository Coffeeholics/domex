<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Cash Payment</title>
<link href='https://fonts.googleapis.com/css?family=Nunito:400,300'
	rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="CSS/Payment.css">
</head>
<body style = "background-image:url('Images/i5.jpg');">
<div class="navigationbar">
  	<a href="Home.jsp">Home</a>
  	<a href="Order.jsp">Order</a>
  	<a href="PaymentMethod.jsp">Payment Method</a>
  	<a href="Myaccount.html">My Account</a>
</div>
<form action="AddCashServlet" method="post">

		<p>
			</br>
		</p>
		<h1>Cash Payment</h1>
		<p></p>

		<fieldset>
			
			<p></p>
			<label for="name"> Amount: </label> 
			<input type="text" id="amount" name="amount"> 
			
			<label for="name">Delivery Date:</label> 
			<input type="text" id="deliveryDate" name="deliveryDate">
			
			<label for="name">Delivery Address:</label> 
			<input type="text" id="deliveryAddress" name="deliveryAddress">

		</fieldset>

			<button type="submit">Pay</button>
			<p></p>
			<button type="reset">Reset</button>
			<p></p>
		
	</form>
</body>
</html>