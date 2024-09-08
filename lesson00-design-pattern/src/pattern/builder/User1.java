package pattern.builder;

import java.time.LocalDate;

/*
 * Builder pattern:
 * 
 * cách 2: trả về 1 immutable object, 0 sử dụng class builder
 */

public class User1 {
	private Integer id;
	private String name;
	private Integer age;
	private LocalDate startedDate;
	private String address;

	public static User1 of(Integer id, String name) {
		User1 user1 = new User1();
		user1.id = id;
		user1.name = name;
		return user1;
	}

	private User1() {
	}
	//setter (s):
	public User1 id(Integer id) {
		this.id = id;
		return this;
	}

	public User1 name(String name) {
		this.name = name;
		return this;
	}

	public User1 age(Integer age) {
		this.age = age;
		return this;
	}

	public User1 startedDate(LocalDate startedDate) {
		this.startedDate = startedDate;
		return this;
	}

	public User1 address(String address) {
		this.address = address;
		return this;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public LocalDate getStartedDate() {
		return startedDate;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "User1 [id=" + id + ", name=" + name + ", age=" + age + ", startedDate=" + startedDate + ", address="
				+ address + "]";
	}

}
