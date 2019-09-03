package Model;

public class Employee {
	
	private String employeeID;
	private String fname;
	private String lname;
	private String address;
	private String gender;
	private String dob;
	private String contactNo;
	private String email;
	private String qualifications;
	private String type;
	
	public Employee() {
		
	}

	public Employee(String employeeID, String fname, String lname, String address, String gender, String dob,
			 String contactNo, String email, String qualifications, String type) {
		super();
		this.employeeID = employeeID;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.gender = gender;
		this.dob = dob;
		this.contactNo = contactNo;
		this.email = email;
		this.qualifications = qualifications;
		this.type = type;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQualifications() {
		return qualifications;
	}

	public void setQualifications(String qualifications) {
		this.qualifications = qualifications;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}