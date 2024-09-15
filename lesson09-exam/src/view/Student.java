package view;

public class Student {
	int id;
	String name;
	HL HL;
	
	public Student(int id, String name, view.HL hL) {
		super();
		this.id = id;
		this.name = name;
		this.HL = hL;
	}
	
	

	public int getId () {
		return id;
	}
	
	public String getName () {
		return name;
	}
	
	public view.HL getHL () {
		return HL;
	}
	
}
