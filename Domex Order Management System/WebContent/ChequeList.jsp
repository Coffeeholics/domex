<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Model.ChequePayment" %>
<%@ page import="Service.IOrderPaymentService" %>
<%@ page import="Service.IOrderPaymentServiceImplement"%>
<%@ page import="java.util.ArrayList"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cheque Payment List</title>
</head>
<body>

      <h2>Cheque Payment List</h2>
	  <table>
         <thead>
		                                   
				<th>ChequePID</th>
				<th>Amount</th>
				<th>ChequeNumber</th>
				<th>Bank</th> 
				<th>RegularCID</th>
				<th>CorporateCID</th>
										
            </thead>
             <tbody>
                 <%IOrderPaymentService iChequePaymentService = new IOrderPaymentServiceImplement();
                  ArrayList<ChequePayment> chlist = iChequePaymentService.getChequePayments();
                                      
                  for(ChequePayment ch1 : chlist){
                  %>
                  <tr>
                      <td> <%=ch1.getChequePID() %> </td>
                      <td> <%=ch1.getAmount() %> </td>
                      <td> <%=ch1.getChequeNumber() %> </td>
                      <td> <%=ch1.getBank() %> </td>
                      <td> <%=ch1.getRegularCID() %> </td>
                      <td> <%=ch1.getCorporateCID() %></td>
             
					<td>
					   <form action="DeleteChequePaymentServlet" method="post">
							<input type="hidden" name="deletePayment" value="<%=ch1.getChequePID()%>">
							<input type="submit" name="btnDelete" value="Delete" style=" background-color: purple;border: none; color: white;padding: 10px 32px; text-decoration: none;margin: 4px 2px;cursor: pointer;border-radius: 5%;font-weight:bold;">
						</form>
											
					</td>
				   </tr>
										
					<%
					 }
										
					%>                            
            </tbody>                              
      </table>
      <br><br>
</body>
</html>