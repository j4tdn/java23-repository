package pattern.builder;

import java.time.LocalDate;
/*
 	Builder Pattern
  		Cách 2:
  				-> Trả vè 1 mutable object
  				-> Ko sử dụng class Builder để build ra đối tượng của User1
  				-> Builder chứa đầy đủ các thuộc tính của User1
  				-> sau khi set các thông tin cho Builder -> convert sang User1
  				User1 lúc là immutable, nhận thông tin từ Builder (immutable là .. của java)
 */
public class User2 {
	
	private Integer id;
	private String name;
	private Integer age;
	private LocalDate startedDate;
	private String address;
	
	public static User2 of(Integer id, String name) {
		User2 user2 = new User2();
		user2.id = id;
		user2.name = name;
		return user2;
	}
	
	private User2() {
	}
	
	// setter(s)
	public User2 id(Integer id) {
		this.id = id;
		return this;
	}

	public User2 name(String name) {
		this.name = name;
		return this;
	}

	public User2 age(Integer age) {
		this.age = age;
		return this;
	}

	public User2 startedDate(LocalDate startedDate) {
		this.startedDate = startedDate;
		return this;
	}

	public User2 address(String address) {
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

