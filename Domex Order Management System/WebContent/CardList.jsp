<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Model.CardPayment" %>
<%@ page import="Service.IOrderPaymentService" %>
<%@ page import="Service.IOrderPaymentServiceImplement"%>
<%@ page import="java.util.ArrayList"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Card Payment List</title>
</head>
<body>
       <h2>Card Payment List</h2>
	  <table>
         <thead>
		                                   
				<th>CardPID</th>
                <th>Card type</th>
                <th>Card number</th>
                <th>Amount</th>
                <th>Expiry Date</th>
                <th>CCV</th> 
                <th>RegularCID</th>
                <th>CorporateCID</th>  
										
            </thead>
            <tbody>
                 <%IOrderPaymentService iCardPaymentService = new IOrderPaymentServiceImplement();
                  ArrayList<CardPayment> calist = iCardPaymentService.getCardPayments();
                                      
                  for(CardPayment ca1 : calist){
                  %>
                  <tr>
                      <td> <%=ca1.getCardPID() %> </td>
                      <td> <%=ca1.getCardType() %> </td>
                      <td> <%=ca1.getCardNumber() %> </td>
                      <td> <%=ca1.getAmount() %> </td>
                      <td> <%=ca1.getExpiryDate() %> </td>
                      <td> <%=ca1.getCcv() %> </td>
                      <td> <%=ca1.getRegularCID() %> </td>
                      <td> <%=ca1.getCorporateCID() %></td>
             
					<td>
					   <form action="DeleteCardPaymentServlet" method="post">
							<input type="hidden" name="deletePayment" value="<%=ca1.getCardPID()%>">
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