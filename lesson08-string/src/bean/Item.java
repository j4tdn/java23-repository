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
		if(this == o) {
			return true;
		}
		//Yêu cầu phải là Item 
		if(!(o instanceof Item)) {
			return false ;
			
		}
		Item that = (Item)o;
		
		return getId()== that.getId();
 	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + "]";
	}
	
}
