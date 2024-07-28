package bean;

public class Customer {
	private String id;
	private String name;
	private String phoneNumber;
	private String Addr;
	
	public Customer() {
	}

	public Customer(String id, String name, String phoneNumber, String addr) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		Addr = addr;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddr() {
		return Addr;
	}

	public void setAddr(String addr) {
		Addr = addr;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", Addr=" + Addr + "]";
	}
	
	
}
