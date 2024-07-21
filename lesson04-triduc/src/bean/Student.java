package bean;

public class Student {
	private Integer id;
	private String name;
	private Double theoreticalPoint;
	private Double practicalPoint;
	
	public Student() {
	}
	
	public Student(Integer id, String name, Double theoreticalPoint, Double practicalPoint) {
		this.id = id;
		this.name = name;
		this.theoreticalPoint = theoreticalPoint;
		this.practicalPoint = practicalPoint;
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
	public Double getTheoreticalPoint() {
		return theoreticalPoint;
	}
	public void setTheoreticalPoint(Double theoreticalPoint) {
		this.theoreticalPoint = theoreticalPoint;
	}
	public Double getPracticalPoint() {
		return practicalPoint;
	}
	public void setPracticalPoint(Double practicalPoint) {
		this.practicalPoint = practicalPoint;
	}
	
	public Double getAvgPoint() {
		return (this.getPracticalPoint() + this.getTheoreticalPoint()) / 2;
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", theoreticalPoint=" + theoreticalPoint + ", practicalPoint="
				+ practicalPoint + "]";
	}
	
}
