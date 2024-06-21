package bean;

/*
 * Car là 1 class
 * 		là 1 KDL
 */
public class CarAdv {
	
	// attribute (thuộc tính)
	// mỗi đối tượng đuọc tạo ra từ class Car luôn có 4 thông tin
	// mỗi giá trị của KDL Car luôn có 4 thông tin
	public static String model; // dung chung gia tri cho all doi tuong
	private String name;
	private String color;
	private Double price; 
	
	// Khi gọi hàm khởi tạo 
	// Tạo ra đối tượng cho class C
	// Constructor with no parameter
	
	public CarAdv () {
		
	}
	
	
	// Constructor with all parameters
	
	public CarAdv ( String name, String color, Double price) {
		
		this.name = name;
		this.color = color;
		this.price = price;
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
