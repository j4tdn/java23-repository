package bean;

public class Vehicle {

	private String ownerName;
	private String type;
	private int capacity;
	private double price;
	
	public Vehicle() {
		
	}

	public Vehicle(String ownerName, String type, int capacity, double price) {
		this.ownerName = ownerName;
		this.type = type;
		this.capacity = capacity;
		this.price = price;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [ownerName=" + ownerName + ", type=" + type + ", capacity=" + capacity + ", price=" + price
				+ "]";
	}
	
	public double calculateTax() {
		double tax;
		if(capacity < 100)
			return tax = price * 0.01;
		if(capacity <= 200)
			return tax = price * 0.03;
		return tax = price * 0.05;
	}
}
