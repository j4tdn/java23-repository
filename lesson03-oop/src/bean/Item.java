package bean;

import java.time.LocalDate;

// Lombok --> auto generate 

public class Item {

	// Về mặt code --> khai báo các thuộc tính trong class
	// Về mặt dữ liệu --> khi tạo đối tượng lúc đó các thuộc tính mới được cập nhật giá trị
	private Integer id;
	private String name;
	private LocalDate expriredDate;
	
	public Item() {
	}

	public Item(Integer id, String name, LocalDate expriredDate) {
		this.id = id;
		this.name = name;
		this.expriredDate = expriredDate;
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

	public LocalDate getExpriredDate() {
		return expriredDate;
	}

	public void setExpriredDate(LocalDate expriredDate) {
		this.expriredDate = expriredDate;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", expriredDate=" + expriredDate + "]";
	}
	
	
	
}
