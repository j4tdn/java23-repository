package bean;

/*
 *  Car - một class = một KDL
 *  
 */
public class CarAdvance {
	//attributes - thuộc tính
	// mỗi đối tượng được tạo ra từ class Car luôn có 4 thông tin
	// mỗi giá trị của KDL car luôn có 4 thông tin
	public static String model;
	private String name;
	private String color;
	private Double price;
	// Khi gọi hàm khởi tạo - > tạo ra đối tượng cho class Car
	// Constructor 
	public CarAdvance() {
		
	}

	public CarAdvance( String name, String color, Double price) {
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
	public void doublePrice() {
		this.price*=2;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", name=" + name + ", color=" + color + ", price=" + price + "]";
	}
	
}
