package bean;

public class Student {

	private Integer id;
	private String name;
	private Float theoreticalPoint;
	private Float practicePoint;

	public Student() {
	}

	public Student(Integer id, String name, Float theoreticalPoint, Float practicePoint) {
		this.id = id;
		this.name = name;
		this.theoreticalPoint = theoreticalPoint;
		this.practicePoint = practicePoint;
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

	public Float getTheoreticalPoint() {
		return theoreticalPoint;
	}

	public void setTheoreticalPoint(Float theoreticalPoint) {
		this.theoreticalPoint = theoreticalPoint;
	}

	public Float getPracticePoint() {
		return practicePoint;
	}

	public void setPracticePoint(Float practicePoint) {
		this.practicePoint = practicePoint;
	}

	@Override
	public String toString() {
		return "Students [id=" + id 
				+ ", name=" + name 
				+ ", theoreticalPoint=" 
				+ theoreticalPoint 
				+ ", practicePoint="
				+ practicePoint + "]";
	}

	public Float calculateAvgPoint() {
		return (theoreticalPoint + practicePoint)/2;
	}

}