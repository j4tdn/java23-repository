package pattern.builder;

import java.time.LocalDate;

/*

Builder Pattern

Cách 1: Để tạo đối tượng cho class User1
        --> Bên trong class User1 tạo ra class gọi là Builder
        --> Sử dụng Builder để build ra đối tượng của User1
        --> Builder chứa đầy đủ các thuộc tính của User1
        --> sau khi set các thông tin cho Builder --> convert sang User1
        User1 lúc là immutable, nhận thông tin từ Builder
        

*/
public class User1 {
	
	private Integer id;
	private String name;
	private Integer age;
	private LocalDate startedDate;
	private String address;
	
	// Sử dụng Builder để tạo ra đối tượng cho User1
	private User1() {
	}
	
	private User1(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.age = builder.age;
		this.startedDate = builder.startedDate;
		this.address = builder.address;
	}
	
	/**
	 * Khởi tạo Builder cho User 1
	 * @return
	 */
//	public static Builder builder() {
//		return new Builder();
//	}
	
	/**
	 * Khởi tạo Builder cho User 1
	 * @return
	 */
	public static Builder builder(Integer id) {
		return new Builder(id);
	}

	// Chỉ có getter, ko có setter(nhờ Builder set ban đầu)
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
	
	public static class Builder {
		private Integer id;
		private String name;
		private Integer age;
		private LocalDate startedDate;
		private String address;
		
		// Chỉ sử trong phạm vi của Builder, User1
		// private Builder() {
		// }
		
		private Builder(Integer id) {
			this.id = id;
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
			return new User1(this);
		}
	}
	
}