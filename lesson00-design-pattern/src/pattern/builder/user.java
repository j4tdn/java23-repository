package pattern.builder;

import java.time.LocalDate;

// code thông thường
public class user {
	
	private Integer id;
	private String name;
	private Integer age;
	private LocalDate startDate;
	private String address;

	private user () {		
	}

	private Integer getId() {
		return id;
	}

	private void setId(Integer id) {
		this.id = id;	
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private Integer getAge() {
		return age;
	}

	private void setAge(Integer age) {
		this.age = age;
	}

	private LocalDate getStartDate() {
		return startDate;
	}

	private void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	private String getAddress() {
		return address;
	}

	private void setAddress(String address) {
		this.address = address;
	}
	
	
}
