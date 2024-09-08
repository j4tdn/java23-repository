package pattern.builder;

import java.time.LocalDate;

/*
 * Builder pattern:
 * 
 * C1: tạo đối tượng cho User
 *  --> Bên trong class User tạo ra class Builder
 *  --> Sử dụng Builder để build ra đối tượng User
 *  --> Builder chứa các thông tin User
 *  --> Sau khi with thông tin cho Builder --> convert sang User
 *  
 *  User lúc là immutable, nhận thông tin từ Builder
 */

public class User {
	private Integer id;
	private String name;
	private Integer age;
	private LocalDate startedDate;
	private String address;

	// sử dụng builder --> khoá constructor
	private User() {
	}

	private User(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.age = builder.age;
		this.startedDate = builder.startedDate;
		this.address = builder.address;
	}


	public static Builder builder() {
		return new Builder();
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
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", startedDate=" + startedDate + ", address="
				+ address + "]";
	}

	public static class Builder {
		private Integer id;
		private String name;
		private Integer age;
		private LocalDate startedDate;
		private String address;
		
		// chỉ sử dụng trong phạm vi của Builder, User1
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

		public User build() {
			return new User(this);
		}
	}

}
