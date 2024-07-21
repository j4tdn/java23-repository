package bean;

public class Student {
	private Integer id;
	private String name;
	private Double theoretical_point;
	private Double Practice_points;
	
	public Student() {
	}
	
	public Student(Integer id, String name, Double theoretical_point, Double practice_points) {
		super();
		this.id = id;
		this.name = name;
		this.theoretical_point = theoretical_point;
		Practice_points = practice_points;
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

	public Double getTheoretical_point() {
		return theoretical_point;
	}

	public void setTheoretical_point(Double theoretical_point) {
		this.theoretical_point = theoretical_point;
	}

	public Double getPractice_points() {
		return Practice_points;
	}

	public void setPractice_points(Double practice_points) {
		Practice_points = practice_points;
	}

	@Override
	public String toString() {
		return "Ma Sinh Vien: " + id + ", Ho va Ten: " + name + ", Diem li thuyet = " + theoretical_point
				+ ", Diem thuc hanh = " + Practice_points + "]" + "Diem trung binh = " + Medium_score();
	}
	public double Medium_score() {
		return (theoretical_point + Practice_points) / 2;
	}
	
}
