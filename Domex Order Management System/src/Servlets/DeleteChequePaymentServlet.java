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

import Service.IOrderPaymentService;
import Service.IOrderPaymentServiceImplement;

/**
 * Servlet implementation class DeleteChequePaymentServlet
 */
@WebServlet("/DeleteChequePaymentServlet")
public class DeleteChequePaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteChequePaymentServlet() {
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
		
		int chequePID = Integer.parseInt(request.getParameter("deletePayment"));			
		
		String orderPaymentID = request.getParameter("deletePayment");			
		
		IOrderPaymentService ipaymentService = new IOrderPaymentServiceImplement();
		
		boolean isDeleted = false;
		try {
			isDeleted = ipaymentService.deleteChequePayment(chequePID);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(isDeleted==true) {
			
			PrintWriter writer = response.getWriter();
			
			writer.println("<script>");
			writer.println("alert('Deleted Successfully')");
			writer.println("</script>");
			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/ChequeList.jsp");
			dispatcher.include(request, response);
		}else
			System.out.println("Error");
		
	}

}
