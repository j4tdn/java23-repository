package pattern.builder;

import java.time.LocalDate;

/*
 Builder Pattern
 
 Cách 2: Trả về 1 mutable object, ko sử dụng class Builder
 
 Mutable: . gán xong --> cập nhật ô nhớ hiện tại
 */

public class User3 {

	private Integer id;
	private String name;
	private Integer age;
	private LocalDate startedDate;
	private String address;

	public static User3 of(Integer id, String name) {
		User3 user2 = new User3();
		user2.id = id;
		user2.name = name;
		return user2;
	}

	private User3() {
	}

	private User3 cloned() {
		User3 cloned = new User3();
		cloned.id = this.id;
		cloned.name = this.name;
		cloned.age = this.age;
		cloned.startedDate = this.startedDate;
		cloned.address = this.address;
		return cloned;
	}

	// setter(s)
	public User3 id(Integer id) {
		User3 cloned = cloned();
		cloned.id = id;
		return cloned;
	}

	public User3 name(String name) {
		User3 cloned = cloned();
		cloned.name = name;
		return cloned;
	}

	public User3 age(Integer age) {
		User3 cloned = cloned();
		cloned.age = age;
		return cloned;
	}

	public User3 startedDate(LocalDate startedDate) {
		User3 cloned = cloned();
		cloned.startedDate = startedDate;
		return cloned;
	}

	public User3 address(String address) {
		User3 cloned = cloned();
		cloned.address = address;
		return cloned;
	}

	// getter(s)
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
		return "User2 [id=" + id + ", name=" + name + ", age=" + age + ", startedDate=" + startedDate + ", address="
				+ address + "]";
	}
}
