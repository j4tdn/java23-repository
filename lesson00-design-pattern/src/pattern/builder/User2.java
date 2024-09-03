package pattern.builder;

import java.time.LocalDate;

/*
  Builder Pattern
  
  Cách 2 : Trả về 1 mutalbe object, không sử dụng class Builder
  
  Mutable : .  gán xong  --> cập nhật ô nhớ hiện tại 
 */

public class User2 {
	private Integer id;
	private String name;
	private Integer age;
	private LocalDate startedDate;
	private String address;

	public static User2 of(Integer id, String name) {
		User2 user2 = new User2();
		user2.id=id;
		user2.name=name;
		return user2;
	}
	
	private User2() {
	}
	
	

	// setter(s)
	public User2 withId(Integer id) {
		this.id = id;
		return this;
	}

	public User2 withName(String name) {
		this.name = name;
		return this;
	}

	public User2 withAge(Integer age) {
		this.age = age;
		return this;
	}

	public User2 withStartedDate(LocalDate startedDate) {
		this.startedDate = startedDate;
		return this;
	}

	public User2 withAddress(String address) {
		this.address = address;
		return this;
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
