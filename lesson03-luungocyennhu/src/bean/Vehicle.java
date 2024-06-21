package bean;

public class Vehicle {
	private String ownerName;
	private String model;
	private int capacity;
	private double price;
	
	public Vehicle() {
	}

	public Vehicle(String ownerName, String model, int capacity, double price) {
		this.ownerName = ownerName;
		this.model = model;
		this.capacity = capacity;
		this.price = price;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
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
		return "Vehicle [ownerName=" + ownerName + ", model=" + model + ", capacity=" + capacity + ", price=" + price
				+ "]";
	}
	
	public double tax() {
		if (capacity < 100) {
			return price * 0.01;
		} else if (capacity <= 200) {
			return price * 0.03;
		} else {
			return price * 0.05;
		}
	}
}
