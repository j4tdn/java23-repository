package bean;

public class Student {

	private int id;
	private String name;
	private char rating;
	
	public Student() {
	}

	public Student(int id, String name, char rating) {
		this.id = id;
		this.name = name;
		this.rating = rating;
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

	public char getRating() {
		return rating;
	}

	public void setRating(char rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Student: id=" + id + ", name=" + name + ", rating=" + rating + "\n";
	}
}
