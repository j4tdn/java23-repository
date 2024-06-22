package bean;

import java.time.LocalDate;

public class Item {
	private Integer id;
	private String name;
	private LocalDate expiredDate;
	
	public Item(Integer id, String name, LocalDate expiredDate) {
		this.id = id;
		this.name = name;
		this.expiredDate = expiredDate;
	}
	
	public Item()
	{
		
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

	public LocalDate getExpiredDate() {
		return expiredDate;
	}

	public void setExpiredDate(LocalDate expiredDate) {
		this.expiredDate = expiredDate;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", expiredDate=" + expiredDate + "]";
	}
	
	
	
}
