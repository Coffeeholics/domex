package Model;

public class ChequePayment{
	private int chequePID;
	private String amount;
	private String chequeNumber;
	private String bank;
	private int regularCID;
	private int corporateCID;

	public ChequePayment() {
		super();
	}

	public ChequePayment(int chequePID, String amount, String chequeNumber, String bank, int regularCID,
			int corporateCID) {
		super();
		this.chequePID = chequePID;
		this.amount = amount;
		this.chequeNumber = chequeNumber;
		this.bank = bank;
		this.regularCID = regularCID;
		this.corporateCID = corporateCID;
	}

	public int getChequePID() {
		return chequePID;
	}

	public void setChequePID(int chequePID) {
		this.chequePID = chequePID;
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
