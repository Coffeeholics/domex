<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Model.CashPayment" %>
<%@ page import="Model.ChequePayment" %>
<%@ page import="Model.CardPayment" %>
<%@ page import="Service.IOrderPaymentService" %>
<%@ page import="Service.IOrderPaymentServiceImplement"%>
<%@ page import="java.util.ArrayList"%>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cash Payment List</title>
</head>
<body>
	<br>
	<h1><center>Cash Payment Lists</center></h1>
	<table>
         <thead>
		                                   
				<th>CashPID</th>
                <th>Amount</th>
                <th>Delivery Date</th> 
                <th>Delivery Address</th> 
										
            </thead>
              <tbody>
                 <%IOrderPaymentService iCashPaymentService = new IOrderPaymentServiceImplement();
                  ArrayList<CashPayment> list = iCashPaymentService.getCashPayments();
                                      
                  for(CashPayment c1 : list){
                  %>
                  <tr>
                      <td> <%=c1.getCashPID() %> </td>
                      <td> <%=c1.getAmount() %> </td>
                      <td> <%=c1.getDeliveryDate() %> </td>
                      <td> <%=c1.getDeliveryAddress() %></td>
             
					<td>
					   <form action="DeleteCashPaymentServlet" method="post">
							<input type="hidden" name="deletePayment" value="<%=c1.getCashPID()%>">
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