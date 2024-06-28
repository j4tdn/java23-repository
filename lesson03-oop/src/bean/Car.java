package bean;

/**
 * Car là 1 class
 *     là 1 KDL
 */

public class Car {

	// attribute (thuộc tính)
	// mỗi đối tượng đc tạo ra từ class Car luôn có 4 thông tin
	// mỗi giá trị của KDL Car sẽ luôn có 4 thông tin này
	private String model; // hãng xe
	private String name;  // tên xe
	private String color; // màu xe
	private Double price; // giá xe
	
	// Khi gọi hàm khởi tạo
	// Tạo ra đối tượng cho class Car
	
	// Constructor with no parameter
	public Car() {
	}
	
	// Constructor with all parameters
	public Car(String model, String name, String color, Double price) {
		this.model = model;
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	// c1.name = "A22";
	// c1.setName("A22")
	public void setName(String name) {
		this.name = name;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setPrice(Double price) {
		this.price = this.price * 2;
	}
	
	public void doublePrice() {
		this.price = this.price * 2;
	}
	
	// c1.price
	// c1.getPrice()
	public Double getPrice() {
		return price;
	}
	
	//sout(c1) --> sout(c1.toString()) --> this = c1
	//sout(c2) --> sout(c2.toString()) --> this = c2
		
	@Override
	public String toString() {
		return model + ", " + name + ", " + color + ", " + price;
	}
		
}
