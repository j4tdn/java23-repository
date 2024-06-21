package bean;
/*
 	Car là 1 class
 		là 1 KDL
 */
public class CarAdv {
	// attribute(thuộc tính)
	// mỗi đối tượng dc tạo ra từ class (KDL) car có 4 thông tin
	public static String model;
	private String name;
	private String color;
	private Double price; //giá xe
	
	
	// Constructor with no parameter
	public CarAdv() {
	}
	
	// Constructor with all parameter
	public CarAdv(String name, String color, Double price) {
		//this.model = model;   model đã được khai báo static(dùng chung) nên ko cần truyền cho từng đối tượng
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	
	public String getModel() {
		return model;
	}

	// c1.setName("A22")
	public void setName(String name) {
		this.name = name;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void doublePrice() {
		this.price = this.price*2;
	}
	@Override
	public String toString() {
		return model + ", " + name + ", " + color + ", " + price;
	}
	
	
}
