package bean;

public class Student {

	private Integer id;
	private String name;
	private Double theoPoint;
	private Double pracPoint;
	
	public Student() {
		
	}

	public Student(Integer id, String name, Double theoPoint, Double pracPoint) {
		this.id = id;
		this.name = name;
		this.theoPoint = theoPoint;
		this.pracPoint = pracPoint;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getTheoPoint() {
		return theoPoint;
	}

	public void setTheoPoint(Double theoPoint) {
		this.theoPoint = theoPoint;
	}

	public Double getPracPoint() {
		return pracPoint;
	}

	public void setPracPoint(Double pracPoint) {
		this.pracPoint = pracPoint;
	}

	public double avgPoint() {
		return (theoPoint + pracPoint) / 2;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", theoPoint=" + theoPoint + ", pracPoint=" + pracPoint + "]";
	}
	
}
