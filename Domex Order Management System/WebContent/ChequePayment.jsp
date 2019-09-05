<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Cheque Payment</title>
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

<form  method="post" action="AddChequePaymentServlet">

		<p>
			</br> 
		</p>
		<h1>Cheque Payment</h1>
		<p></p>

		<fieldset>
			
			<p></p>
			<label for="name"> Amount: </label> 
			<input type="text" id="amount" name="amount"> 
			
			<label for="name">Cheque Number:</label> 
			<input type="text" id="chequeNumber" name="chequeNumber">
			
			<label for="name">Bank:</label> 
			<input type="text" id="bank" name="bank">
			

		</fieldset>

			<button type="submit">Pay</button>
			<p></p>
			<button type="reset">Reset</button>
			<p></p>

		
	</form>

</body>
</body>
</html>