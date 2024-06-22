package car;

public class Vehicle {

	private String owner;
	private String transportation;
	private Double capacity;
	private Double price;
//	private Double tax;
	
	
	public Vehicle() {

	}
	public Vehicle(String owner, String transportation, Double capacity, Double price, Double tax) {
		this.owner = owner;
		this.transportation = transportation;
		this.capacity = capacity;
		this.price = price;
//		this.tax = tax;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getTransportation() {
		return transportation;
	}

	public void setTransportation(String transportation) {
		this.transportation = transportation;
	}

	public Double getCapacity() {
		return capacity;
	}

	public void setCapacity(Double capacity) {
		this.capacity = capacity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

//	public Double getTax() {
//		return tax;
//	}
//
//	public void setTax(Double tax) {
//		this.tax = tax;
//	}
	
	public Double moneyTax(int percent) {
		return price * percent / 100;
	}

//	@Override
//	public String toString() {
//		return "Vehicle [owner=" + owner + ", transportation=" + transportation + ", capacity=" + capacity + ", price="
//				+ price + ", tax=" + tax + "]";
//	}

	
	


	
	
}
	

	