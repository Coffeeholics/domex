<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Payment Method</title>
<link href='https://fonts.googleapis.com/css?family=Nunito:400,300'
	rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="CSS/PaymentMethod.css">
</head>
<body style = "background-image:url('Images/i5.jpg');">
<div class="navigationbar">
  	<a href="Home.jsp">Home</a>
  	<a href="Order.jsp">Order</a>
  	<a href="Myaccount.html">My Account</a>
	</div>
	
	<div id="box1" style = "background-image:url('Images/i9.jpg');padding-left:30px;"><br>
		<div id = "box2" style = "background: white;padding-left:10px;padding-right:5px;">
			<br><h2>Select Payment Method</h2>
  
			<a href="CashPayment.jsp" class="classred">Cash Payment</a><br><br>
			<a href = "ChequePayment.jsp" class = "classyellow">Cheque Payment</a><br><br>
			<a href = "CardPayment.jsp" class = "classgreen">Card Payment</a><br><br><br><br>
		</div>
     </div> 
</body>
</html>