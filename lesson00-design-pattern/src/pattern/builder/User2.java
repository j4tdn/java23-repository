package pattern.builder;

import java.time.LocalDate;

	/*
	Builder Pattern
	Cach 2: Tra ve 1 mutable object, ko su dung class Builder
 */
public class User2 {

	private Integer id;
	private String name;
	private Integer age;
	private LocalDate startedDate;
	private String address;
	
	private User2() {
		// TODO Auto-generated constructor stub
	}
