package bean;

import java.time.LocalDate;

// Lombox --> auto generate constructor, getter, setter. toString

public class Item {
	
	// Về mặt code --> khai báo các thuộc tính trong class
	// Về mặt dữ liệu --> khi tạo đối tượng lúc đó các thuộc tính mới đc cấp phát giá trị
	
	private Interger id;
	private String name;
	private LocalDate expiredDate
	
	public Item() {
	}

	public Item(int i, String name, LocalDate expiredDate) {
		this.id = i;
		this.name = name;
		this.expiredDate = expiredDate;
	}

	public Interger getId() {
		return id;
	}

	public void setId(Interger id) {
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
		return "Item [name=" + name + ", expiredDate=" + expiredDate + "]";
	}
	
	
	
	

}
