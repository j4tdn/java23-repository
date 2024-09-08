package pattern.builder;

import java.time.LocalDate;

/*
 * Builder pattern:
 * 
 * cách 2: trả về 1 immutable object, 0 sử dụng class builder
 */

public class User2 {
	private Integer id;
	private String name;
	private Integer age;
	private LocalDate startedDate;
	private String address;

	public static User2 of(Integer id, String name) {
		User2 user1 = new User2();
		user1.id = id;
		user1.name = name;
		return user1;
	}

	private User2() {
	}

	private User2 cloned() {
		User2 clone = new User2();
		clone.id = this.id;
		clone.name = this.name;
		clone.age = this.age;
		clone.startedDate = this.startedDate;
		clone.address = this.address;
		return clone;
	}
	//setter (s):
	public User2 id(Integer id) {
		User2 cloned = cloned();
		cloned.id = id;
		return cloned;
	}

	public User2 name(String name) {
		User2 cloned = cloned();
		cloned.name = name;
		return cloned;
	}

	public User2 age(Integer age) {
		User2 cloned = cloned();
		cloned.age = age;
		return cloned;
	}

	public User2 startedDate(LocalDate startedDate) {
		User2 cloned = cloned();
		cloned.startedDate = startedDate;
		return cloned;
	}

	public User2 address(String address) {
		User2 cloned = cloned();
		cloned.address = address;
		return cloned;
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
