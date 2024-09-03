package pattern.builder;

import java.time.LocalDate;

public class User1 {

	
	private Integer id;
	private String name;
	private Integer age;
	private LocalDate startedDate;
	private String address;
	
	
	// Sử dụng builder để tạo ra đối tượng cho user 1
	private User1(){
		
	}
	private User1(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.age = builder.age;
		this.startedDate = builder.startedDate;
		this.address = builder.address;
		
		
	}
	
	/*
	  Khởi tạo
	 */
	
	public static Builder builder() {
		return new Builder();
	}
	
	//Chỉ getter, ko có setter(nhờ Builder set ban đầu)
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
	

	
	//static User1.Builder
	//non new User1().Builder
	public static class Builder {
		//Dùng để tạo giá trị
		private Integer id;
		private String name;
		private Integer age;
		private LocalDate startedDate;
		private String address;
	
		//Chỉ sử dụng trong phạm vi của Builder,User1
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
			return new User1(this);
		}
	}
	
}
