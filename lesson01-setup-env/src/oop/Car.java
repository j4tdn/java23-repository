package oop;

public class Car {
	private String name;
	private String phone;
	private String address;
	private Double price;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Car(String name, String phone, String address, Double price) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.price = price;
	}

	@Override
	public String toString() {
		return "ItemEx01 [name=" + name + ", phone=" + phone + ", address=" + address + ", price=" + price + "]";
	}
	
}
