package Model;

public class Vehicle {

	private int vehicleID;
	private String vehicleNumber;
	private String vehicleModel;
	private String vehicleBrand;
	private int employeeID;
	
	public Vehicle() {
		
	}

	public Vehicle(int vehicleID, String vehicleNumber, String vehicleModel, String vehicleBrand, int employeeID) {
	super();
	this.vehicleID = vehicleID;
	this.vehicleNumber = vehicleNumber;
	this.vehicleModel = vehicleModel;
	this.vehicleBrand = vehicleBrand;
	this.employeeID = employeeID;
	}

public int getVehicleID() {
	return vehicleID;
}

public void setVehicleID(int vehicleID) {
	this.vehicleID = vehicleID;
}

public String getVehicleNumber() {
	return vehicleNumber;
}

public void setVehicleNumber(String vehicleNumber) {
	this.vehicleNumber = vehicleNumber;
}

public String getVehicleModel() {
	return vehicleModel;
}

public void setVehicleModel(String vehicleModel) {
	this.vehicleModel = vehicleModel;
}

public String getVehicleBrand() {
	return vehicleBrand;
}

public void setVehicleBrand(String vehicleBrand) {
	this.vehicleBrand = vehicleBrand;
}

public int getEmployeeID() {
	return employeeID;
}

public void setEmployeeID(int employeeID) {
	this.employeeID = employeeID;
}

}