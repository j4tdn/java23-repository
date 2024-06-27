package bean_ex02;

public class Vehicle {
	private String ownerName;
    private String model;
    private int volume;
    private double price;

    public Vehicle() {
	}

	public Vehicle(String ownerName, String model, int volume, double price) {
		this.ownerName = ownerName;
		this.model = model;
		this.volume = volume;
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

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [ownerName=" + ownerName + ", model=" + model + ", volume=" + volume + ", price=" + price + "]";
	}
    
}
