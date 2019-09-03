package Model;

public class CashPayment{
	private int orderPaymentID;
	private String clientID;
	private String amount;
	private String deliveryDate;
	private String deliveryAddress;
	
	public CashPayment() {
		super();
	}

	public CashPayment(int orderPaymentID, String clientID, String amount, String deliveryDate,
			String deliveryAddress) {
		super();
		this.orderPaymentID = orderPaymentID;
		this.clientID = clientID;
		this.amount = amount;
		this.deliveryDate = deliveryDate;
		this.deliveryAddress = deliveryAddress;
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

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

}
