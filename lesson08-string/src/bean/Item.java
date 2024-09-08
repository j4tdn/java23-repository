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

	public String getName() {
		return name;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// Nếu 2 đối tượng trỏ đến chung 1 ô nhớ
		if (this == obj) {
			return true;
		}

		if (obj instanceof Item) {
			if (((Item) obj).getId() == getId()) {
				return true;
			}
		}
		return false;
	}


}
