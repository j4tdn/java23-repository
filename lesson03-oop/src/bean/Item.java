package bean;

import java.time.LocalDate;

// Lombok --> auto generate constructor, getter, setter, toString
public class Item {	
	
	private Integer id;
	private String name;
	private LocalDate expireDate;
	
	public Item() {
	}

	public Item(Integer id, String name, LocalDate expireDate) {
		this.id = id;
		this.name = name;
		this.expireDate = expireDate;
	}
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(LocalDate expireDate) {
		this.expireDate = expireDate;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", expireDate=" + expireDate + "]";
	}


	
	
}
