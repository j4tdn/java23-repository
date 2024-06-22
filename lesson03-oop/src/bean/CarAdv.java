package bean;

public class CarAdv {
	
	public static String model; //dùng chung cho tất cả đối tượng nếu có static
	
	private String name;
	private String color;
	private double price;
	
	public CarAdv() {
		
	};
	
	public CarAdv( String name, String color, double price) {
		this.name = name;
		this.color = color;
		this.price = price;
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
