package bean;

public class Item {

	private int id;
	private String name;
	
	public Item() {
	}

	public Item(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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
		// nếu 2 đối tượng trỏ đến 1 ô nhớ, trùng địa chỉ
		if (this == o) {
			return true;
		}
		
		// yêu cầu phải là Item
		if (!(o instanceof Item)) {
			return false;
		}
		
		// 2 đối tượng đều là Item
		// 2 đối tượng equals nhau khi trùng id
		Item that = (Item)o;
		return this.getId() == that.getId();
	}
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + "]";
	}
	
	
}
