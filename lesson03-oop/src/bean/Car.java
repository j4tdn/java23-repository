package bean;

//Car là 1 class, KDL 

public class Car {
	//attribute
	private String model;
	private String name;
	private String color;
	private double price;
	
	public Car() {
		
	};
	
	public Car(String model, String name, String color, double price) {
		this.model = model;
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Double doublePrice() {
		return this.price * 2;
	}
	
	@Override
	public String toString() {
		return model + ", " + name + ", " + color + ", " + price;
	}
}
