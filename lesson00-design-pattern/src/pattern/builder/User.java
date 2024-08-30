package pattern.builder;

import java.time.LocalDateTime;

/*
 
 Code thông thường chưa dùng Builder Pattern
 
 */
public class User {

	private Integer id;
	private String name;
	private Integer age;
	private LocalDateTime startedDate;
	private String address;
	
	public User() {
	}
	
	
	
	public User(Integer id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}



	public User(Integer id, String name, Integer age, LocalDateTime startedDate, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.startedDate = startedDate;
		this.address = address;
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public LocalDateTime getStartedDate() {
		return startedDate;
	}

	public void setStartedDate(LocalDateTime startedDate) {
		this.startedDate = startedDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
		public String toString() {
			return super.toString();
		}
	
}
