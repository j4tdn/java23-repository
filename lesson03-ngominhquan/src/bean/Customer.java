package bean;

public class Customer {
	private String id;
	private String name;
	private String phone;
	private String addressl;
	
	public Customer() {
	}

	public Customer(String id, String name, String phone, String addressl) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.addressl = addressl;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddressl() {
		return addressl;
	}

	public void setAddressl(String addressl) {
		this.addressl = addressl;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phone=" + phone + ", addressl=" + addressl + "]";
	}

}
