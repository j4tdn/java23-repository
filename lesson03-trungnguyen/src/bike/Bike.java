package bike;

public class Bike {
	private String owner;
	private String name;
	private int capacity;
	private double price;
	public Bike() {
		
	}
	
	public Bike(String owner, String name, int capacity, double price) {
		super();
		this.owner = owner;
		this.name = name;
		this.capacity = capacity;
		this.price = price;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		return "Bike [name=" + name + ", capacity=" + capacity + ", price=" + price + "]";
	}
	
	
}
