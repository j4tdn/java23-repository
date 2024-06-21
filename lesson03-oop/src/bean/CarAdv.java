package bean;

/*
 Car la 1 class
     la 1 KDL
 */

public class CarAdv {

	// attribute(thuoc tinh)
	// moi doi tuong dc tao ra tu class Car luon co 4 thong tin
	// moi gia tri cua KDL Car luon co 4 thong tin
	public static String model; //hang xe, dung chung gia tri cho tat ca doi tuong
	private String name; //ten xe
	private String color; //mau sac
	private Double price; //gia xe
	
	
	// Khi goi ham khoi tao
	// Tao ra doi tuong cho class Car
	
	// Constructor with no parameter
	public CarAdv() {
		
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
		this.price = price;
	}
	
	public void doublePrice() {
		this.price = this.price * 2;
	}
	
	public Double getPrice() {
		return price;
	}
	
	// Constructor with all parameters
	public CarAdv(String name, String color, Double price) {
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	// sout(c1) --> sout(c1.toString()) --> this = c1
	// sout(c2) --> sout(c2.toString()) --> this = c2
	@Override
	public String toString() {
		return model + ", " + name + ", " + color + ", " + price;
	}
}
