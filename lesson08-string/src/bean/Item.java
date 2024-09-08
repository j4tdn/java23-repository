package bean;

public class Item {
	private Integer id;
	private String name;
	
	public Item() {
	
	}
	
	
	public Item(Integer id, String name) {
		this.id = id;
		this.name = name;
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

	@Override
	public boolean equals(Object o) {
		// nếu 2 đối tượng đều trỏ đến 1 ô nhớ ~ trùng địa chỉ
		if (this == o) {
			return true;
		}
		if (!( o instanceof Item)) {
			return false;
		}
		Item that = (Item) o;
		return this.getId() == that.getId();
		
 	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + "]";
	}
	
}
