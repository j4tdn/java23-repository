package bean;

public class Customer {
	private String idCus;
	private String name;
	private String phone;
	private String address;
	
	public Customer() {
	}
	
	public Customer(String idCus, String name, String phone, String address) {
		this.idCus = idCus;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public String getIdCus() {
		return idCus;
	}

	public void setIdCus(String idCus) {
		this.idCus = idCus;
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
	
}
