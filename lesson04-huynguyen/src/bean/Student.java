package bean;

public class Student {
	private Integer id;
	private String name;
	private Float theoreticalpoint;
	private Float practicepoint;
	public Student() {
	}
	public Student(Integer id, String name, Float theoreticalpoint, Float practicepoint) {
		this.id = id;
		this.name = name;
		this.theoreticalpoint = theoreticalpoint;
		this.practicepoint = practicepoint;
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
	public Float getTheoreticalpoint() {
		return theoreticalpoint;
	}
	public void setTheoreticalpoint(Float theoreticalpoint) {
		this.theoreticalpoint = theoreticalpoint;
	}
	public Float getPracticepoint() {
		return practicepoint;
	}
	public void setPracticepoint(Float practicepoint) {
		this.practicepoint = practicepoint;
	}
	public Float calculateAvgPoint() {
		return (theoreticalpoint + practicepoint)/2;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", theoreticalpoint=" + theoreticalpoint + ", practicepoint="
				+ practicepoint + "]";
	}
	
	
	
	
}
