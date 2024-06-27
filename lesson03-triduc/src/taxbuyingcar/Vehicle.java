package taxbuyingcar;

public class Vehicle {
	private String authorName;
	private String carType;
	private Integer xylanh;
	private Double charge;
	private Double tax;
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}
	
	public Vehicle(String authorName, String carType, Integer xylanh, Double charge) {
		super();
		this.authorName = authorName;
		this.carType = carType;
		this.xylanh = xylanh;
		this.charge = charge;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public Integer getXylanh() {
		return xylanh;
	}

	public void setXylanh(Integer xylanh) {
		this.xylanh = xylanh;
	}

	public Double getCharge() {
		return charge;
	}

	public void setCharge(Double charge) {
		this.charge = charge;
	}

	public Double getTax() {
		if(this.xylanh < 100)
			return 1d / 100d * charge;
		else
			if(this.xylanh < 200)
				return 3d / 100d * charge ;
			else
				return 5d * 100d * charge;
	}

	@Override
	public String toString() {
		return "Vehicle [authorName=" + authorName + ", carType=" + carType + ", xylanh=" + xylanh + ", charge="
				+ charge + ", tax=" + tax + "]";
	}

}
