package bean;

public class Car {

	// attribute(thuộc tính)
	// mỗi đối tượng được tạo ra từ class Car luôn có 4 thông tin
	// mỗi giá trị của KDL Car luôn có 4 thông tin
	private String model; // hãng xe
	private String name; // tên xe
	private String color; // màu sắc
	private Double price; // giá xe

	// Constructor with no parameter
	public Car() {
	}

	public Car(String name, String model, String color, double price) {
		super();
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
	public void doublePrice() {
		this.price = this.price * 2;
	}

	@Override
	public String toString() {
		return model + ", " + name + ", " + color + ", "  + price ;
	}

}
