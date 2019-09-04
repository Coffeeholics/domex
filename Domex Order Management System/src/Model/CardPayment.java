package Model;

import java.util.Date;

public class CardPayment{
	private int cardPID;
	private String amount;
	private String cardType;
	private String cardNumber;
	private Date expiryDate;
	private String ccv;
	private int regularCID;
	private int corporateCID;
	
	public CardPayment() {
		super();
		
	}

	public CardPayment(int cardPID, String amount, String cardType, String cardNumber, Date expiryDate, String ccv,
			int regularCID, int corporateCID) {
		super();
		this.cardPID = cardPID;
		this.amount = amount;
		this.cardType = cardType;
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
		this.ccv = ccv;
		this.regularCID = regularCID;
		this.corporateCID = corporateCID;
	}

	public int getCardPID() {
		return cardPID;
	}

	public void setCardPID(int cardPID) {
		this.cardPID = cardPID;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getCcv() {
		return ccv;
	}

	public void setCcv(String ccv) {
		this.ccv = ccv;
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
