package Model;

import java.sql.Date;

public class CashPayment{
	private int cashPID;
	private String amount;
	private String deliveryDate;
	private String deliveryAddress;
	private int regularCID;
	private int corporateCID;
	
	public CashPayment() {
		super();
	}

	public CashPayment(int cashPID, String amount, String deliveryDate, String deliveryAddress, int regularCID,
			int corporateCID) {
		super();
		this.cashPID = cashPID;
		this.amount = amount;
		this.deliveryDate = deliveryDate;
		this.deliveryAddress = deliveryAddress;
		this.regularCID = regularCID;
		this.corporateCID = corporateCID;
	}

	public int getCashPID() {
		return cashPID;
	}

	public void setCashPID(int cashPID) {
		this.cashPID = cashPID;
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

	public int getRegularCID() {
		return regularCID;
	}

	public void setRegularCID(int regularCID) {
		this.regularCID = regularCID;
	}

	public int getCorporateCID() {
		return corporateCID;
	}

	public void setCorporateCID(int corporateCID) {
		this.corporateCID = corporateCID;
	}

	
}
