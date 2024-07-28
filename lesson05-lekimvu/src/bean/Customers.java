package bean;

public class Customers {

	private String cusID;
	private String name;
	private String tele;
	private String address;
	
	public Customers() {

	}

	public Customers(String cusID, String name, String tele, String address) {
		this.cusID = cusID;
		this.name = name;
		this.tele = tele;
		this.address = address;
	}

	public String getCusID() {
		return cusID;
	}

	public void setCusID(String cusID) {
		this.cusID = cusID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTele() {
		return tele;
	}

	public void setTele(String tele) {
		this.tele = tele;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customers [cusID=" + cusID + ", name=" + name + ", tele=" + tele + ", address=" + address + "]";
	}
	
	
}

