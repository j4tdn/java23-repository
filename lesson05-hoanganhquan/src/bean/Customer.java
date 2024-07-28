package bean;

public class Customer {
	private String customerId;
	private String name;
	private String phoneNumber;
	private String address;
	
	public Customer() {
	}
	
	public Customer (String customerId, String name, String phoneNumber, String address ) {
		this.customerId = customerId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public String getphoneNumber() {
		return phoneNumber;
	}
	
	public String getCustomerId() {
		return customerId;
	}
	
	public String getAddress() {
		return address;
	}
	
	
	
}	
