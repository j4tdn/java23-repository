package bean;

public class Student {
	
	private int id;
	private String fullName;
	private String grade = "";
	public Student(int i, String fullName, String grade) {
		this.id = i;
		this.fullName = fullName;
		this.grade = grade;
	}
	public int getId() {
		return id;
	}
	public String getFullName() {
		return fullName;
	}
	public String getGrade() {
		return grade;
	}
	@Override
	public String toString() {
		return "Student(" + getId() + ", '" + getFullName() + "', " + getGrade() + ")";
	}
	
	
	
}
