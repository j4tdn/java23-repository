package bean;

/*
 * Car là 1 class
 * 		là 1 KDL
 */
public class Car {
	
	// attribute (thuộc tính)
	// mỗi đối tượng đuọc tạo ra từ class Car luôn có 4 thông tin
	// mỗi giá trị của KDL Car luôn có 4 thông tin
	private String model;
	private String name;
	private String color;
	private Double price; 
	
	// Khi gọi hàm khởi tạo 
	// Tạo ra đối tượng cho class C
	// Constructor with no parameter
	
	public Car () {
		
	}
	
	
	// Constructor with all parameters
	
	public Car (String model, String name, String color, Double price) {
		this.model = model;
		this.name = name;
		this.color = color;
		this.price = price;
	}
	public void setModel (String model) {
		this.model = model;
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setPrice (Double price) {
		this.price = price;
	}	
	public Double getPrice() {
		return price;
	}
	public void doublePrice() {
		this.price = this.price *2;
	}
	
	@Override
	public String toString () {
		return model + ", " + name + ", " + color + " , " + price;
	}
}
