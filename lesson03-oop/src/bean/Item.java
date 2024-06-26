package bean;

import java.time.LocalDate;

// Lombok 
public class Item {
	
	// Về mặt code --> khai báo các thuộc tính trong class
	// Về mặt dữ liệu --> khi tạo đối tượng lúc đó các thuộc tính mới đc cấp phát giá trị
	
	private Integer id;
	private String name;
	private LocalDate expiredDate;
	
	public Item() {
	}

	public Item(Integer id, String name, LocalDate expiredDate) {
		this.id = id;
		this.name = name;
		this.expiredDate = expiredDate;
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