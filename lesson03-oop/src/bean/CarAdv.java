package bean;

public class CarAdv {
	public static String model; // Hãng xe dùng chung cho tất cả giá trị
	private String name; // tên xe
	private String color; // màu xe
	private Double price; // giá xe

//	Constructor with no parameter
	public CarAdv() {

	}

//	Constructor with all parameters
	public CarAdv(String name, String color, Double price) {
		this.name = name;
		this.color = color;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	// c1.name = "A22"
//	c1.setName("A22")
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

	public void doublePrice() {
		this.price = this.price * 2;

	}

	public void setPrice(Double price) {
		this.price = price;
	}

//	sout(c1) --> sout(c1.toString())  --> this = c1
//	sout(c2) --> sout(c2.toString())  --> this = c2

	@Override
	public String toString() {
		return model + "," + name + "," + color + "," + price;

	}

}
