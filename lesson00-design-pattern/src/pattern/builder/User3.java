package pattern.builder;

import java.time.LocalDate;

/*
  Builder Pattern
  
  Cách 2 : Trả về 1 mutalbe object, không sử dụng class Builder
  
  Mutable : .  gán xong  --> cập nhật ô nhớ hiện tại 
 */

public class User3 {
	private Integer id;
	private String name;
	private Integer age;
	private LocalDate startedDate;
	private String address;

	public static User3 of(Integer id, String name) {
		User3 user2 = new User3();
		user2.id=id;
		user2.name=name;
		return user2;
	}
	
	private User3() {
	}
	
	//id = 1
	// name = A1
	//age(28)
	public  User3 clone() {
		User3 cloned = new User3();
		cloned.id = this.id;
		cloned.name = this.name;
		cloned.age = this.age;
		cloned.startedDate = this.startedDate;
		cloned.address = this.address;
		return cloned;
	}

	// setter(s)
	public User3 withId(Integer id) {
		User3 cloned = clone();
		cloned.id= id;
		return cloned;
	}

	public User3 withName(String name) {
		User3 cloned = clone();
		cloned.name= name;
		return cloned;
	}

	public User3 withAge(Integer age) {
		User3 cloned = clone();
		cloned.age= age;
		return cloned;
	}

	public User3 withStartedDate(LocalDate startedDate) {
		User3 cloned = clone();
		cloned.startedDate= startedDate;
		return cloned;
	}

	public User3 withAddress(String address) {
		User3 cloned = clone();
		cloned.address= address;
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
