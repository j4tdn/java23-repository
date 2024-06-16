package bean;

/*
 * Car là 1 class
 * 	   là 1 KDL
 */

public class CarAdv {

	// attribute(thuộc tính)
	// mỗi đối tượng được tạo ra từ class Car luôn có 4 thông tin
	// mỗi giá trị của KDL Car luôn có 4 thông tin
	public static String model; // hãng xe, dùng chung giá trị cho tất cả các đối tượng
	private String name;  // tên xe
	private String color; // màu xe
	private Double price; // giá xe
	
	// Khi gọi hàm khởi tạo
	// Tạo ra đối tượng cho class Car
	
	// Constructor with no parameter
	public CarAdv() {
	}
	
	// Constructor with all parameter
	public CarAdv(String name, String color, Double price) {
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	// c1.name = "A22";
	
	// c1 setName("A22")
	public void setName(String name) {
		this.name = name;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	// c1.price
	// c1.getPrice
	public double getPrice() {
		return price;
	}
	
	public void doublePrice() {
		this.price = this.price * 2;
	}
	
	// sysout(c1) --> sysout(c1.toString()) --> this = c1
	// sysout(c2) --> sysout(c2.toString()) --> this = c2
	
	@Override
	public String toString() {
		return model + ", " + name + ", " + color + ", " + price;
	}
	
}
