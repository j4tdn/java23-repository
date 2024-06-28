package vehicles;

public class Vehicle {
	private String ownerName;
    private String vehicleType;
    private double cylinderCapacity;
    private double vehicleValue;
    private double taxValue;
 
    public Vehicle() {
		// TODO Auto-generated constructor stub
	}

    
	public Vehicle(String ownerName, String vehicleType, double cylinderCapacity, double vehicleValue) {
		super();
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
		this.cylinderCapacity = cylinderCapacity;
		this.vehicleValue = vehicleValue;
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

	public double getCylinderCapacity() {
		return cylinderCapacity;
	}

	public void setCylinderCapacity(double cylinderCapacity) {
		this.cylinderCapacity = cylinderCapacity;
	}

	public double getVehicleValue() {
		return vehicleValue;
	}

	public void setVehicleValue(double vehicleValue) {
		this.vehicleValue = vehicleValue;
	}

	public double getTaxValue() {
		 if (cylinderCapacity < 100) {
	            return vehicleValue * 0.01;
	        } else if (cylinderCapacity <= 200) {
	            return vehicleValue * 0.03;
	        } else {
	            return vehicleValue * 0.05;
	        }
	}


	public void setTaxValue(double taxValue) {
		this.taxValue = taxValue;
	}

	@Override
	public String toString() {
		return "Vehicle [ownerName=" + ownerName + ", vehicleType=" + vehicleType + ", cylinderCapacity="
				+ cylinderCapacity + ", vehicleValue=" + vehicleValue + ", taxValue=" + taxValue + "]";
	}
    
}
