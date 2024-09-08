package pattern.builder;

import java.time.LocalDate;

public class User {

	/*
	 * 
	 */
	private Integer id;
	private String name;
	private Integer age;
	private LocalDate startedDate;
	private String address;
	
	public User() {
		
	}
	
	public User(Integer id, String name, Integer age, LocalDate startedDate, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.startedDate = startedDate;
		this.address = address;
	}	
		
	public User(Integer id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
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

	public LocalDate getStartedDate() {
		return startedDate;
	}

	public void setStartedDate(LocalDate startedDate) {
		this.startedDate = startedDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}