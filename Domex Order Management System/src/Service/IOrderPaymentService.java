package Service;

import java.sql.SQLException;
import java.util.ArrayList;

import Model.CardPayment;
import Model.CashPayment;
import Model.ChequePayment;

public interface IOrderPaymentService {
	
	boolean addNewOrderPayment (CashPayment c1) throws SQLException;
	boolean addNewOrderPayment (ChequePayment ch1) throws SQLException;
	boolean addNewOrderPayment (CardPayment ca1) throws SQLException;
		
	public ArrayList<CashPayment> getCashPayments() throws SQLException;
	public ArrayList<ChequePayment> getChequePayments() throws SQLException;
	public ArrayList<CardPayment> getCardPayments() throws SQLException;
	
	boolean deleteCashPayment(String orderPaymentID) throws SQLException;
	boolean deleteChequePayment(String orderPaymentID) throws SQLException;
	boolean deleteCardPayment(String orderPaymentID) throws SQLException;

}
