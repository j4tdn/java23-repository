package bean;

public class Item {

	private Integer id;
	private String name;
	
	public Item() {
	}

	public Item(Integer id, String name) {
		super();
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
		// nếu hai đối tượng đều trỏ nến 1 ô nhớ, trùng địa chỉ --> true
		if(this == o) {
			return true;
		}
		
		// yêu cầu phải là Item
		if(!(o instanceof Item)) {
			return false;
		}
		
		// 2 đối tượng đều là Item
		// 2 đối tượng equals nhau khi trùng id
		Item that = (Item) o;
		
		/*
		if(getId() == null || that.getId() == null) {
			return false;
		}
		*/
		
		return getId() == that.getId();
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + "]";
	}
	
}
