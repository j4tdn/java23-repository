package entity;

public class Student {
	private Integer id;
	private String name;
	private char rank;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(Integer id, String name, char rank) {
		this.id = id;
		this.name = name;
		this.rank = rank;
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

	public char getRank() {
		return rank;
	}

	public void setRank(char rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rank=" + rank + "]";
	}

}
