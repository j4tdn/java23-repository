package bean;

public class Student {
	
	private int id;
	private String name;
	private Rating rating;
	
	public Student() {
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

	public Rating getRating() {
		return rating;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}

	public Student(int id, String name, Rating rating) {
		this.id = id;
		this.name = name;
		this.rating = rating;
	}	
	
	@Override
	public String toString() {
		return "Id: " + id + ", Họ tên: " + name + ", Xếp loại: " + rating + "\n"; 
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		
		else if (this == obj)
			return true;
		
		else if (obj instanceof Student) {
			Student s = (Student) obj;
			if (this.id == s.id)
				return true;
		}
		return false;
	}

}