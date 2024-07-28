package bean;

public class Customer {

	private String customerID;
	private String name;
	private String phone;
	private String address;
	
	public Customer() {
	}

	public Customer(String customerID, String name, String phone, String address) {
		this.customerID = customerID;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
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

	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", name=" + name + ", phone=" + phone + ", address=" + address
				+ "]";
	}
	
	
}
