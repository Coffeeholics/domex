package Model;

public class ChequePayment{
	private int orderPaymentID;
	private String clientID;
	private String amount;
	private String chequeNumber;
	private String bank;

	public ChequePayment() {
		super();
	}

	public ChequePayment(int orderPaymentID, String clientID, String amount, String chequeNumber, String bank) {
		super();
		this.orderPaymentID = orderPaymentID;
		this.clientID = clientID;
		this.amount = amount;
		this.chequeNumber = chequeNumber;
		this.bank = bank;
	}

	public int getOrderPaymentID() {
		return orderPaymentID;
	}

	public void setOrderPaymentID(int orderPaymentID) {
		this.orderPaymentID = orderPaymentID;
	}

	public String getClientID() {
		return clientID;
	}

	public void setClientID(String clientID) {
		this.clientID = clientID;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getChequeNumber() {
		return chequeNumber;
	}

	public void setChequeNumber(String chequeNumber) {
		this.chequeNumber = chequeNumber;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

}
