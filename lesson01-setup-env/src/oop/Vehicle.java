package oop;

public class Vehicle {
	private String ownerName;
	private String vehicleType;
	private Double cylinderCapacity;
	private Double vehicleValue;
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public Double getCylinderCapacity() {
		return cylinderCapacity;
	}

	public void setCylinderCapacity(Double cylinderCapacity) {
		this.cylinderCapacity = cylinderCapacity;
	}

	public Double getVehicleValue() {
		return vehicleValue;
	}

	public void setVehicleValue(Double vehicleValue) {
		this.vehicleValue = vehicleValue;
	}

	public Vehicle(String ownerName, String vehicleType, Double cylinderCapacity, Double vehicleValue) {
		super();
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
		this.cylinderCapacity = cylinderCapacity;
		this.vehicleValue = vehicleValue;
	}
	public double calculateTax() {
		if(cylinderCapacity < 100) {
			return vehicleValue *0.01;
		}else if(cylinderCapacity <= 200) {
			return vehicleValue * 0.03;
		}else  {
			return vehicleValue *0.05;
		}
	}
	 public void displayInfo() {
	        System.out.printf("%-20s %-15s %-15d %-15.2f %-15.2f%n",
	                ownerName, vehicleType, cylinderCapacity, vehicleValue, calculateTax());
	 }
	@Override
	public String toString() {
	    return "Vehicle [ownerName=" + ownerName + ", vehicleType=" + vehicleType + 
	           ", cylinderCapacity=" + cylinderCapacity + ", vehicleValue=" + vehicleValue + 
	           ", tax=" + calculateTax() + "]";
	}
	
}
