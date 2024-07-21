package ex01;

public class Student {
	private int id;
	private String name;
	private float theoreticalPoint;
	private float practicePoint;
	
	public Student() {
	
	}

	public Student(int id, String name, float theoreticalPoint, float practicePoint) {
		this.id = id;
		this.name = name;
		this.theoreticalPoint = theoreticalPoint;
		this.practicePoint = practicePoint;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getTheoreticalPoint() {
		return theoreticalPoint;
	}

	public void setTheoreticalPoint(float theoreticalPoint) {
		this.theoreticalPoint = theoreticalPoint;
	}

	public float getPracticePoint() {
		return practicePoint;
	}

	public void setPracticePoint(float practicePoint) {
		this.practicePoint = practicePoint;
	}
	
	public float getAverage() {
		return ((getPracticePoint() + getTheoreticalPoint())/2);
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", theoreticalPoint=" + theoreticalPoint + ", practicePoint="
				+ practicePoint + "]";
	}
	
}