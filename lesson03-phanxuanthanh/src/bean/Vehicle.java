package bean;

public class Vehicle {
	private String carOwner; // Chủ xe
	private String category; // Loại xe
	private int capacity; // Dung tích
	private double cost; // Giá bán
	private double Tax; // Thuế phải nộp
	
	public Vehicle() {

	}

	public Vehicle(String carOwner, String category, int capacity, double cost) {
		super();
		this.carOwner = carOwner;
		this.category = category;
		this.capacity = capacity;
		this.cost = cost;
		
		if(capacity < 100) {
			this.Tax = 1/100.0 * this.cost;
		} else if(capacity < 200) {
			this.Tax = 3/100.0 * this.cost;
		} else {
			this.Tax = 5/100.0 * this.cost;
		}
	}

	public String getCarOwner() {
		return carOwner;
	}

	public void setCarOwner(String carOwner) {
		this.carOwner = carOwner;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getTax() {
		return Tax;
	}

	public void setTax(double tax) {
		Tax = tax;
	}

	@Override
	public String toString() {
		return "verhicle [carOwner=" + carOwner + ", category=" + category + ", capacity=" + capacity + ", cost=" + cost
				+ ", Tax=" + Tax + "]";
	}
	
	
}
