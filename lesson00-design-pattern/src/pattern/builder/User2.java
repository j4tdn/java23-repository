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
	
	// Sử dụng Builder để tạo ra đối tượng cho User1
	private User2() {
	}
	
	private User2(Builder builder) {
	}
	
	// Setter(s)
	
	
	
	// Getter(s)
//	public Integer getId() {
//		return id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public Integer getAge() {
//		return age;
//	}
//
//	public LocalDate getStartedDate() {
//		return startedDate;
//	}
//
//	public String getAddress() {
//		return address;
//	}
	@Override
	public String toString() {
		return "User1 [id=" + id + ", name=" + name + ", age=" + age + ", startedDate=" + startedDate + ", address="
				+ address + "]";
	}
	// user1.Builder
	public static class Builder {
		private Integer id;
		private String name;
		private Integer age;
		private LocalDate startedDate;
		private String address;
		
		
		
		// Chỉ sử dụng trong phạm vi của Builder, User1
		private Builder() {
		}

		public Builder withId(Integer id) {
			this.id = id;
			return this;
		}

		public Builder withName(String name) {
			this.name = name;
			return this;
		}

		public Builder withAge(Integer age) {
			this.age = age;
			return this;
		}

		public Builder withStartedDate(LocalDate startedDate) {
			this.startedDate = startedDate;
			return this;
		}

		public Builder withAddress(String address) {
			this.address = address;
			return this;
		}
		
		public User1 build() {
			
		}
		
	}
	
	
}

