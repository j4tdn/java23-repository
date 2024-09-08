package pattern.builder;

import java.time.LocalDate;

public class User1 {
	
	private Integer id;
	private String name;
	private Integer age;
	private LocalDate startedDate;
	private String address;
	
	private User1( ) {
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
