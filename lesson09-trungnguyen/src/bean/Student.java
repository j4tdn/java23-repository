package bean;

public class Student {
	private int id;
	private String name;
	private Score score;
	public Student() {

	}
	
	public Student(int id, String name, Score score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Score getScore() {
		return score;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj.getClass() != this.getClass()) {
			return false;
		}
		Student student = (Student) obj;
		return student.getId() == this.getId();
	}

	@Override
	public String toString() {
		return "\nStudent [id=" + id + ", name=" + name + ", score=" + score + "]";
	}
	 
}
