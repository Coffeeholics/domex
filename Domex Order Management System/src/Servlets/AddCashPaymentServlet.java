package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.CashPayment;
import Service.IOrderPaymentService;
import Service.IOrderPaymentServiceImplement;

/**
 * Servlet implementation class AddCashPaymentServlet
 */
@WebServlet("/AddCashPaymentServlet")
public class AddCashPaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCashPaymentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		CashPayment c1 = new CashPayment();
		
		String clientID = request.getParameter("clientID");
		String amount = request.getParameter("amount");
		String deliveryDate = request.getParameter("deliveryDate");
		String deliveryAddress = request.getParameter("deliveryAddress");
	
		if(clientID.equals("") || amount.equals("")|| deliveryDate.equals("") ||deliveryAddress.equals("")  ) {
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('Fill all Details')");
			out.println("</script>");
			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/CashPayment.jsp");
			dispatcher.include(request, response);
		}	
		
		else if(!amount.matches("^[0-9]+$")) {
			PrintWriter writer = response.getWriter();
			
			writer.println("<script>");
			writer.println("alert('Amount must be numbers only')");
			writer.println("</script>");
			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/CashPayment.jsp");
			dispatcher.include(request, response);
			
		}
	
		else {
			c1.setClientID(clientID);
			c1.setAmount(amount);
			c1.setDeliveryDate(deliveryDate);
			c1.setDeliveryAddress(deliveryAddress);
		}
		
		IOrderPaymentService iPaymentService = new IOrderPaymentServiceImplement();
		

		try {
			boolean isadded = iPaymentService.addNewOrderPayment(c1);
			
			if(isadded == true) {	
					System.out.println("Success");
					
					PrintWriter writer = response.getWriter();
					
					writer.println("<script>");
					writer.println("alert('Added Successfully')");
					writer.println("</script>");
					
					
					RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/CashPayment.jsp");
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
