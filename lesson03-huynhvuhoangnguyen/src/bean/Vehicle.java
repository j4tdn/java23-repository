package bean;

public class Vehicle {
	
	private String ownerName;
	private double price;
	private int engineCapacity;
	
	public Vehicle() {
	}

	public Vehicle(String ownerName, double price, int engineCapacity) {
		this.ownerName = ownerName;
		this.price = price;
		this.engineCapacity = engineCapacity;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	
	public void displayInfo() {
		System.out.printf("%-20s %-15.2f %-15d %-15.2f\n", ownerName, price, engineCapacity, 
				CalculateTax.calculateTax(price, engineCapacity));
	}
	
}
